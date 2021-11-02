package JDBC.H2;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import java.sql.*;

public class H2 {

    public static Connection conexaoInstance = getConexao();


    private static final Logger logger = Logger.getLogger(H2.class);

    private static Connection getConexao() {

        if (conexaoInstance == null) {
            try {
                BasicConfigurator.configure();
                final String url = "jdbc:h2:~/test";
                final String user = "sa";
                final String password = "";
                conexaoInstance = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                logger.error(e.getMessage());
            }
        }
        return conexaoInstance;
    }

    public static void close() {
        try {
            conexaoInstance.close();
//            System.out.println("H2 encerrado");
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
    }

    public static void runStatement(String sql) {

        Statement stmt;
        try {
            stmt = conexaoInstance.createStatement();
            stmt.executeUpdate(sql);
            logger.info("Sql Ok:" + sql);
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
    }

    public static ResultSet runSelect(String sql) {
        Statement stmt;
        ResultSet resultado = null;
        try {
            stmt = conexaoInstance.createStatement();
            resultado = stmt.executeQuery(sql);
            logger.info("Select Ok:" + sql);
        } catch (SQLException e) {
            logger.error(e.getMessage());
        } finally {
            return resultado;
        }
    }

    public static void printSelect(String select) {
        ResultSet data = H2.runSelect(select);
        try {
            int columnsNumber = data.getMetaData().getColumnCount();
            String collumnsName ="";
            for (int i = 1; i <= columnsNumber; i++) {
                collumnsName += data.getMetaData().getColumnName(i)+ " | ";
            }
            System.out.println("---------------------------------------------------------------");
            System.out.println(collumnsName);
            while (data.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(" | ");
                    String columnValue = data.getString(i);
                    System.out.print( columnValue  );
                }
                System.out.println("");
            }
            System.out.println("---------------------------------------------------------------");
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
    }

}

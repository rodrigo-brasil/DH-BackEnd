package JDBC.H2;

import java.sql.*;

public class H2 {

    public static Connection conexaoInstance = getConexao() ;

    private static Connection getConexao()  {

        if(conexaoInstance == null){
        try {
            final String url = "jdbc:h2:~/test";
            final String user = "sa";
            final String password = "";
            conexaoInstance = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }}
        return conexaoInstance;
    }

    public static void close(){
        try {
            conexaoInstance.close();
        }catch (SQLException e){
            System.err.println("Close - SQLException: " + e.getMessage());
        }
    }

    public static void runStatement(String sql) {

        Statement stmt;
        try {
            stmt = conexaoInstance.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
    }

    public static ResultSet runSelect(String sql){
        Statement stmt;
        ResultSet resultado = null;
        try {
            stmt = conexaoInstance.createStatement();
            resultado= stmt.executeQuery(sql);
        }catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }finally {
        return resultado;
        }
    }

}

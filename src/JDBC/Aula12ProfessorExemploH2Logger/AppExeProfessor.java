package JDBC.Aula12ProfessorExemploH2Logger;

import java.sql.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class AppExeProfessor {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS usuarios; " +
            "CREATE TABLE usuarios (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "primeiroNome VARCHAR(32) NOT NULL," +
            "sobrenome VARCHAR(32) NOT NULL," +
            "idade INT NOT NULL," +
            "altura DOUBLE NOT NULL," +
            "peso DOUBLE NOT NULL," +
            "matriculado boolean NOT NULL)";

    private static final String sqlInsert = "INSERT INTO usuarios " +
            "(primeiroNome, sobrenome, idade, altura, peso, matriculado) VALUES " +
            "('Jardel', 'Silva', 24, 1.78, 80.1, 1), " +
            "('Rener', 'Almeida', 31, 1.69, 87.5, 0), " +
            "('Caio', 'Castro', 22, 1.90, 74.6, 1)";

    private static final String sqlDelete = "DELETE FROM usuarios WHERE id = 1";

    // Declaração do nosso Logger
    private static final Logger logger = Logger.getLogger(AppExeProfessor.class);

    // Método Main
    public static void main(String[] args) throws Exception {

        // Aqui a configuração do Logging
        BasicConfigurator.configure();
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);
            statement.execute(sqlDelete);
            logger.info("Excluímos o usuário com o id 1");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (connection == null)
                return;
            connection.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }

}

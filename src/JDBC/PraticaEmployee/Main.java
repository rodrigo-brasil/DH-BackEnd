package JDBC.PraticaEmployee;

import JDBC.H2.H2;

import java.sql.Connection;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Connection conexao = H2.conexaoInstance;

        String data = LocalDate.now().toString();

        String sqlDropTable = "DROP TABLE IF EXISTS EMPLOYEE";
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS EMPLOYEE(ID INT PRIMARY KEY AUTO_INCREMENT,IDADE INT, NOME VARCHAR(255),EMPRESA VARCHAR(255), DATAINICIO VARCHAR(50));";
        String sqlInsert = "INSERT INTO EMPLOYEE (NOME,IDADE,EMPRESA,DATAINICIO) VALUES('João','29','Claro',"+data+")";
        H2.runStatement(sqlDropTable);
        H2.runStatement(sqlCreateTable);
        H2.runStatement(sqlInsert);

        H2.close();
    }
}

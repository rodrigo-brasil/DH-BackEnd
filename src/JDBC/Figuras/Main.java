package JDBC.Figuras;

import JDBC.H2.H2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Connection conexao = H2.conexaoInstance;


        String sqlDropTable = "DROP TABLE IF EXISTS figuras";
        H2.runStatement(sqlDropTable);

        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS figuras(ID INT PRIMARY KEY AUTO_INCREMENT,tipo VARCHAR(40), cor VARCHAR(50));";
        H2.runStatement(sqlCreateTable);

        String sqlInsert = "INSERT INTO figuras (tipo,cor) VALUES('Quadrado','Azul'), ('Quadrado','Roxo'), ('Quadrado','Vermelho'),('Circulo','Vermelho'),('Circulo','Verde'), ('Circulo','Laranja')";
        H2.runStatement(sqlInsert);

        String sqlSelect = "SELECT * FROM figuras";

        ResultSet data = H2.runSelect(sqlSelect);
        try {
            while(data.next()){
                int id = data.getInt("id");
                String tipo = data.getString("tipo");
                String cor = data.getString("cor");
                System.out.printf("id: %d, Nome: %s , Cor: %s \n", id,tipo,cor);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        H2.close();
    }
}

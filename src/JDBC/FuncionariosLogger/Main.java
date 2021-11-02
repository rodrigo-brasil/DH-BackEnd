package JDBC.FuncionariosLogger;

import JDBC.H2.H2;

public class Main {

    public static void main(String[] args) {

        final String selectAll = "SELECT * FROM funcionarios";

        String dropTable = "DROP TABLE IF EXISTS funcionarios";
        H2.runStatement(dropTable);

        String createTable = "CREATE TABLE IF NOT EXISTS funcionarios (id INT PRIMARY KEY NOT NULL, nome VARCHAR(50), idade INT,cargo VARCHAR(50),salario DECIMAL(6,2), sobreNome VARCHAR(50) )";
        H2.runStatement(createTable);

        String insert = "INSERT INTO funcionarios (id , nome, sobrenome, idade , cargo, salario) VALUES (1, 'João', 'Felipe', 28, 'Chefe', 3000)";
        H2.runStatement(insert);

        String insert2 = "INSERT INTO funcionarios (id , nome, sobrenome, idade , cargo, salario) VALUES (1, 'Andre', 'Sousa', 29, 'Atendente', 1900.50)";
        H2.runStatement(insert2);

        String insert3 = "INSERT INTO funcionarios (id , nome, sobrenome, idade , cargo, salario) VALUES (2, 'Felipe', 'Andrade', 38, 'Adm', 2400)";
        H2.runStatement(insert3);

        String update = "UPDATE funcionarios SET sobrenome='Alterado' WHERE ID = 2";
        H2.runStatement(update);

        H2.printSelect(selectAll);

        String deleteById = "DELETE funcionarios WHERE ID=1";
        H2.runStatement(deleteById);

        H2.printSelect(selectAll);

        H2.close();

    }
}

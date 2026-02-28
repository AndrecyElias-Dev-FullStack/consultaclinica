package com.projeto.consultaclinica.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {
        // Altere 'nome_do_seu_banco' pelo nome que você deu no Workbench
        String url = "jdbc:mysql://localhost:3306/bd_consulta_clinica";
        String user = "root"; // padrão do MySQL
        String password = "SUA_SENHA_AQUI";

        try {
            Connection conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
    }
}

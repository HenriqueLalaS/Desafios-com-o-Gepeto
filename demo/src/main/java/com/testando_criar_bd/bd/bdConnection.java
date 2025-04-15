package com.testando_criar_bd.bd;

import java.sql.*;

public class bdConnection{
    private String url = "jdbc:mysql://localhost:3306/estudo_bd_simples";
    private String username = "root";
    private String password = "";

    public Connection connect() {
        try {
            // Estabelecendo a conexão
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão bem-sucedida com o banco de dados!");
            return connection;
        } catch (SQLException e) {
            System.err.println("Erro de conexão: " + e.getMessage());
            return null;
        }
    }

}

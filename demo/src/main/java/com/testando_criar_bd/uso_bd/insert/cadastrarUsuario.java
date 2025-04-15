package com.testando_criar_bd.uso_bd.insert;

import com.testando_criar_bd.bd.bdConnection;
import java.sql.*;

public class cadastrarUsuario {

    bdConnection bdConnection = new bdConnection();
    public void cadastrarUsuario(String nome, String email){
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

        try (Connection connection = bdConnection.connect(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário inserido com sucesso!");
            } else {
                System.out.println("Nenhum dado foi inserido.");
            }
            
        } catch (SQLException erroCadastro) {
            System.err.println("erro ao cadastrar usuario" + erroCadastro.getMessage());
        }

    }
}

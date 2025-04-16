package com.testando_criar_bd.uso_bd.consultas;

import com.testando_criar_bd.bd.bdConnection;
import java.sql.*;
import java.util.Map;

public class consultas {

    bdConnection bdConnection = new bdConnection();

    public void consultaGenerica(String tabela, String campos, Map<String, String> filtros) {
        StringBuilder sql = new StringBuilder("SELECT " + campos + " FROM " + tabela);

        if (filtros != null && !filtros.isEmpty()) {
            sql.append(" WHERE ");
            int count = 0;
            for (String coluna : filtros.keySet()) {
                if (count > 0) sql.append(" AND ");
                sql.append(coluna).append(" = ?");
                count++;
            }
        }

        try (Connection connection = bdConnection.connect(); PreparedStatement stmt = connection.prepareStatement(sql.toString())) {
            if (filtros != null && !filtros.isEmpty()) {
                int index = 1;
                for (String valor : filtros.values()) {
                    stmt.setString(index++, valor);
                }
            }

            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int colunas = meta.getColumnCount();

            System.out.println("Resultado da consulta:");
            while (rs.next()) {
                for (int i = 1; i <= colunas; i++) {
                    System.out.print(meta.getColumnName(i) + ": " + rs.getString(i) + " | ");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("Erro na consulta: " + e.getMessage());
        }
}

}

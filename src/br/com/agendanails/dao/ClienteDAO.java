package br.com.agendanails.dao;

import br.com.agendanails.model.Cliente;
import br.com.agendanails.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public List<Cliente> listarClientes() {

        List<Cliente> lista = new ArrayList<>();

        try {

            Connection conn = Conexao.getConnection();

            String sql = "SELECT * FROM cliente ORDER BY nome";

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente c = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("telefone")
                );

                lista.add(c);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            System.out.println(
                    "Erro ao listar clientes: "
                    + e.getMessage()
            );
        }

        return lista;
    }
}
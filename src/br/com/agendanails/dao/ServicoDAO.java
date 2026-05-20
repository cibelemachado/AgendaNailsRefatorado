package br.com.agendanails.dao;

import br.com.agendanails.model.Servico;
import br.com.agendanails.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {

    public List<Servico> listarServicos() {

        List<Servico> lista = new ArrayList<>();

        try {

            Connection conn = Conexao.getConnection();

            String sql =
                    "SELECT * FROM servico ORDER BY nome";

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Servico s = new Servico(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getDouble("valor")
                );

                lista.add(s);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            System.out.println(
                    "Erro ao listar serviços: "
                    + e.getMessage()
            );
        }

        return lista;
    }
}

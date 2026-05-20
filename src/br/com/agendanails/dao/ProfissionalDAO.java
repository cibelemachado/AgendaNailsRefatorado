package br.com.agendanails.dao;

import br.com.agendanails.model.Profissional;
import br.com.agendanails.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProfissionalDAO {

    // LISTAR PROFISSIONAIS
    public List<Profissional> listarProfissionais() {

        List<Profissional> lista = new ArrayList<>();

        try {

            Connection conn = Conexao.getConnection();

            String sql =
                    "SELECT * FROM profissional ORDER BY nome";

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Profissional p = new Profissional(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("especialidade"),
                        rs.getString("horario")
                );

                lista.add(p);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            System.out.println(
                    "Erro ao listar profissionais: "
                    + e.getMessage()
            );
        }

        return lista;
    }

    // INSERIR PROFISSIONAL
    public boolean inserirProfissional(Profissional profissional) {

        try {

            Connection conn = Conexao.getConnection();

            String sql =
                    "INSERT INTO profissional (nome, especialidade, horario) VALUES (?, ?, ?)";

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, profissional.getNome());
            stmt.setString(2, profissional.getEspecialidade());
            stmt.setString(3, profissional.getHorario());

            stmt.execute();

            stmt.close();
            conn.close();

            return true;

        } catch (Exception e) {

            System.out.println(
                    "Erro ao inserir profissional: "
                    + e.getMessage()
            );

            return false;
        }
    }
}
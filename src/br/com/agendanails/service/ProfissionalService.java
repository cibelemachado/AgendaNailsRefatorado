package br.com.agendanails.service;

import br.com.agendanails.dao.ProfissionalDAO;
import br.com.agendanails.model.Profissional;

import java.util.List;

public class ProfissionalService {

    private ProfissionalDAO profissionalDAO;

    public ProfissionalService() {
        profissionalDAO = new ProfissionalDAO();
    }

    public List<Profissional> listarProfissionais() {
        return profissionalDAO.listarProfissionais();
    }

    public boolean salvarProfissional(Profissional profissional) {

        if (profissional.getNome() == null ||
            profissional.getNome().isEmpty()) {

            System.out.println(
                    "Nome do profissional é obrigatório!"
            );

            return false;
        }

        return profissionalDAO.inserirProfissional(profissional);
    }
}

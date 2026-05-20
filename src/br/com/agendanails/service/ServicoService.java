package br.com.agendanails.service;

import br.com.agendanails.dao.ServicoDAO;
import br.com.agendanails.model.Servico;

import java.util.List;

public class ServicoService {

    private ServicoDAO servicoDAO;

    public ServicoService() {
        servicoDAO = new ServicoDAO();
    }

    public List<Servico> listarServicos() {
        return servicoDAO.listarServicos();
    }

    public boolean salvarServico(Servico servico) {

        if (servico.getNome() == null ||
            servico.getNome().isEmpty()) {

            System.out.println(
                    "Nome do serviço é obrigatório!"
            );

            return false;
        }

        return servicoDAO.inserirServico(servico);
    }
}
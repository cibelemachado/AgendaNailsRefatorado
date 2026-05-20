package br.com.agendanails.service;

import br.com.agendanails.dao.ClienteDAO;
import br.com.agendanails.model.Cliente;
import java.util.List;

public class ClienteService {

    private ClienteDAO clienteDAO;

    public ClienteService() {
        clienteDAO = new ClienteDAO();
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }

    public boolean salvarCliente(Cliente cliente) {

        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            System.out.println("Nome do cliente é obrigatório!");
            return false;
        }

        return clienteDAO.inserirCliente(cliente);
    }
}
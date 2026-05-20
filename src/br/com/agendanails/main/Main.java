package br.com.agendanails.main;

import br.com.agendanails.dao.ClienteDAO;
import br.com.agendanails.dao.ProfissionalDAO;
import br.com.agendanails.dao.ServicoDAO;

public class Main {

    public static void main(String[] args) {

        ClienteDAO clienteDAO =
                new ClienteDAO();

        System.out.println("=== CLIENTES ===");

        clienteDAO.listarClientes()
                .forEach(System.out::println);


        ProfissionalDAO profissionalDAO =
                new ProfissionalDAO();

        System.out.println("\n=== PROFISSIONAIS ===");

        profissionalDAO.listarProfissionais()
                .forEach(System.out::println);


        ServicoDAO servicoDAO =
                new ServicoDAO();

        System.out.println("\n=== SERVIÇOS ===");

        servicoDAO.listarServicos()
                .forEach(System.out::println);
    }
}
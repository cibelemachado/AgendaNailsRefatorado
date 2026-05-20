package br.com.agendanails.test;

import br.com.agendanails.model.Cliente;
import br.com.agendanails.service.ClienteService;

public class ClienteServiceTest {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente(0, "", "99999-9999");

        ClienteService service =
                new ClienteService();

        boolean resultado =
                service.salvarCliente(cliente);

        if (resultado == false) {

            System.out.println(
                    "TESTE PASSOU"
            );

        } else {

            System.out.println(
                    "TESTE FALHOU"
            );
        }
    }
}
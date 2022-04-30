package Classes;
import Objetos.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteFunção {
    static Scanner input =new Scanner(System.in);

    public static Cliente Cadastrar(){
        Cliente     cliente   = new Cliente();
        System.out.println("__CADASTRO CLIENTE__");
        System.out.printf("\nInsira o Nome do cliente: ");
        cliente.nome            =input.next();

        System.out.printf("\nInsira o CPF do cliente: ");
        cliente.cpf             =input.next();

        System.out.printf("\nInsira o TELEFONE do cliente: ");
        cliente.fone            =input.nextLong();

        System.out.printf("\nInsira endereço do cliente: ");
        cliente.endereço =input.next();

        return cliente;
    }
    public void PrintCliente(Cliente cliente){
        
    }



}


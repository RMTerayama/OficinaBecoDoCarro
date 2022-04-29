package Classes;
import Objetos.Cliente;

import java.util.Scanner;

public class ClienteFunção {
    static Scanner input =new Scanner(System.in);

    public static Cliente Cadastrar(Cliente cliente){
        System.out.println("__CADASTRO CLIENTE__");
        System.out.printf("\nInsira o Nome do cliente:");
        cliente.nome            =input.next();

        System.out.println("\nInsira o CPF do cliente:");
        cliente.cpf             =input.next();

        System.out.printf("\nInsira o TELEFONE do cliente:");
        cliente.fone            =input.nextLong();

        System.out.printf("\nInsira a rua do cliente:");
        cliente.endereço.rua    =input.next();

        System.out.printf("\nInsira o numero da casa do cliente:");
        cliente.endereço.numero =input.nextInt();

        System.out.printf("\nInsira o bairro do cliente:");
        cliente.endereço.bairro =input.next();

        System.out.printf("\nInsira o cep do cliente:");
        cliente.endereço.cep    =input.next();


        return cliente;
    }


    public void ConsultaCPF(){

    }



}

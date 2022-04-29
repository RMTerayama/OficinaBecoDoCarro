package Classes;
import Objetos.Cliente;

import java.util.Scanner;

public class ClienteFunção {
    static Scanner input =new Scanner(System.in);

    public static Cliente Cadastrar(){
        Cliente cliente;

        String nome;
        String cpf;
        long fone;
        String rua;
        int numero;
        String bairro;
        String cep;

        nome   =input.next();
        cpf    =input.next();
        fone   =input.nextLong();
        rua    =input.next();
        numero =input.nextInt();
        bairro =input.next();
        cep    =input.next();
        
        cliente.nome            =nome;
        cliente.cpf             =input.next();
        cliente.fone            =input.nextLong();
        cliente.endereço.rua    =input.next();
        cliente.endereço.numero =input.nextInt();
        cliente.endereço.bairro =input.next();
        cliente.endereço.cep    =cep;

        return cliente;
    }


    public void ConsultaCPF(){

    }



}

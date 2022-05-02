package Classes;
import Objetos.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteFunção {
    static Scanner input =new Scanner(System.in);

    public static Cliente Cadastrar() throws Exception{
        Cliente    cliente   = new Cliente();
        System.out.println("__CADASTRO CLIENTE__");
        System.out.printf("\nInsira o Nome do cliente: ");
        cliente.setNome(input.next());

        System.out.printf("\nInsira o CPF do cliente: ");
        cliente.setCpf(input.next());

        System.out.printf("\nInsira o TELEFONE do cliente: ");
        cliente.setFone(input.nextLong());

        System.out.printf("\nInsira endereço do cliente: ");
        cliente.setEndereço(input.next());

        return cliente;
    }
  
    public static void PrintClientes(ArrayList<Cliente> cliente) {
        int i=-1; 
        for(Cliente c: cliente){
           
                System.out.println("NOME: "+c.getNome());
                System.out.println("CPF: "+c.getCpf());
                System.out.println("ENDEREÇO: "+c.getEndereço());
                System.out.println("TELEFONE: "+c.getFone());
                System.out.println("_____________________");
            i++;
        }
        if(i==-1){
            System.out.println("Nenhum Cliente Cadastrado!!");
        }
    }
    public static void PesquisaCpfCliente(ArrayList<Cliente> cliente,String cpf){
        for(Cliente c: cliente){
            if(cpf.equals(c.getCpf())){
                System.out.println("NOME: "+c.getNome());
                System.out.println("CPF: "+c.getCpf());
                System.out.println("ENDEREÇO: "+c.getEndereço());
                System.out.println("TELEFONE: "+c.getFone());
                System.out.println("_____________________");
                
                break;
            }
        }
    }
    public static Boolean ExcluirCliente(String CpfOuNome,ArrayList<Cliente> cliente){
        Boolean i=false;
        for(Cliente c: cliente){
            if(CpfOuNome.equals(c.getCpf()) ||  CpfOuNome.equals(c.getNome())){
                System.out.println("_____________________");
                System.out.println("NOME: "+c.getNome());
                System.out.println("CPF: "+c.getCpf());
                System.out.println("_____________________");
                cliente.remove(c);
                i=true;
                break;
            }

        }
        return i;
    }
    public static int PesquisaPosiçãoCliente(ArrayList<Cliente> cliente,String CpfOuNome){
        int posição=0,aux=-1;
        for(Cliente c: cliente){
            if(CpfOuNome.equals(c.getCpf()) ||  CpfOuNome.equals(c.getNome())){
                aux=posição;
                break;
            }
            posição++;
        }
        return aux;
    }
    public static void EditarCliente(int posição,ArrayList<Cliente> cliente) throws Exception{
        Cliente ClienteSuporte =new Cliente();
        int op;
        ClienteSuporte=(cliente.get(posição));
        System.out.println("1)- NOME: "+ClienteSuporte.getNome());
        System.out.println("2)- CPF: "+ClienteSuporte.getCpf());
        System.out.println("3)- ENDEREÇO: "+ClienteSuporte.getEndereço());
        System.out.println("4)- TELEFONE: "+ClienteSuporte.getFone());
        System.out.println("_____________________");
                
        System.out.println("\n Quais informaçoes do usuario você deseja alterar?");
        System.out.printf("\n Digite a opção: ");
        op=input.nextInt();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        if(op==1 ){
        System.out.println("Insira o novo nome: ");
        ClienteSuporte.setNome(input.next());
        }
        if(op==2){
        System.out.println("Insira o novo cpf: ");
            ClienteSuporte.setCpf(input.next());
                            
        }
        if(op==3 ){
            System.out.println("Insira o novo endereço: ");
            ClienteSuporte.setEndereço(input.next());
        }
        if(op==4 ){
            System.out.println("Insira o novo telefone: ");
            ClienteSuporte.setFone(input.nextLong());
        }
    }

}


package Classes;
import Objetos.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteFuncao {
    static Scanner input =new Scanner(System.in);   
    /*Realizo toda a leitura utilizando a variavel do tipo Cliente, e as funços de set para acessar as informaços que eu desejo armazenar
    depois disso, retorno a variavel cliente*/
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
        cliente.setEndereco(input.next());
        return cliente;
    }
  /* recebe o arraylist cliente como parametro de entrada e realiza uma varredura por todo o arraylist de cliente, printando todos com o metodo get
    a variavel i é apenas para controle da execução, ele é inicializado com o valor "false" caso seja printado algum cliente é passado true para ele se no final do laço
     ele continuar com o valor false, 
    significa que no arraylist de clientes nao há nenhum cliente cadastrado,dessa forma, é printado a mensagem dizendo que nenhum clinete esta presente no arraylist*/
    public static void PrintClientes(ArrayList<Cliente> cliente) {
        Boolean i=false; 
        for(Cliente c: cliente){
           
                System.out.println("\nNOME: "+c.getNome());
                System.out.println("CPF: "+c.getCpf());
                System.out.println("ENDEREÇO: "+c.getEndereco());
                System.out.println("TELEFONE: "+c.getFone());
                System.out.println("_____________________");
            i=true;
        }
        if(i==false){
            System.out.println("Nenhum Cliente Cadastrado!!");
        }
    }
    /*Esse metodo é utilizado para pesquisar pelo cpf do cliente, como parametro de entrada é passado o cpf que o usuario deseja pesquisar e o arraylist de clientes
     ele passa por todos os clientes cadastrados realizando a comparação de string entre o cpf passado como parametro e o cpf cadastrado no cliente*/
    public static void PesquisaCpfCliente(ArrayList<Cliente> cliente,String cpf){
        Boolean verificador=false;
        for(Cliente c: cliente){
            if(cpf.equals(c.getCpf())){
                System.out.println("\n_____________________");
                System.out.println("NOME: "+c.getNome());
                System.out.println("CPF: "+c.getCpf());
                System.out.println("ENDEREÇO: "+c.getEndereco());
                System.out.println("TELEFONE: "+c.getFone());
                System.out.println("_____________________");
                verificador=true;
                break;
            }
           
            }
         if(verificador==false){
                System.out.println("Nenhum cliente com esse cpf foi encontrado, verifique e tente novamente");
           }     
    }
    /*Reliza uma varredura pelo arraylist clientes,comparando uma varivale que foi passado como parametro, nela pode ter sido inserido tanto o cpf quando o nome do cliente
    a saida desse meotodo é um valor boolean, para a verificação na main, caso ele encontre o cliente, é utilizado a função remove na posição do cliente desejado */
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
    public static int PesquisaPosicaoCliente(ArrayList<Cliente> cliente,String CpfOuNome){
        int posicao=0,aux=-1;
        for(Cliente c: cliente){
            if(CpfOuNome.equals(c.getCpf()) ||  CpfOuNome.equals(c.getNome())){
                aux=posicao;
                break;
            }
            posicao++;
        }
        return aux;
    }
    /*é passado como pametro um arraylist de clientes onde possui o endereço de memoria do arraylist cliente principal, dessa forma,ao ser realizado alguma mudaça nele
    automaticamnte é realizado a modificação que desejamos no arraylist clientes para mostrar as infomaçoes, é passado com o parametro de acesso get, para realizar
    as modificaçoes, o set  */
    public static void EditarCliente(Cliente ClienteSuporte) throws Exception{
        
        int op;
        System.out.println("1)- NOME: "+ClienteSuporte.getNome());
        System.out.println("2)- CPF: "+ClienteSuporte.getCpf());
        System.out.println("3)- ENDEREÇO: "+ClienteSuporte.getEndereco());
        System.out.println("4)- TELEFONE: "+ClienteSuporte.getFone());
        System.out.println("_____________________");
                
        System.out.println("\n Quais informaçoes do usuario você deseja alterar?");
        System.out.printf("\n Digite a opção: ");
        op=input.nextInt();
    

        if(op==1 ){
        System.out.println("\nInsira o novo nome: ");
        ClienteSuporte.setNome(input.next());
        }
        if(op==2){
        System.out.println("\nInsira o novo cpf: ");
            ClienteSuporte.setCpf(input.next());
                            
        }
        if(op==3 ){
            System.out.println("\nInsira o novo endereço: ");
            ClienteSuporte.setEndereco(input.next());
        }
        if(op==4 ){
            System.out.println("\nInsira o novo telefone: ");
            ClienteSuporte.setFone(input.nextLong());
        }
    }

}


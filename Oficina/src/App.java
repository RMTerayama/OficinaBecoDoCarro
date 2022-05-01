/*_
   ___   __ _      _               ____                       _          _____                     
 / __ \ / _(_)    (_)             |  _ \                     | |        / ____|                    
| |  | | |_ _  ___ _ _ __   __ _  | |_) | ___  ___ ___     __| | ___   | |     __ _ _ __ _ __ ___  
| |  | |  _| |/ __| | '_ \ / _` | |  _ < / _ \/ __/ _ \   / _` |/ _ \  | |    / _` | '__| '__/ _ \ 
| |__| | | | | (__| | | | | (_| | | |_) |  __/ (_| (_) | | (_| | (_) | | |___| (_| | |  | | | (_) |
 \____/|_| |_|\___|_|_| |_|\__,_| |____/ \___|\___\___/   \__,_|\___/   \_____\__,_|_|  |_|  \___/                                                                                                 
                                                                                          
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;

   
   //importando das classes que estão sendo utilizadas
import Objetos.Cliente;
import Objetos.OrdemServico;
import Objetos.Peça;
import Objetos.Serviços;
import Classes.ClienteFunção;
import Classes.PeçaFunção;
public class App {
    public static void main(String[] args) throws Exception {


        int option=1;
        int aux=0,i;
        String cpfauxiliar,stringAuxiliar;
        Scanner input =new Scanner(System.in);
        ArrayList<Cliente>      cliente   = new ArrayList();
        ArrayList<OrdemServico> OS        = new ArrayList();
        ArrayList<Serviços>     Serviço   = new ArrayList();
        ArrayList<Peça>         peça      = new ArrayList();

        Cliente ClienteSuporte= new Cliente();
        Peça PeçaSuporte =new Peça();
        while(option!=6){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Menu");
            
            //System.out.printf("Total cliente :%d ",cliente.size());
            System.out.println("\n1 - Gerenciar clientes\n2 - Gerenciar peças\n3 - Gerenciar serviços\n4 - Gerenciar ordens de serviço\n5 - Consultar total vendido em um período\n6 - Sair do programa\n");
            System.out.print("Opção: ");
            option=input.nextInt();
          //OPÇÃO 1 MENU PRINCIPAL
            if(option==1){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Gerenciar clientes");
                System.out.println("\n1 - Cadastrar\n2 - Consultar por CPF\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                System.out.print("Opção: ");
                option=input.nextInt();
                aux=cliente.size();
                if(option==1){
                 
                   ClienteSuporte=ClienteFunção.Cadastrar();
                   cliente.add(ClienteSuporte);
                   if(aux<cliente.size()){
                       System.out.println("Cliente cadastrado com sucesso!!");
                   }
                    Thread.sleep(2000);
                }
                
                if(option==2){
                    System.out.println("\n___Pesquisar por CPF___" );
                    System.out.println("\nInsira o CPF que deseja consultar: " );
                    cpfauxiliar= input.next();
                    ClienteFunção.PesquisaCpfCliente(cliente, cpfauxiliar);
                    for(aux=10;aux>=0;aux--){
                            System.out.print(aux+" ");
                             Thread.sleep(1000);
                        }
               
                }
                if(option==3){
                    System.out.println("\n___Excluir cliente___" );
                    System.out.println("\nInsira o CPF ou o Nome do cliente que deseja excluir" );
                    stringAuxiliar=input.next();
                    if(ClienteFunção.ExcluirCliente(stringAuxiliar,cliente)==true){
                        System.out.println("Foi removido com sucesso !!!");
                    }else{
                        System.out.println("Houve um erro, o cliente nao foi removido!!\nVerifique o nome e o CPF e tente novamente.");
                    }
                    for(aux=5;aux>=0;aux--){
                        System.out.print(aux+" ");
                         Thread.sleep(1000);
                    }
                }
                if(option==4){
                    System.out.println("\n___Editar cliente___" );
                    System.out.println("\nInsira o CPF ou o Nome do cliente que deseja editar" );
                    stringAuxiliar=input.next();
                    if(ClienteFunção.PesquisaPosiçãoCliente(cliente, stringAuxiliar)==-1){
                        System.out.println("Cliente nao encontrado!!\nVerifique as informaçoes e tente novamente.");
                        
                    }else{
                        aux=ClienteFunção.PesquisaPosiçãoCliente(cliente, stringAuxiliar);
                        ClienteSuporte=cliente.get(aux);
                        System.out.printf(" Cliente: "+ClienteSuporte.getNome()+"\n CPF:"+ClienteSuporte.getCpf()+"\n Endereço:"+ClienteSuporte.getEndereço()+"\n Telefone:"+ClienteSuporte.getFone());
                        System.out.println("\n Quais informaçoes do usuario você deseja alterar?");
                        System.out.printf(" Nome.\n Cpf.\n Endereço.\n Telefone.\n Digite a opção: ");
                        stringAuxiliar=input.next();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        if(stringAuxiliar.equals("nome") ||stringAuxiliar.equals("Nome") ){
                            System.out.println("Insira o novo nome: ");
                            ClienteSuporte.setNome(input.next());
                        }
                        if(stringAuxiliar.equals("cpf")||stringAuxiliar.equals("Cpf")){
                            System.out.println("Insira o novo cpf: ");
                            ClienteSuporte.setCpf(input.next());
                            
                        }
                        if(stringAuxiliar.equals("endereço")|| stringAuxiliar.equals("Endereço") ){
                            System.out.println("Insira o novo endereço: ");
                            ClienteSuporte.setEndereço(input.next());
                        }
                        if(stringAuxiliar.equals("telefone")||stringAuxiliar.equals("Telefone") ){
                            System.out.println("Insira o novo telefone: ");
                            ClienteSuporte.setFone(input.nextLong());
                        }
                        System.out.println("Alteração realizada com sucesso");
                    }
                    for(aux=5;aux>=0;aux--){
                        System.out.print(aux+" ");
                         Thread.sleep(1000);
                    }
                }
                if(option==5){
                    System.out.println("\n___LISTAR TODOS OS CADASTROS___\n" );
                    ClienteFunção.PrintClientes(cliente);
                    for(aux=10;aux>=0;aux--){
                        System.out.print(aux+" ");
                         Thread.sleep(1000);
                    }
                   
                }
                 option=1;
            }//FIM OPÇÃO 1 MENU PRINCIPAL

            if(option==2){
                // O comando inserido na linha posterior, é apenas para fins estéticos, ele realiza a limpeza do Promp de comando executando a função "cls"
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Gerenciar peças");
                System.out.println("\n1 - Cadastrar\n2 - Consultar por código\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                System.out.print("Opção: ");
                option=input.nextInt();
                if(option==1){
                    aux=peça.size();
                    PeçaSuporte=PeçaFunção.CadastrarPeças();
                    if(aux<peça.size()){
                        System.out.println("Peça Cadastrada com sucesso!!");
                    }
                    Thread.sleep(3000);
                }
                    option=1;
                
            }
            if(option==3){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Gerenciar serviços");
                System.out.println("\n1 - Cadastrar\n2 - Consultar por código\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                System.out.print("Opção: ");
                option=input.nextInt();
                if(option==6){
                    option=1;
                }
            }
            if(option==4){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Gerenciar ordens de serviço");
                System.out.println("\n1 - Abrir nova ordem de serviço\n2 - Gerenciar itens\n3 - Cancelar\n4 - Finalizar\n5 - Excluir\n6 - Listar todas as ordens\n7 - Voltar");
                System.out.print("Opção: ");
                option=input.nextInt();
                if(option==6){
                    option=1;
                }
            }
            /*if(option==5){
                
                }
            }*/

        }
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("______Muito obrigado____\n_________Até logo_______");





    }
}

/*_
   ___   __ _      _               ____                       _          _____                     
 / __ \ / _(_)    (_)             |  _ \                     | |        / ____|                    
| |  | | |_ _  ___ _ _ __   __ _  | |_) | ___  ___ ___     __| | ___   | |     __ _ _ __ _ __ ___  
| |  | |  _| |/ __| | '_ \ / _` | |  _ < / _ \/ __/ _ \   / _` |/ _ \  | |    / _` | '__| '__/ _ \ 
| |__| | | | | (__| | | | | (_| | | |_) |  __/ (_| (_) | | (_| | (_) | | |___| (_| | |  | | | (_) |
 \____/|_| |_|\___|_|_| |_|\__,_| |____/ \___|\___\___/   \__,_|\___/   \_____\__,_|_|  |_|  \___/                                                                                                 
                                                                                          
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Objects;
import java.io.*;
import java.lang.Thread;
   //test ainwww
   //importando das classes que estão sendo utilizadas
import Objetos.Cliente;
import Objetos.OrdemServico;
import Objetos.Peça;
import Objetos.Serviços;
import Classes.ClienteFunção;
public class App {
    public static void main(String[] args) throws Exception {

    String nometeste;
    String cpfteste;
    String endereçoteste;
    long foneteste;

        int option=1;
        int aux=0,i;
        String cpfauxiliar;
        Scanner input =new Scanner(System.in);
        ArrayList<Cliente>      cliente   = new ArrayList();
        ArrayList<OrdemServico> OS        = new ArrayList();
        ArrayList<Serviços>     Serviço   = new ArrayList();
        ArrayList<Peça>         peça      = new ArrayList();

        Cliente ClienteSuporte= new Cliente();
        while(option!=6){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Menu");
            
            System.out.printf("Total cliente :%d ",cliente.size());
            System.out.println("\n1 - Gerenciar clientes\n2 - Gerenciar peças\n3 - Gerenciar serviços\n4 - Gerenciar ordens de serviço\n5 - Consultar total vendido em um período\n6 - Sair do programa\n");
            System.out.print("Opção: ");
            option=input.nextInt();
          
            if(option==1){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Gerenciar clientes");
                System.out.println("\n1 - Cadastrar\n2 - Consultar por CPF\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                System.out.print("Opção: ");
                option=input.nextInt();
                aux=cliente.size();
                if(option==1){
                    /*
                    nometeste=input.next();
                    cpfteste=input.next();
                    endereçoteste=input.next();
                    foneteste=input.nextLong();
                    cliente.
                    */
                   ClienteSuporte=ClienteFunção.Cadastrar();
                   cliente.add(ClienteSuporte);
                 /*
                   for(Cliente c: cliente){
                       System.out.println("\n"+c.nome);
                   }
                   */
                   if(aux<cliente.size()){
                       System.out.println("Cliente cadastrado com sucesso!!");
                   }
                    Thread.sleep(3000);
                }
                }
                if(option==2){
                    System.out.println("\n___Pesquisar por CPF___" );
                    System.out.println("\nInsira o CPF que deseja consultar: " );
                    cpfauxiliar= input.next();
                    for(Cliente c: cliente){
                        if(cpfauxiliar==c.cpf){
                            System.out.println("_____________________");
                            System.out.println("NOME: "+c.nome);
                            System.out.println("CPF: "+c.cpf);
                            System.out.println("ENDEREÇO: "+c.endereço);
                            System.out.println("TELEFONE: "+c.fone);
                            System.out.println("_____________________");
                            Thread.sleep(3000);
                        }
                    }
                   
                option=1;
                

            }
            if(option==2){
                // O comando inserido na linha posterior, é apenas para fins estéticos, ele realiza a limpeza do Promp de comando executando a função "cls"
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Gerenciar peças");
                System.out.println("\n1 - Cadastrar\n2 - Consultar por código\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                System.out.print("Opção: ");
                option=input.nextInt();
                if(option==6){
                    option=1;
                }
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

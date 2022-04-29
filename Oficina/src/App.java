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
import Objetos.Cliente;
import Objetos.OrdemServico;
import Objetos.Peça;
import Objetos.Serviços;
import Classes.ClienteFunção;
public class App {
    public static void main(String[] args) throws Exception {
        int option=1;
        Scanner input =new Scanner(System.in);
        ArrayList<Cliente>      cliente   = new ArrayList();
        ArrayList<OrdemServico> OS        = new ArrayList();
        ArrayList<Serviços>     Serviço   = new ArrayList();
        ArrayList<Peça>         peça      = new ArrayList();
        Cliente ClienteSuporte;
        while(option!=6){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Menu");
            System.out.println("\n1 - Gerenciar clientes\n2 - Gerenciar peças\n3 - Gerenciar serviços\n4 - Gerenciar ordens de serviço\n5 - Consultar total vendido em um período\n6 - Sair do programa\n");
            System.out.print("Opção: ");
            option=input.nextInt();
          
            if(option==1){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Gerenciar clientes");
                System.out.println("\n1 - Cadastrar\n2 - Consultar por CPF\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                System.out.print("Opção: ");
                option=input.nextInt();
                if(option==1){
                   ClienteFunção.Cadastrar();

                }

                if(option==6){
                    option=1;
                }

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

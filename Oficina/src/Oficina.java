/*_
   ___   __ _      _               ____                       _          _____                     
 / __ \ / _(_)    (_)             |  _ \                     | |        / ____|                    
| |  | | |_ _  ___ _ _ __   __ _  | |_) | ___  ___ ___     __| | ___   | |     __ _ _ __ _ __ ___  
| |  | |  _| |/ __| | '_ \ / _` | |  _ < / _ \/ __/ _ \   / _` |/ _ \  | |    / _` | '__| '__/ _ \ 
| |__| | | | | (__| | | | | (_| | | |_) |  __/ (_| (_) | | (_| | (_) | | |___| (_| | |  | | | (_) |
 \____/|_| |_|\___|_|_| |_|\__,_| |____/ \___|\___\___/   \__,_|\___/   \_____\__,_|_|  |_|  \___/                                                                                                 
                                                                                          
*/
//Richard
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;
import Objetos.Cliente;
import Objetos.OrdemServico;
import Objetos.Peca;
import Objetos.Servicos;
import Classes.ClienteFuncao;
import Classes.OSFuncao;
import Classes.PecaFuncao;
import Classes.ServicoFuncao;
import Classes.Suporte;
public class Oficina {
    public static void main(String[] args) throws Exception {


        int option=1;
        int aux=0,posicao;
        String cpfauxiliar,stringAuxiliar;
        Scanner input =new Scanner(System.in);
        ArrayList<Cliente>      cliente   = new ArrayList();
        ArrayList<OrdemServico> os        = new ArrayList();
        ArrayList<Servicos>     servico   = new ArrayList();
        ArrayList<Peca>         peca      = new ArrayList();

        Cliente ClienteSuporte;
        Peca PecaSuporte;
        Servicos ServicoSuporte;
        OrdemServico osSuporte;
        while(option!=6){
            Suporte.LimpaConsole();
            System.out.println("Menu");
            
            //System.out.printf("Total cliente :%d ",cliente.size());
            System.out.println("\n1 - Gerenciar clientes\n2 - Gerenciar peças\n3 - Gerenciar serviços\n4 - Gerenciar ordens de serviço\n5 - Consultar total vendido em um período\n6 - Sair do programa\n");
            System.out.print("Opção: ");
            option=input.nextInt();
          //OPÇÃO 1 MENU PRINCIPAL
            switch(option){
                case(1):
                    Suporte.LimpaConsole();
                    System.out.println("Gerenciar clientes");
                    System.out.println("\n1 - Cadastrar\n2 - Consultar por CPF\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                    System.out.print("Opção: ");
                    option=input.nextInt();
                 
                    switch(option){
                        case(1)://Inicio da opçao 1 do submenu cliente

                        aux=cliente.size();//armazena o tamanho do arraylist na variavel aux;
                        Suporte.LimpaConsole(); 
                        ClienteSuporte=ClienteFuncao.Cadastrar();
                        cliente.add(ClienteSuporte);
                        /*Verifica se o tamanho atual do arraylist é maior que aux, ou seja, caso o tamanho do cliente for maior que aux,
                         quer dizer que foi acrescentado um cliente a mais,caso contrario, o tamanho do arraylist permaneceu com o mesmo
                        tamanho e nenhum cliente foi adicionado
                        */
                        if(aux<cliente.size()){ 
                            System.out.println("Cliente cadastrado com sucesso!!");
                        }
                            Thread.sleep(2000);
                        break;//FIM DA OPCAO 1 DO SUBMENU CLIENTE
                        
                        case(2)://Inicio da opçao 2 do submenu cliente
                            Suporte.LimpaConsole();
                            System.out.println("\n___PESQUISAR POR CPF___" );
                            System.out.println("\nInsira o CPF que deseja consultar: " );
                            cpfauxiliar= input.next();
                            ClienteFuncao.PesquisaCpfCliente(cliente, cpfauxiliar);
                            System.out.println ("Clique em quualquuer tecla para continuar... ");
                            System.in.read ();
                    
                        break;//FIM DA OPCAO 2 DO SUBMENU CLIENTE
                        case(3)://Inicio da opçao 3 do submenu cliente
                            Suporte.LimpaConsole();
                            System.out.println("\n___EXCLUIR CLIENTE___" );
                            System.out.println("\nInsira o CPF ou o Nome do cliente que deseja excluir" );
                            stringAuxiliar=input.next();
                            if(ClienteFuncao.ExcluirCliente(stringAuxiliar,cliente)==true){
                                System.out.println("Foi removido com sucesso !!!");
                            }else{
                                System.out.println("Houve um erro, o cliente nao foi removido!!\nVerifique o nome e o CPF e tente novamente.");
                            }
                            for(aux=3;aux>=0;aux--){
                                System.out.print((aux+1)+" ");
                                Thread.sleep(1000);
                            }
                        break;//FIM DA OPCAO 3 DO SUBMENU CLIENTE
                        case(4)://Inicio da opçao 4 do submenu cliente
                            // implementar na classe ClienteFunção
                            Suporte.LimpaConsole();
                            System.out.println("\n___EDITAR CLIENTE___" );
                            System.out.println("\nInsira o CPF ou o Nome do cliente que deseja editar" );
                            stringAuxiliar=input.next();
                            if(ClienteFuncao.PesquisaPosicaoCliente(cliente, stringAuxiliar)==-1){
                                System.out.println("Cliente nao encontrado!!\nVerifique as informaçoes e tente novamente.");
                                
                            }else{
                                aux=ClienteFuncao.PesquisaPosicaoCliente(cliente, stringAuxiliar);
                                ClienteSuporte=cliente.get(aux);
                                ClienteFuncao.EditarCliente(ClienteSuporte);
                                System.out.println("Alteração realizada com sucesso");
                            }
                            for(aux=3;aux>=0;aux--){
                                System.out.print(aux+" ");
                                Thread.sleep(1000);
                            }
                        break;//FIM DA OPCAO 4 DO SUBMENU CLIENTE
                    
                    case(5)://Inicio da opçao 5 do submenu cliente
                        Suporte.LimpaConsole();
                        System.out.println("\n___LISTAR TODOS OS CADASTROS___\n" );
                        ClienteFuncao.PrintClientes(cliente);
                        System.out.println ("Clique em quualquuer tecla para continuar... ");
                        System.in.read ();
                    
                    break;//FIM DA OPCAO 5 DO SUBMENU CLIENTE
                }
                    option=1;
                break;//FIM OPÇÃO 1 MENU PRINCIPAL
                
                case(2)://INICIO DA OPÇÃO 2 DO MENU PRINCIPAL
                    // O comando inserido na linha posterior, é apenas para fins estéticos, ele realiza a limpeza do Promp de comando executando a função "cls"
                    Suporte.LimpaConsole();
                    //Submenu de peças
                    System.out.println("\n___GERENCIAR PEÇAS___\n" );
                    System.out.println("\n1 - Cadastrar peça\n2 - Consultar por código\n3 - Excluir peça\n4 - Editar peça\n5 - Listar todos os cadastros\n6 - Voltar");
                    System.out.print("Opção: ");
                    option=input.nextInt();
                    if(option==1){
                        Suporte.LimpaConsole();

                        aux=peca.size();
                        PecaSuporte=PecaFuncao.CadastrarPecas();
                        peca.add(PecaSuporte);
                        if(aux<peca.size()){
                            System.out.println("Peça Cadastrada com sucesso!!");
                        }else{
                            System.out.println("Houve um erro ao cadastrar a peça!!");
                        }
                        System.out.println ("Clique em qualquer tecla para continuar... ");
                        System.in.read ();
                    }
                    if(option==2){
                        Suporte.LimpaConsole();
                        System.out.println("\n___CONSULTAR POR CODIGO___\n" );
                        System.out.printf("\nInsira o codigo da peça que deseja pesquisar: " );
                        stringAuxiliar=input.next();
                        posicao=PecaFuncao.EcontraPeca(peca,stringAuxiliar);
                        PecaSuporte=peca.get(posicao);
                        PecaFuncao.PrintPeca(PecaSuporte);
                        System.out.println ("Clique em qualquer tecla para continuar... ");
                        System.in.read ();
                    }
                    if(option==3){
                        Suporte.LimpaConsole();
                        System.out.println("\n___EXCLUIR PEÇA___\n" );
                        System.out.printf("Insira o codigo doo produto quue deseja excluir: ");
                        stringAuxiliar=input.next();
                        if(PecaFuncao.ExcluirPeca(stringAuxiliar, peca)==true){
                            System.out.println("Peça Excluida com sucesso");
                        }else{
                            System.out.println("Peça não Excluida\nVerifique o coodigo e tente novamente");
                        }
                        for(aux=3;aux>=0;aux--){
                            System.out.print(aux+" ");
                            Thread.sleep(1000);
                        }
                    }
                    if(option==4){
                        Suporte.LimpaConsole();
                        System.out.println("\n___EDITAR PEÇA___" );
                        System.out.printf("\nInsira o codigo do produto que deseja modificar: " );
                        stringAuxiliar=input.next();
                        posicao=PecaFuncao.EcontraPeca (peca,stringAuxiliar);
                        if(posicao!=-1){
                            PecaSuporte=peca.get(posicao);
                            PecaFuncao.EditarPeca(PecaSuporte);
                            System.out.println("Peça alterada com sucesso!!");

                        }else{
                            System.out.println("Peça não econtrada\nVerifique o coodigo e tente novamente");
                        }
                        for(aux=3;aux>=0;aux--){
                            System.out.print(aux+" ");
                            Thread.sleep(1000);
                        }
                    }
                    if(option==5){
                        Suporte.LimpaConsole();
                        System.out.println("\n___LISTAR TODAS AS PEÇAS___\n" );
                        PecaFuncao.PrintTodasPecas(peca);
                        System.out.println ("Clique em qualquuer tecla para continuar... ");
                        System.in.read ();

                    }
                        option=1;
                break;//FIM DA OPÇÃO 2 DO MENU PRINCIPAL
                case(3)://INICIO DA OPÇÃO 3 DO MENU PRINCIPAL
                Suporte.LimpaConsole();
                    System.out.println("Gerenciar serviços");
                    System.out.println("\n1 - Cadastrar\n2 - Consultar por código\n3 - Excluir\n4 - Editar\n5 - Listar todos os cadastros\n6 - Voltar");
                    System.out.print("Opção: ");
                    option=input.nextInt();
                    if(option==1){
                        Suporte.LimpaConsole();
                        aux=servico.size();
                        ServicoSuporte=ServicoFuncao.CadastrarServico();
                        servico.add(ServicoSuporte);
                        if(servico.size()>aux){
                            System.out.println("Serviço cadastrado com sucesso!!");
                        }else{
                            System.out.println("Serviço não cadastrado!!");
                        }
                        for(aux=3;aux>=0;aux--){
                            System.out.print(aux+" ");
                            Thread.sleep(1000);
                        }

                    }
                    if(option==2){
                        Suporte.LimpaConsole();
                        System.out.println("\n___CONSULTAR POR CODIGO___\n" );
                        System.out.printf("\nInsira o codigo do serviço que deseja pesquisar: " );
                        stringAuxiliar=input.next();

                        posicao= ServicoFuncao.EcontraServico(servico,stringAuxiliar);
                        if(posicao!=-1){
                            ServicoSuporte=servico.get(posicao);
                            ServicoFuncao.PrintaServico(ServicoSuporte);
                        }else{
                            System.out.println("Serviço não encontrado");
                        }
                        System.out.println ("Clique em qualquuer tecla para continuar... ");
                        System.in.read ();
                    }
                    if(option==3){

                        Suporte.LimpaConsole();
                        System.out.println("\n___EXCLUIR SERVIÇO___\n" );
                        System.out.printf("Insira o codigo ou a descrição do serviço que deseja excluir: ");
                        stringAuxiliar=input.next();
                        if(ServicoFuncao.ExcluirServico(stringAuxiliar, servico)==true){
                            System.out.println("Serviço foi excluido com sucesso");
                        }else{
                            System.out.println("Serviço não Excluido\nVerifique o codigo ou a descriçao e tente novamente");

                        }
                        for(aux=3;aux>=0;aux--){
                            System.out.print(aux+" ");
                            Thread.sleep(1000);
                        }
                        
                    }
                    if(option==4){
                        Suporte.LimpaConsole();
                        System.out.printf("Insira o codigo ou a descrição do serviço que deseja editar: ");
                        stringAuxiliar=input.next();
                        aux=ServicoFuncao.EcontraServico(servico,stringAuxiliar);
                        if(aux!=-1){
                            ServicoSuporte=servico.get(aux); 
                            ServicoFuncao.EditarServico(ServicoSuporte); 
                        }else{
                            System.out.println("Serviço nao encontrado");
                        }
                        for(aux=3;aux>=0;aux--){
                            System.out.print(aux+" ");
                            Thread.sleep(1000);
                        }
                        //
                    }   
                    if(option==5){
                        System.out.println("\n___LISTAR TODOS OS SERVIÇOS___\n" );
                        ServicoFuncao.PrintServicos(servico);
                        System.out.println ("Clique em qualquuer tecla para continuar... ");
                        System.in.read ();
                    }   
                    option=1;
                break;//FIM DA OPÇÃO 3 DO MENU PRINCIPAL
                case(4)://INICIO DA OPÇÃO 4 DO MENU PRICIPAL
                    while(option!=7){
                        Suporte.LimpaConsole();
                        System.out.println("Gerenciar ordens de serviço");
                        System.out.println("\n1 - Abrir nova ordem de serviço\n2 - Gerenciar itens\n3 - Cancelar\n4 - Finalizar\n5 - Excluir\n6 - Listar todas as ordens\n7 - Voltar");
                        System.out.print("Opção: ");
                        option=input.nextInt();
                        switch(option){

                            case(1):
                                //Abrir nova ordem de serviço
                                aux=os.size();
                                osSuporte=OSFuncao.CadastraOs();
                                os.add(osSuporte);
                                if(servico.size()>aux){
                                    System.out.println("OS cadastrado com sucesso!!");
                                }else{
                                    System.out.println("OS não cadastrado!!");
                                }
                                System.out.println ("Clique em qualquuer tecla para continuar... ");
                                System.in.read ();
                                
                            break;
                            
                            case(2):
                                //Gerenciar itens
                                System.out.println("\n1 - Adicionar peça\n2 - Adicionar serviço\n3 - Excluir peça");
                                System.out.println("\n4 - Excluir serviço\n5 - Consultar total\n6 - Voltar");
                                System.out.print("\nOpção: ");
                                option=input.nextInt();
                                switch(option){

                                    case(1):
                                    System.out.println("\n1 - Adicionar peça");

                                    break;

                                    case(2):
                                    System.out.println("\n2 - Adicionar");

                                    break;

                                    case(3):
                                    System.out.println("\n3 - Excluir peça");

                                    break;

                                    case(4):
                                    System.out.println("\n4 - Excluir serviço");

                                    break;

                                    case(5):
                                    System.out.println("\n5 - Consultar total");

                                    break;

                                }
                            
                            break;
                            
                            case(3):
                                //Cancelar
                            
                            break;
                            
                            case(4):
                                //Finalizar
                            
                            break;
                            
                            case(5):
                                //Excluir
                            
                            break;
                            
                            case(6):
                                //Listar todas as ordens
                            
                            break;
                        }
                    }



                        option=1;
                break;
                /* case(5):
                    
                    }
                break;*/
            }    

        }
        input.close();
        Suporte.LimpaConsole();
        System.out.println("______Muito obrigado____\n_________Até logo_______");

    }

}

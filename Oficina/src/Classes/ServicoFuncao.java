package Classes;
import Objetos.Servicos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
public class ServicoFuncao {
    static Scanner input =new Scanner(System.in);
    public static Servicos CadastrarServico() throws Exception{
        Servicos servico= new Servicos();
        LocalTime time;
        int hours,min,sec=0;
        System.out.println("__CADASTRO DE SERVIÇO__");

        System.out.printf("\nInsira a descrição do serviço: ");
        servico.setDescricao(input.next());

        System.out.printf("\nInsira o Codigo de serviço: ");
        servico.setCodServico(input.next());


        System.out.printf("\nInsira o preço do serviço: ");
        servico.setPreco(input.nextDouble());

        System.out.printf("\nInsira o tempo de execução para esse serviço: ");
        System.out.printf("\nHoras : ");
        hours=input.nextInt();
        System.out.printf("\nMinutos : ");
        min=input.nextInt();
        time= LocalTime.of(hours, min,sec);
    
        servico.setTempoExecucao(time);
        return servico;
    }
    // posição=EcontraServiço(serviço,stringAuxiliar);
    public static int EcontraServico (ArrayList <Servicos> servico,String codigo){
        int posicao=-1;
        for(Servicos s: servico){
            if(codigo.equals(s.getCodServico()) || codigo.equals(s.getDescricao()) ){
                posicao++;
                break;
            }
            posicao++;
        }
        return posicao;
    }
    //aux=ServiçoFunção.EcontraServiço(serviço,stringAuxiliar);

    public static void PrintaServico (Servicos ServicoAux){
        System.out.println("Codigo de serviço: "+ServicoAux.getCodServico());
            System.out.println("Descrição: "+ServicoAux.getDescricao());
            System.out.println("Preço: "+ServicoAux.getPreco());
            System.out.println("Tempo de execução: "+ServicoAux.getTempoExecucao());
            System.out.println("_____________________");
    }

    public static void PrintServicos(ArrayList<Servicos> servicos){
        int i=-1;
        for(Servicos s: servicos){
            System.out.println("Codigo de serviço: "+s.getCodServico());
            System.out.println("Descrição: "+s.getDescricao());
            System.out.println("Preço: "+s.getPreco());
            System.out.println("Tempo de execução: "+s.getTempoExecucao());
            System.out.println("_____________________");
            i++;

        }
        if(i==-1){
            System.out.println("Nenhum Serviço Cadastrado!!");
        }
    }
    public static Boolean ExcluirServico(String DescricaoOuCodigo, ArrayList <Servicos> servico){
        Boolean i =false;
        for(Servicos s: servico)
            if(DescricaoOuCodigo.equals(s.getCodServico()) || DescricaoOuCodigo.equals(s.getDescricao())  ){
                System.out.println("_____________________");
                System.out.println("DESCRIÇÃO: "+s.getDescricao());
                System.out.println("CODIGO: "+s.getCodServico());
                System.out.println("_____________________");
                servico.remove(s);
                i=true;
                break;
            }
        return i;    
    }
    public static void EditarServico(Servicos servico) throws Exception{
        int opcao;
        LocalTime time;
        int hours,min,sec=0;
        System.out.println("1 - Codigo de serviço: "+servico.getCodServico());
        System.out.println("2 - Descrição: "+servico.getDescricao());
        System.out.println("3 - Preço: "+servico.getPreco());
        System.out.println("4 - Tempo de execução: "+servico.getTempoExecucao());
        System.out.println("_____________________");
        System.out.println("Insira a opção que deseja realizar a alteraçao : ");
        opcao=input.nextInt();
        switch(opcao){
            case(1):
                System.out.println("Insira o novo codigo : ");
                servico.setCodServico(input.next());
            break;
            case(2):
                System.out.println("Insira a nova descriçao : ");
                servico.setDescricao(input.next());
            break;
            case(3):
                System.out.println("Insira o novo preço : ");
                servico.setPreco(input.nextDouble());
            break;
            case(4):
                System.out.println("Insira o novo tempo de execuçao : ");
                System.out.printf("\nHoras : ");
                hours=input.nextInt();
                System.out.printf("\nMinutos : ");
                min=input.nextInt();
                time= LocalTime.of(hours, min,sec);
                servico.setTempoExecucao(time);
            break;
        }
    }

}

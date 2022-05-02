package Classes;
import Objetos.Serviços;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
public class ServiçoFunção {
    static Scanner input =new Scanner(System.in);
    public static Serviços CadastrarServiço() throws Exception{
        Serviços serviço= new Serviços();
        LocalTime time;
        int hours,min,sec=0;
        System.out.println("__CADASTRO DE SERVIÇO__");

        System.out.printf("\nInsira a descrição do serviço: ");
        serviço.setDescrição(input.next());

        System.out.printf("\nInsira o Codigo de serviço: ");
        serviço.setCodServiço(input.next());


        System.out.printf("\nInsira o preço do serviço: ");
        serviço.setPreço(input.nextDouble());

        System.out.printf("\nInsira o tempo de execução para esse serviço: ");
        System.out.printf("\nHoras : ");
        hours=input.nextInt();
        System.out.printf("\nMinutos : ");
        min=input.nextInt();
        time= LocalTime.of(hours, min,sec);
    
        serviço.setTempoExecução(time);
        return serviço;
    }
    // posição=EcontraServiço(serviço,stringAuxiliar);
    public static int EcontraServiço (ArrayList <Serviços> serviço,String codigo){
        int posição=-1;
        for(Serviços s: serviço){
            if(codigo.equals(s.getCodServiço())){
                break;
            }
            posição++;
        }
        return posição;
    }



    
    public static void PrintaServiço (ArrayList<Serviços> serviço, int posição){
        Serviços ServiçoAux= new Serviços();

        ServiçoAux=serviço.get(posição);
        System.out.println("Codigo de serviço: "+ServiçoAux.getCodServiço());
            System.out.println("Descrição: "+ServiçoAux.getDescrição());
            System.out.println("Preço: "+ServiçoAux.getPreço());
            System.out.println("Tempo de execução: "+ServiçoAux.getTempoExecução());
            System.out.println("_____________________");
    }



    public static void PrintServiços(ArrayList<Serviços> serviços){
        int i=-1;
        for(Serviços s: serviços){
            System.out.println("Codigo de serviço: "+s.getCodServiço());
            System.out.println("Descrição: "+s.getDescrição());
            System.out.println("Preço: "+s.getPreço());
            System.out.println("Tempo de execução: "+s.getTempoExecução());
            System.out.println("_____________________");
            i++;

        }
        if(i==-1){
            System.out.println("Nenhum Serviço Cadastrado!!");
        }
    }

}

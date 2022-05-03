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
            if(codigo.equals(s.getCodServiço()) || codigo.equals(s.getDescrição()) ){
                posição++;
                break;
            }
            posição++;
        }
        return posição;
    }
    //aux=ServiçoFunção.EcontraServiço(serviço,stringAuxiliar);

    public static void PrintaServiço (Serviços ServiçoAux){
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
    public static Boolean ExcluirServiço(String DescriçãoOuCodigo, ArrayList <Serviços> serviço){
        Boolean i =false;
        for(Serviços s: serviço)
            if(DescriçãoOuCodigo.equals(s.getCodServiço()) || DescriçãoOuCodigo.equals(s.getDescrição())  ){
                System.out.println("_____________________");
                System.out.println("DESCRIÇÃO: "+s.getDescrição());
                System.out.println("CODIGO: "+s.getCodServiço());
                System.out.println("_____________________");
                serviço.remove(s);
                i=true;
                break;
            }
        return i;    
    }
    public static void EditarServiço(Serviços serviço) throws Exception{
        int opção;
        LocalTime time;
        int hours,min,sec=0;
        System.out.println("1 - Codigo de serviço: "+serviço.getCodServiço());
        System.out.println("2 - Descrição: "+serviço.getDescrição());
        System.out.println("3 - Preço: "+serviço.getPreço());
        System.out.println("4 - Tempo de execução: "+serviço.getTempoExecução());
        System.out.println("_____________________");
        System.out.println("Insira a opção que deseja realizar a alteraçao : ");
        opção=input.nextInt();
        switch(opção){
            case(1):
                System.out.println("Insira o novo codigo : ");
                serviço.setCodServiço(input.next());
            break;
            case(2):
                System.out.println("Insira a nova descriçao : ");
                serviço.setDescrição(input.next());
            break;
            case(3):
                System.out.println("Insira o novo preço : ");
                serviço.setPreço(input.nextDouble());
            break;
            case(4):
                System.out.println("Insira o novo tempo de execuçao : ");
                System.out.printf("\nHoras : ");
                hours=input.nextInt();
                System.out.printf("\nMinutos : ");
                min=input.nextInt();
                time= LocalTime.of(hours, min,sec);
                serviço.setTempoExecução(time);
            break;
        }
    }

}

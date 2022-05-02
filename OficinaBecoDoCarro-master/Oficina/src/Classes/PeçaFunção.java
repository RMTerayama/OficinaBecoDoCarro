package Classes;
import Objetos.Peça;
import java.util.ArrayList;
import java.util.Scanner;

public class PeçaFunção {
    static Scanner input =new Scanner(System.in);

    public static Peça CadastrarPeças() throws Exception{
        Peça peça   = new Peça();
        System.out.println("__CADASTRO PEÇAS__");
        System.out.println("Insira o codigo da peça: ");
        peça.setCodPeça(input.next());

        System.out.println("Insira a descrição do produto: ");
        peça.setDescriçao(input.next());

        System.out.println("Insira o Valor do produto: ");
        peça.setPreço(input.nextDouble());

        System.out.println("Insira a quantidade que o estoque possui: ");
        peça.setQtdeEstoque(input.nextInt());
        return peça;
    }
    

    public static void PrintTodasPeças(ArrayList<Peça> peça){
        int i=-1;
        for(Peça p: peça){
            System.out.println("Descrição da peça: "+p.getDescricao());
            System.out.println("Codigo doo produto: "+p.getCodPeça());
            System.out.println("Valor do produto: "+p.getPreço());
            System.out.println("Quantidade que o estoque possui: "+p.getQtdeEstoque());
            System.out.println("_____________________");
            i++;
        }
        if(i==-1){
            System.out.print("Não há nenhum produto cadastrado");
        }
    }
    public static int EcontraPeça(ArrayList <Peça> peça,String codigo){
        int posição=-1;
        for (Peça p: peça){
            if(codigo.equals(p.getCodPeça())){
                break;
            }
            ++posição;
        }
        return posição;
    }

    public static void PrintPeça(ArrayList <Peça> peça,int posição){
        Peça peçaAuxiliar= new Peça();
        peçaAuxiliar=peça.get(posição);
        System.out.println("Descrição da peça: "+peçaAuxiliar.getDescricao());
        System.out.println("Codigo doo produto: "+peçaAuxiliar.getCodPeça());
        System.out.println("Valor do produto: "+peçaAuxiliar.getPreço());
        System.out.println("Quantidade que o estoque possui: "+peçaAuxiliar.getQtdeEstoque());
        System.out.println("_____________________");
    }
    public static Boolean ExcluirPeça(String codigoPeça, ArrayList<Peça> peça){
            Boolean i=false;
            for(Peça p: peça){
                if(codigoPeça.equals(p.getCodPeça())){
                    System.out.println("_____________________");
                    System.out.println("Descrição: "+p.getDescricao());
                    System.out.println("Codigo: "+p.getCodPeça());
                    System.out.println("_____________________");
                    peça.remove(p);
                    i=true;
                    break;
                }
            }
            return i;
    }
    public static void EditarPeça(int  posição, ArrayList<Peça> peça) throws Exception{
       Peça peçaAuxiliar= new Peça();
        String opção;
        peçaAuxiliar=(peça.get(posição));
        System.out.println("\n Quais informaçoes do usuario você deseja alterar?");
        System.out.printf(" Codigo.\n Descrição.\n Valor.\n Quantidade.\n Digite a opção: ");
        opção=input.next();
        if(opção.equals("codigo")||opção.equals("Codigo") ){
            System.out.printf("Insira o novo codigo: ");
            peçaAuxiliar.setCodPeça(input.next());

        }
        if(opção.equals("Descrição")||opção.equals("descrição") ){
            System.out.printf("Insira a nova descrição do produto: ");
            peçaAuxiliar.setDescriçao(input.next());
        }
        if(opção.equals("Valor")||opção.equals("valor") ){
            System.out.printf("Insira o novo valor da peça:");
            peçaAuxiliar.setPreço(input.nextDouble());
        }
        if(opção.equals("Quantidade")||opção.equals("quantidade") ){
            System.out.printf("Insira a nova quantidade que o estoque possui: ");
            peçaAuxiliar.setQtdeEstoque(input.nextInt());;
        }
    }
}
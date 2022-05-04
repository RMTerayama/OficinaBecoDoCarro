package Classes;
import Objetos.Peca;
import java.util.ArrayList;
import java.util.Scanner;

public class PecaFuncao {
    static Scanner input =new Scanner(System.in);

    public static Peca CadastrarPecas() throws Exception{
        Peca peca   = new Peca();
        System.out.println("__CADASTRO PEÇAS__");
        System.out.println("Insira o codigo da peça: ");
        peca.setCodPeca(input.next());

        System.out.println("Insira a descrição do produto: ");
        peca.setDescricao(input.next());

        System.out.println("Insira o Valor do produto: ");
        peca.setPreco(input.nextDouble());

        System.out.println("Insira a quantidade que o estoque possui: ");
        peca.setQtdeEstoque(input.nextInt());
        return peca;
    }
    

    public static void PrintTodasPecas(ArrayList<Peca> peca){
        Boolean i=false;
        for(Peca p: peca){
            System.out.println("Descrição da peça: "+p.getDescricao());
            System.out.println("Codigo do produto: "+p.getCodPeca());
            System.out.println("Valor do produto: "+p.getPreco());
            System.out.println("Quantidade que o estoque possui: "+p.getQtdeEstoque());
            System.out.println("_____________________");
            i=true;
        }
        if(i==false){
            System.out.print("Não há nenhum produto cadastrado");
        }
    }
    public static int EcontraPeca(ArrayList <Peca> peca,String codigo){
        int posicao=-1;
        for (Peca p: peca){
            if(codigo.equals(p.getCodPeca())){
                ++posicao;
                break;
            }
            ++posicao;
        }
        return posicao;
    }

    public static void PrintPeca(Peca pecaAuxiliar){
        System.out.println("\n_____________________");
        System.out.println("Descrição da peça: "+pecaAuxiliar.getDescricao());
        System.out.println("Codigo doo produto: "+pecaAuxiliar.getCodPeca());
        System.out.println("Valor do produto: "+pecaAuxiliar.getPreco());
        System.out.println("Quantidade que o estoque possui: "+pecaAuxiliar.getQtdeEstoque());
        System.out.println("_____________________");
    }
    public static Boolean ExcluirPeca(String codigoPeca, ArrayList<Peca> peca){
            Boolean i=false;
            for(Peca p: peca){
                if(codigoPeca.equals(p.getCodPeca())){
                    System.out.println("_____________________");
                    System.out.println("Descrição: "+p.getDescricao());
                    System.out.println("Codigo: "+p.getCodPeca());
                    System.out.println("_____________________");
                    peca.remove(p);
                    i=true;
                    break;
                }
            }
            return i;
    }
    public static void EditarPeca(Peca pecaAuxiliar) throws Exception{
        
        int opcao;
        System.out.println("1 - Codigo de serviço: "+pecaAuxiliar.getCodPeca());
        System.out.println("2 - Descrição: "+pecaAuxiliar.getDescricao());
        System.out.println("3 - Preço: "+pecaAuxiliar.getPreco());
        System.out.println("4 - Quantidade em estoque: "+pecaAuxiliar.getQtdeEstoque());
        System.out.println("_____________________");
        System.out.println("\n Quais informaçoes da peça você deseja alterar?");
        opcao=input.nextInt();
        switch(opcao){
        case(1):
            System.out.printf("Insira o novo codigo: ");
            pecaAuxiliar.setCodPeca(input.next());

        break;
        case(2):
            System.out.printf("Insira a nova descrição do produto: ");
            pecaAuxiliar.setDescricao(input.next());
        break;
        case(3):
            System.out.printf("Insira o novo valor da peça:");
            pecaAuxiliar.setPreco(input.nextDouble());
        break;
        case(4):
            System.out.printf("Insira a nova quantidade que o estoque possui: ");
            pecaAuxiliar.setQtdeEstoque(input.nextInt());
        break;
        }
    }
}
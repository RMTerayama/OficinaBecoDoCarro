package Classes;
import Objetos.Peça;
import java.util.ArrayList;
import java.util.Scanner;

public class PeçaFunção {
    static Scanner input =new Scanner(System.in);
    public static Peça CadastrarPeças(){
        Peça peça   = new Peça();
        System.out.println("__CADASTRO PEÇAS__");
        System.out.println("Insira o codigo da peça: ");
        peça.codPeça= input.next();

        System.out.println("Insira a descrição do produto: ");
        peça.descricao= input.next();

        System.out.println("Insira o Valor do produto: ");
        peça.preço= input.nextDouble();

        System.out.println("Insira a quantidade que o estoque possui: ");
        peça.qtdeEstoque= input.nextInt();


        return peça;
    }
    
}

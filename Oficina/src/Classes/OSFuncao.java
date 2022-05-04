package Classes;
import java.util.Scanner;
import Objetos.OrdemServico;

public class OSFuncao {
    static Scanner input =new Scanner(System.in);

    public static OrdemServico CadastraOs() throws Exception{
        OrdemServico os =new OrdemServico();
        System.out.printf("\nInsira o numero da Ordem de Serviço: ");
        os.setNumeroOs(input.nextInt());
        System.out.printf("\nInsira a placa do carro: ");
        os.setPlacaCarro(input.next());
        os.setDataOs();
        os.setSituacao('A');
        return os;
    }    
}

package Objetos;
import java.util.*;
public class OrdemServico {
    int OSNumber;
    Date OSdate;
    String FinalDateOS;
    String LicensePlate;
    String Situation;
    ArrayList<itemOS> itemOS = new ArrayList();
    public class itemOS{
        String TipoItem;
        Double Preço;
        int Quantidade;
    }
}

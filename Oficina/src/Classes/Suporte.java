package Classes;

import java.io.IOException;
//LimpaConsole é para literalmente limpar o console de execuçoes, para manter um habiente mais limpo e organizado 
//nese metodo ele basicamente verifica o sistema operacional, caso seja Windows, sera aplicado o comando "cls" no cmd
//caso contrario (linux,mac) ele aplica o comando "clear" 
public class Suporte {
    public static void LimpaConsole() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    else
        Runtime.getRuntime().exec("clear");


    }
}

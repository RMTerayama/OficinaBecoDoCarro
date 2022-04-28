package Objetos;
public class Cliente {
    String nome;
    String cpf;
    Endereço endereço;
    long fone;

    public class Endereço{
        String rua;
        int numero;
        String bairro;
        String cep;
    }
}

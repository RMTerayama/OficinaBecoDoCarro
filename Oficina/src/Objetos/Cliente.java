package Objetos;
public class Cliente {
    public String nome;
    public String cpf;
    public Endereço endereço;
    public long fone;
 
    public class Endereço{
        public String rua;
        public int numero;
        public String bairro;
        public String cep;
    }
}

package Objetos;
import java.time.LocalTime;

public class Servicos {
    /*Declaração das variaveiis do tipo privado e a manipulaçao das mesmas utilizando os metodos get e set,
    para gerenciamento sobre o acesso dos atributos e conseguindo determinar quando o atributo sera alterado*/
    private String codServico;
    private String descricao;
    private double preco;
    private LocalTime tempoExecucao; 
    
    public String getCodServico(){
        return codServico;
    }
    /*Verica se o codi*/ 
    public void setCodServico(String codServico)throws Exception{
        int qtdeNumerosDigitos= codServico.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.codServico=codServico;
        }
    } 

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao)throws Exception{
        int qtdeNumerosDigitos= descricao.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.descricao=descricao;
        }
    } 
    public double getPreco(){
        return preco;
    }
    public void setPreco(Double preco)throws Exception{
        if(preco<0){
            System.out.println("erro");
        }else{
            this.preco=preco;
        }
    } 
    public LocalTime getTempoExecucao(){
        return tempoExecucao;
    }
    public void setTempoExecucao(LocalTime tempoExecucao) throws Exception{
       /* LocalTime tempo=LocalTime.of(0,0,0); 
        if(tempo != tempoExecução){
            System.out.println("O tempo de execução deve ser diferente de 0");
        }else{*/
            this.tempoExecucao=tempoExecucao;
       // }

    }



    






}

package Objetos;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.*;
/*Declaração das variaveiis do tipo privado e a manipulaçao das mesmas utilizando os metodos get e set,
para gerenciamento sobre o acesso dos atributos e conseguindo determinar quando o atributo sera alterado*/
public class OrdemServico {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int numeroOs;
    private LocalDate dataOs;
    private LocalDate dataPrevTerminoOs;
    private LocalDate dataFinalOs;
    private String placaCarro;
    private char situacao;

    ArrayList<itemOS> itemOS;

    public int getNumeroOs(){
        return numeroOs;
    }
    public void setNumeroOs(int numeroOs)throws Exception{
        if(numeroOs<=0){
            System.out.println("numero OS invalido!");
        }else{
            this.numeroOs=numeroOs;
        }
    }
    public LocalDate getDataOs(){
        return dataOs;
    }
    public void setDataOs() throws Exception{
        
        //String hojeFormatado = hoje.format(formatter);
        this.dataOs=LocalDate.now();
    }      
    public LocalDate getDataFinalOs(){
        return dataFinalOs;
    }
    public void setDataFinalOs(LocalDate dataFinalOs) throws Exception{
       if(Character.compare(situacao, 'F')==0){
        this.dataFinalOs=LocalDate.now();
    }
    }
    public LocalDate getDataPrevTerminoOs(){
        return dataPrevTerminoOs;
    }
    public void setDataPrevTerminoOs(LocalDate dataPrevTerminoOs) throws Exception{
        this.dataPrevTerminoOs=dataPrevTerminoOs;
    }

    public String getPlacaCarro(){
        return placaCarro;
    }
    public void setPlacaCarro(String placaCarro) throws Exception{
        int qtdeNumerosDigitos= placaCarro.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.placaCarro=placaCarro;
        }
    }
    public char getSituacao(){
        return situacao;
    }
    public void setSituacao(char situacao) throws Exception{
        
        if(situacao!='A' || situacao!='C' || situacao!='F'){
            System.out.println("Situaçao invalida");
        }else{
            this.situacao=situacao;
        }
    }

    public class itemOS{
        private char tipoItem;
        private Double preco;
        private int quantidade;
        Servicos servicoOS;
        Peca pecaOS;

        public char getTipoItem(){
            return tipoItem;

        }
        public void setTipoItem(char tipoItem) throws Exception{
            

                this.tipoItem=tipoItem;
            
        }

        public Double getPreco(){
            return preco;

        }
        public void setPreco(Double preco) throws Exception{
            
            if(preco<=0){
                System.out.println("Valor invalida");
            }else{
                this.preco=preco;
            }
        }
        public int getQuantidade(){
            return quantidade;

        }
        public void setQuantidade(int quantidade) throws Exception{
            
            if(quantidade<=0){
                System.out.println("Quantidade invalida");
            }else{
                this.quantidade=quantidade;
            }
        }



    }
}

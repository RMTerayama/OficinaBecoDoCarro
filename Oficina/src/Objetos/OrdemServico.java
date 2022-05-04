package Objetos;
import java.time.LocalDateTime;
import java.util.*;
public class OrdemServico {
    private int numeroOs;
    private Date dataOs;
    private Date dataPrevTerminoOs;
    private Date dataFinalOs;
    private String placaCarro;
    private char situacao='A';
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
    public Date getDataOs(){
        return dataOs;
    }
    public void setDataOs(Date dataOS) throws Exception{
        this.dataOs=dataOs;
    }

    public Date getDataFinalOs(){
        return dataFinalOs;
    }
    public void setDataFinalOs(Date dataFinalOs) throws Exception{
        this.dataFinalOs=dataFinalOs;
    }


    public Date getDataPrevTerminoOs(){
        return dataPrevTerminoOs;
    }
    public void setDataPrevTerminoOs(Date dataPrevTerminoOs) throws Exception{
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
        
        if(Character.compare(situacao, 'A')!=0 || Character.compare(situacao, 'C')!=0 || Character.compare(situacao, 'F')!=0){
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
            
            if(Character.compare(tipoItem, 'P')!=0 || Character.compare(tipoItem, 'S')!=0 ){
                System.out.println("Situaçao invalida");
            }else{
                this.tipoItem=tipoItem;
            }
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

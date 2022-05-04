package Objetos;
public class Peca {
    private String codPeca;
    private String descricao;
    private double preco;
    private int qtdeEstoque;

    public String getCodPeca(){
        return codPeca;
    }
    public void setCodPeca(String codPeca) throws Exception{
        int qtdeNumerosDigitos= codPeca.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.codPeca=codPeca;
        }
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao) throws Exception{
        int qtdeNumerosDigitos= descricao.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.descricao=descricao;
        }
    }
    
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco) throws Exception{
        if(preco<=0){
            System.out.println("erro");
        }else{
            this.preco=preco;
        }
    }

    public int getQtdeEstoque(){
        return qtdeEstoque;
    }
    public void setQtdeEstoque(int qtdeEstoque) throws Exception{
        if(qtdeEstoque<0){
            System.out.println("erro");
        }else{
            this.qtdeEstoque=qtdeEstoque;
        }
    }
}

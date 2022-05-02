package Objetos;
public class Peça {
    private String codPeça;
    private String descriçao;
    private double preço;
    private int qtdeEstoque;

    public String getCodPeça(){
        return codPeça;
    }
    public void setCodPeça(String codPeça) throws Exception{
        int qtdeNumerosDigitos= codPeça.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.codPeça=codPeça;
        }
    }
    public String getDescricao(){
        return descriçao;
    }
    public void setDescriçao(String descricao) throws Exception{
        int qtdeNumerosDigitos= descricao.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.descriçao=descricao;
        }
    }
    
    public Double getPreço(){
        return preço;
    }
    public void setPreço(Double preço) throws Exception{
        if(preço<=0){
            System.out.println("erro");
        }else{
            this.preço=preço;
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

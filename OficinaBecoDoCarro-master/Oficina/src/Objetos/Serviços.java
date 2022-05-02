package Objetos;
import java.time.LocalTime;

public class Serviços {
    private String codServiço;
    private String descrição;
    private double preço;
    private LocalTime tempoExecução; 
    
    public String getCodServiço(){
        return codServiço;
    }
    public void setCodServiço(String codServiço)throws Exception{
        int qtdeNumerosDigitos= codServiço.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.codServiço=codServiço;
        }
    } 

    public String getDescrição(){
        return descrição;
    }
    public void setDescrição(String descrição)throws Exception{
        int qtdeNumerosDigitos= descrição.trim().split("").length;
        if(qtdeNumerosDigitos<1){
            System.out.println("erro");
        }else{
            this.descrição=descrição;
        }
    } 


    public double getPreço(){
        return preço;
    }
    public void setPreço(Double preço)throws Exception{
        if(preço<0){
            System.out.println("erro");
        }else{
            this.preço=preço;
        }
    } 
    public LocalTime getTempoExecução(){
        return tempoExecução;
    }
    public void setTempoExecução(LocalTime tempoExecução) throws Exception{
       /* LocalTime tempo=LocalTime.of(0,0,0); 
        if(tempo != tempoExecução){
            System.out.println("O tempo de execução deve ser diferente de 0");
        }else{*/
            this.tempoExecução=tempoExecução;
       // }

    }



    






}

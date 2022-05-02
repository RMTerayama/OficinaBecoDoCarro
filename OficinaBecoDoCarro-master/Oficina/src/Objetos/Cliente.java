package Objetos;
public class Cliente {


   private String nome;
   private String cpf;
   private String endereço;
   private long fone;
   
   public String getNome(){
      return nome;
   }
   public void setNome(String nome) throws Exception{
      int qtdePalavra =nome.trim().split("").length;
      if(qtdePalavra > 1){
         this.nome=nome;
      }else{
         System.out.println("O nome deve conter pelo menos duas palavras");
      }

   }
   public String getCpf(){
      return cpf;
   }

   public void setCpf(String cpf) throws Exception{
      if(cpf!=null){
         this.cpf=cpf;

      }else{
         System.out.println("Insira algo no campo: CPF");
      }
   }

   public String getEndereço(){
      return endereço;
   }

   public void setEndereço(String endereço) throws Exception{
      if(cpf!=null){
         this.endereço=endereço;

      }else{
         System.out.println("Insira algo no campo: Endereço");
      }
   }

   public long getFone(){
      return fone;
   }
   public void setFone(long fone) throws Exception{
      if(fone!=0){
         this.fone=fone;
      }else{
         System.out.println("Insira algo no campo: Telefone");
      }
   }




}

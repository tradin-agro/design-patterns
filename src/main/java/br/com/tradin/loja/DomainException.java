package br.com.tradin.loja;

public class DomainException extends RuntimeException{

     private static final long serialVersionUID = 4827203231768431639L;

     public DomainException(String mensagem){
         super(mensagem);
     }

}

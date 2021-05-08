package estrutura_dados;

import java.util.Arrays;


public class Vetor {
    private Object[] object = new Object[100];
    private int qtdObjects = 0;
    
    public void adiciona(Object aluno){
       assegureEspaco();
       this.object[this.qtdObjects] = aluno;
       this.qtdObjects++;
    }
    
    public void adiciona(int posicao, Object aluno){
        assegureEspaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição invalida");
        }
        
        for(int i  = this.qtdObjects - 1; i >= posicao;i--){
            this.object[i + 1] = this.object[i];
        }
        
        this.object[posicao] = aluno;
        this.qtdObjects++;
    }
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.qtdObjects;
    }
    
     private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= this.qtdObjects;
    }
     
    public void remove(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição invalida");
        }
        
        for(int i = posicao; i < qtdObjects -1; i++){
            object[i] = object[i + 1]; 
        }
        
        this.qtdObjects--;
    }
    
    public Object pega(int posicao){
        if(!posicaoOcupada(posicao))
            throw new IllegalArgumentException("Posição inválida");
        else 
            return this.object[posicao]; 
    }
    
    public boolean contem(Object aluno){
       for(int i = 0; i < this.qtdObjects; i++){
           if(aluno.equals(this.object[i])){
               return true;
           }
       }
       return false;
    }
    
    public int tamanho(){
        return this.qtdObjects;
    }
    
    private void assegureEspaco(){
        if(this.object.length == this.qtdObjects){
            Object[] novaLista = new Object[this.object.length * 2];
            for(int i = 0; i < this.object.length; i++){
                novaLista[i] = this.object[i];
            }
            this.object = novaLista;
        }
    }
    
    public String toString(){
      if(this.object.length == 0){
          return "[]";
      }
      
      StringBuilder builder = new StringBuilder();
      builder.append("[");
      
      for(int i = 0; i < this.qtdObjects - 1; i++){
          builder.append(this.object[i]);
          builder.append(", ");
      }
      
      builder.append(this.object[this.qtdObjects - 1]);
      builder.append("]");
      
      return builder.toString();
    }
}

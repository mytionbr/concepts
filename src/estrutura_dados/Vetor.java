package estrutura_dados;

import java.util.Arrays;
import modelo.Aluno;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int qtdAlunos = 0;
    
    public void adiciona(Aluno aluno){
       this.alunos[this.qtdAlunos] = aluno;
       this.qtdAlunos++;
    }
    
    public Aluno adiciona(int posicao, Aluno aluno){
        return null;
    }
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.qtdAlunos;
    }
    
    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao))
            throw new IllegalArgumentException("Posição inválida");
        else 
            return this.alunos[posicao]; 
    }
    
    public boolean contem(Aluno aluno){
       for(int i = 0; i < this.qtdAlunos; i++){
           if(aluno.equals(this.alunos[i])){
               return true;
           }
       }
       return false;
    }
    
    public int tamanho(){
        return this.qtdAlunos;
    }
    
    public String toString(){
      if(this.alunos.length == 0){
          return "[]";
      }
      
      StringBuilder builder = new StringBuilder();
      builder.append("[");
      
      for(int i = 0; i < this.qtdAlunos - 1; i++){
          builder.append(this.alunos[i]);
          builder.append(", ");
      }
      
      builder.append(this.alunos[this.qtdAlunos - 1]);
      builder.append("]");
      
      return builder.toString();
    }
}

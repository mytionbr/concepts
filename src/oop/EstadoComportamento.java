package oop;

import java.time.LocalDate;
import java.util.Date;

public class EstadoComportamento {
    public String nome;
    public LocalDate dataNascimento;

     public int calculaIdade(){
        LocalDate hoje = LocalDate.now();
        int idade = hoje.compareTo(dataNascimento);
        return idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

 

   
    
   
     
}

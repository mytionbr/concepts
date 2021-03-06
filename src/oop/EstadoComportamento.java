package oop;

import java.time.LocalDate;
import java.util.Date;
/*
    Na programação orientada a objetos, estados são a 
    respresentação das informação contidas pelos atributos.
    Já os comportamentos são os métodos que podem mudar o estado
    dos atributos, podem retornar novos valores ou os valores presentes nos
    atributos da classe.
*/



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

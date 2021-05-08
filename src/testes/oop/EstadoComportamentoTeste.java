package testes.oop;

import java.time.LocalDate;
import java.time.Month;
import oop.EstadoComportamento;

public class EstadoComportamentoTeste {
    public static void main(String[] args){
       EstadoComportamento pessoa = new EstadoComportamento();
       pessoa.setNome("Fulano");
       
        LocalDate data =  LocalDate.of(2000, Month.MAY, 03);
        
        
       
       pessoa.setDataNascimento(data);
       
        System.out.println(pessoa.calculaIdade());
        
       
    }
}

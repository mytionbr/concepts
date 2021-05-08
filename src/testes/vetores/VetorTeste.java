package testes.vetores;

import estrutura_dados.Vetor;
import modelo.Aluno;

public class VetorTeste {
    public static void main(String[] args){
        testaAdicionarVetor();
        testaPegarVetor();
        testaExcessaoPegarVetor();
    }
    
    private static void testaAdicionarVetor(){
        System.out.println("testaAdicionarVetor()");
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        a1.setNome("Rafael");
        a2.setNome("Alguém");
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        System.out.println(lista);
    }
    
    private static void testaPegarVetor(){
        System.out.println("testaPegarVetor()");
        
         Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        a1.setNome("Rafael");
        a2.setNome("Alguém");
        
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        Aluno aluno = lista.pega(0);
        
        System.out.println(aluno);
        
    }
    
    private static void testaExcessaoPegarVetor(){
        
        System.out.println("testaExcessaoPegarVetor()");
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        a1.setNome("Rafael");
        a2.setNome("Alguém");
        
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        Aluno aluno = lista.pega(5);
        
        
        
        System.out.println(aluno);
        System.out.println(lista.tamanho());
    }
}

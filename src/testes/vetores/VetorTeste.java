package testes.vetores;

import estrutura_dados.Vetor;
import modelo.Aluno;

public class VetorTeste {
    public static void main(String[] args){
        testaAdicionarVetor();
        testaPegarVetor();
        //testaExcessaoPegarVetor();
        testandoAdicionaPosicao();
        testandoRemovePosicao();
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
        
        Aluno aluno = (Aluno)lista.pega(0);
        
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
        
        Aluno aluno = (Aluno)lista.pega(5);
        
        
        
        System.out.println(aluno);
        System.out.println(lista.tamanho());
    }
    
    private static void testandoAdicionaPosicao(){
          System.out.println("testandoAdicionaPosicao()");
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        
        a1.setNome("Rafael1");
        a2.setNome("Alguém2");
        a3.setNome("Rafael3");
        a4.setNome("Alguém4");
        a5.setNome("Rafael5");
        a6.setNome("Alguém6");
        a7.setNome("Rafael7");
        a8.setNome("Alguém8");
        a9.setNome("Rafael9");
        
        
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        lista.adiciona(a7);
        lista.adiciona(a8);
        lista.adiciona(a9);
        
        
        lista.adiciona(2, a9);
        
        
        
        System.out.println(lista);
     }
    
    private static void testandoRemovePosicao(){
          System.out.println("testandoRemovePosicao()");
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        
        a1.setNome("Alguém1");
        a2.setNome("Alguém2");
        a3.setNome("Alguém3");
        a4.setNome("Alguém4");
        a5.setNome("Alguém5");
        a6.setNome("Alguém6");
        a7.setNome("Alguém7");
        a8.setNome("Alguém8");
        a9.setNome("Alguém9");
        
        
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        lista.adiciona(a7);
        lista.adiciona(a8);
        lista.adiciona(a9);
        
        
        lista.remove(1);
        
        
        
        System.out.println(lista);
     }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1_prova2;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Ex1_prova2 {
    static Scanner sc = new Scanner (System.in);
    /**
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    
        double receita;
        
        System.out.println("Quantidade fitas acervo: ");
        int quantidadeAcervo = sc.nextInt();
        
        System.out.println("Valor locação: ");
        double valorLocacao = sc.nextDouble();
        
        System.out.println("Preço fita nova: ");
        double valorFitaNova = sc.nextDouble();
        
        double gastoReposicao = calculandoGastosFitasRepostas (quantidadeAcervo , valorFitaNova);
        System.out.println(gastoReposicao);
        
        receita = calculoReceita(quantidadeAcervo, valorLocacao);
        System.out.println(receita);
        
        double lucroAnual = calculandoLucro(receita , gastoReposicao);
        System.out.println(lucroAnual);
        
        indicandoSituacaoFinanceira (lucroAnual);
        
    }
    
    public static double calculoReceita(int acervo, double locacao){
        double receita = 0;
        receita += ((acervo * 0.2) * locacao) ; 
        receita += ((acervo * 0.1) * locacao) * 2; 
        receita += ((acervo * 0.15) * locacao) * 3; 
        receita += ((acervo * 0.25) * locacao) * 4; 
        receita += ((acervo * 0.3) * locacao) * 5 ; 
    
        return receita * 12;
        
        /*   
            receita = (quantFitas * 0.2f * 1 +
                       quantFitas * 0.1f * 2 + 
                       quantFitas * 0.15f * 3 +
                       quantFitas * 0.25f * 4 +
                       quantFitas * 0.3f * 5 +) * 12 * locacao;
        */
    }
    
    public static double calculandoGastosFitasRepostas (int acervo, double fitaNova){
        double gastoReposicao;
        
        gastoReposicao = ((int) (acervo * 0.03) / 2) * fitaNova;
    
    
        return gastoReposicao;
    }
    
    public static double calculandoLucro (double receita, double gasto){
        double lucroAnual;
        lucroAnual = receita - gasto -( 2500 * 12);
    
    
    
    
        return lucroAnual;
    }
    
    public static void indicandoSituacaoFinanceira (double lucro){
    
        if (lucro < 0 )
            System.out.println(" Prejuízo");
        else if (lucro < 36000)
            System.out.println(" Baixo");
        else 
            System.out.println("Alto");
    
    
    
    
    }
}
  
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_prova2;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Ex2_prova2 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0 ;
        int primeiroTermo = 0; 
        int segundoTermo = 0;
        
        n = lendoQuantidadeTermos(n);
        
        
       
        primeiroTermo = lendoTermos("primeiro");
        segundoTermo = lendoTermos("segundo");
        
        while (primeiroTermo < 0 || primeiroTermo > segundoTermo ) {
            System.out.println("Termo inválido: ");
            
            primeiroTermo = lendoTermos("primeiro");
            segundoTermo = lendoTermos("segundo");
        
        }
        
        

        gerandoSerie (primeiroTermo, segundoTermo, n);
       
        
        
    }
    
    public static int lendoQuantidadeTermos (int n ){
        System.out.println("Quantidade de termos que devem ser gerados: ");
        n = sc.nextInt();
       while ( n < 3 || n > 100){
           System.out.println("Erro, digite novamente: ");
           n = sc.nextInt();
       }
    
        return n;
    }
    
    public static int lendoTermos(String valor){
        System.out.println("Digite o " +valor+ " termo: ");
         
        return sc.nextInt(); 
    }
    
    public static void gerandoSerie(int primeiroTermo, int segundoTermo , int n){
        int novo;
        System.out.print(primeiroTermo+ " ");
        System.out.print(segundoTermo+ " ");
        for (int i = 3 ; i <= n ; i++){
            if (i % 2 == 1)
                novo = primeiroTermo + segundoTermo;
            else 
                novo = segundoTermo - primeiroTermo;
            
            primeiroTermo = segundoTermo;
            segundoTermo = novo;
            System.out.print(novo+ " ");
        }
    }
    
}

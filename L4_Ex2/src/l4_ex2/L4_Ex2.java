/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex2;

import java.util.Scanner;


public class L4_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         double numero1 = sc.nextDouble();
         double numero2 = sc.nextDouble();
         
         double resultadoSubtracao = subtracao (numero1, numero2);
         double resultadoSoma = soma (numero1, numero2);
         double resultadoMultiplicacao = multiplicacao (numero1, numero2);
         double resultadoDivisao = divisao (numero1, numero2);
           
         System.out.println(resultadoSubtracao);
         System.out.println(resultadoSoma);
         System.out.println(resultadoMultiplicacao);
         System.out.println(resultadoDivisao);
         
         
    }
    
    public static double subtracao (double x , double y) {
        
        double diminuindo = x - y;
        
        return diminuindo;
    }
    
    public static double soma (double x , double y) {
    
        double somando = x + y;
        
        return somando;
    }
    
    public static double multiplicacao (double x , double y) {
        
        double multiplicando = x * y;
        
        return multiplicando;
    }
    
    public static double divisao (double x , double y) {
        
        double dividindo = x / y ; 
        
        
        return dividindo;
    }
    
}

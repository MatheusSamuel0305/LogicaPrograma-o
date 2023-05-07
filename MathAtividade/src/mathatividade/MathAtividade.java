/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathatividade;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class MathAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         double numero1, numero2, resultado;
         
         numero1 = sc.nextDouble();
          numero2 = sc.nextDouble();
          
          resultado = numero1 - numero2;
          
         if (numero1 < numero2){
            resultado =  Math.abs(resultado);
            
         }
         
         System.out.println (resultado);
         
    }
    
}

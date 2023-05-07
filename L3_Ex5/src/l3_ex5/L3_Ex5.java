/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex5;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        
        int menor = numero1; //// Assume que o primeiro número é o menor
        
        if (numero2 < menor)
        {
        menor = numero2;
        
        
        
        } if (numero3 < menor){
        
            menor = numero3;

        }
        
        System.out.println(menor);
        
        
            
    
            }   
    
}

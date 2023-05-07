/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12_modularizaçao;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Aula12_modularizaçao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int c, d;
        
        System.out.println("Digite o primeiro valor");
        int a = sc.nextInt();
        
        System.out.println("Digite o segundo valor valor");
        int b = sc.nextInt();
        
        if (a % 2 == 0 && b % 2 == 0 )
            c = a + b;
        
        else if (a % 2 != 0 && b % 2 !=0) 
            c = a - b;
        else {
            c = a * b;
        }
        
        if (a % 2 == 0 && c % 2 == 0 )
            d = a + c;
        
        else if (a % 2 != 0 && c % 2 !=0) 
            d = a - c;
        else {
            d = a * c;
        }
        
        System.out.println("Valor C:" +c);
         System.out.println("Valor D:" +d);
    }
    
}

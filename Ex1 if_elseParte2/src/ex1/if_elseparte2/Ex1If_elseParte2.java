/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.if_elseparte2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex1If_elseParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1 , numero2;
        
        
        System.out.print ("numero um:");
        numero1 = Integer.valueOf(input.nextLine());
        
        System.out.print ("numero dois:");
        numero2 = Integer.valueOf(input.nextLine());
        
        if (numero1 == numero2){
        System.out.println("Os numeros são iguais");
    } else 
            if (numero1 > numero2){
               System.out.println ("O primeiro numero é maior");
    }
            else System.out.println ("O segundo numero é maior");
                
    }
}

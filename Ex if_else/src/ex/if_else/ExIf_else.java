/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.if_else;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExIf_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
               int numero1 , numero2; 
               
               
               System.out.print("Digite o primeiro numero:");
               numero1 = Integer.valueOf(input.nextLine());
               
               System.out.print("Digite o segundo numero");
               numero2 = Integer.valueOf(input.nextLine());
               
               
               if(numero1 != numero2) {
                   System.out.println ("Os numeros são diferentes");
               }
               
               else 
                   System.out.println("Os numeros sao iguais");
    }
    
}

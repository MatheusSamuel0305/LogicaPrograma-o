/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.if_else2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExIf_else2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float numero1 , numero2 ;
        
        System.out.print("Digite o primeiro numero:");
        numero1 = Float.valueOf(input.nextLine());
        
        System.out.print ("Digite o segundo numero:");
        numero2 = Float.valueOf(input.nextLine());
        
        if (numero1 > numero2)
            
            System.out.println ("o numero maior é:" +numero1);
            else System.out.println ("o numero maior é:" +numero2);
        
    }
    
    
    
}

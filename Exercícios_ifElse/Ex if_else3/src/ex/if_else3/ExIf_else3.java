/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.if_else3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExIf_else3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float preco , total;
        int qntd;
        
        System.out.print ("Digite o preço do produto:");
        preco = Float.valueOf(input.nextLine());
        
        System.out.print ("Digite a quantidade:");
        qntd = Integer.valueOf(input.nextLine());
        
        if (preco < 0 || qntd < 0)
            System.out.println ("Erro");
        
        else{
    
        total = qntd * preco;
       
        System.out.println ("Total:" +total);
        
      }
    }
}
    
    
        /*



*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex3;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
     
       double pesoKg = sc.nextDouble();
       double altura = sc.nextDouble();
       
       double imc = pesoKg / (altura * altura);
       
        System.out.println(imc);
       
       if (imc < 20)
            System.out.println("magro");
       
       else if (imc < 25) 
            System.out.println("normal");
       
       else if (imc < 30)
            System.out.println("sobrepeso");
       
       else 
            System.out.println("obeso");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex6;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        sc.close();
        
        int temp; //variavel temporaria, defini ela para armazenar os maiores valores
        
        if (num1 > num2) {
        
        temp = num1; 
        num1 = num2;
        num2 = temp;
        
        
        } if (num1 > num3) {
        
            temp = num1;
            num1 = num3;
            num3 = temp;
        
        } 
            if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
            
            }
            
            System.out.println(num1 );
            System.out.println(num2);
            System.out.println(num3);
     
    }
    
}



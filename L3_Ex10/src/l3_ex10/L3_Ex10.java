/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex10;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
     
         int x = sc.nextInt();
         int y = sc.nextInt();
         int z = sc.nextInt();
         
         if (x > y +z || y > x + z ) 
         {
             System.out.println("não é um triangulo");
         }
    }
    
}

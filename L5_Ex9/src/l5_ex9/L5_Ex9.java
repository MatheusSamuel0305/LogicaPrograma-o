/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex9;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex9 {
static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n = 0;
    int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
        do{
          n = sc.nextInt();
          if(n > 0){
         maximo = Math.max(maximo, n);
         minimo = Math.min(minimo, n);
          }
        } while(n !=0);
        
        
        System.out.println(maximo);
        System.out.println(minimo);
        
        
        
        
        
           
    }
    
}

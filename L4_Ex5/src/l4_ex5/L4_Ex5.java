/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex5;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex5 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int numero1 = sc.nextInt();
       efetuarDivisao(numero1);
    }
    
    
    public static void efetuarDivisao(int num1){
        
        int numero2 = sc.nextInt();
        
        if( num1 %  2 == 0)
                    System.out.println("Numero par:" +num1);
                else 
                    System.out.println("Numero impar:" +num1);
        
        
        
                
                
                
    }
}


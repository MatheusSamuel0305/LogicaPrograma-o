/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex12;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex12 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = lerNumero();
       double A = calculeSerie(n);
        System.out.println(A);
       
    }
    
    public static int lerNumero(){
        System.out.println("Digite a quantidade de vezes que o número 1 sera dividido: ");
    return sc.nextInt();
    }
    
    public static double calculeSerie(int n){
        
        double A = 0;
        for (int i = 1 ; i <=n ; i++){
            
            A = A + (double) 1 / i;
            
            
        }
        
        
    return A ;
    }

}
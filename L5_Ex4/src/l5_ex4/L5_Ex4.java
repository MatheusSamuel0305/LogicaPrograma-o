/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex4;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex4 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = sc.nextInt();
        int resultado;
        for (int i = 0 ; i <= 10 ; i++ ){ //Inverti os sinais
            
            resultado = i * num;
            System.out.println(resultado);
        
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex6;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex6 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero1 = sc.nextInt();
        
        validarConceito(numero1);
        
    }
    
    public static void validarConceito(int x){
        
        if (x  < 49) //Errei o sinal, inverti
            System.out.println("Insuficiente");
        
       else if (x < 64)
            System.out.println("Regular");
        
       else if (x < 84)
            System.out.println("Bom");
        
       else
            System.out.println("Ótimo");
        
        //ERREI: PRECISEI POR O else if
        
        
        
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv1_while;
    
    import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Atv1_while {
    
    static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int idade = sc.nextInt();
        
       
        
        
        
        while (idade < 0 || idade > 100){
        
            idade = sc.nextInt();
        
        }
        int futuro = idade + 5;
        
        System.out.println(futuro);
                
        
    }
    
}

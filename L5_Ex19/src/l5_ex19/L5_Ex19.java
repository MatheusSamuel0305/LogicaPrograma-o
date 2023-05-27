/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex19;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex19 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite o limite inferior (em graus celsius): ");
        double limiteInferior = sc.nextDouble();
        
         System.out.println("Digite o limite superior (em graus celsius): ");
         double limiteSuperior = sc.nextDouble();
         
         System.out.println("Digite o incremento (em graus celsius): ");
         double incremento = sc.nextDouble();
         
         for (double celsius = limiteInferior ; celsius <= limiteSuperior; celsius+= incremento){
             double fahrenheit = celsius * 1.8 + 32;
             System.out.printf("%.2fºC\t %.2fºF%n", celsius, fahrenheit);
         
         }
    }
    
}

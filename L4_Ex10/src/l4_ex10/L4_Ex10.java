/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex10;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex10 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double peso = sc.nextDouble();
       double altura = sc.nextDouble();
       double imc = efetuarCalculo(peso, altura);
       
       if (imc > 25)
            System.out.println("Acima do peso");
        System.out.println(imc);
               
       
    }
    
    public static double efetuarCalculo(double x , double y){
    
        return x / ( y * y);
    
    }
    
}



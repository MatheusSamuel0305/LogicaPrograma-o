/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex12;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex12 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int comparando = validandoMenor(num1 , num2, num3);
        System.out.println(comparando);
    }
    
    public static int validandoMenor (int num1 , int num2 , int num3){ // A VARIAVEL NAO PODE COMEÇAR COM NUMERO
    
        int menor1e2 = Math.min(num1 , num2);
        int menor = Math.min(menor1e2, num3);
        return menor;
}
    
}

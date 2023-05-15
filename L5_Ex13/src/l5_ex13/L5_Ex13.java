/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex13;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex13 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = leiaNumero();
        gereSerieFibonacci(n);
    }
    
    public static int leiaNumero(){
        int n;
        
        do{
        System.out.print("Leia um numero inteiro");
        n = sc.nextInt();
        } while (n < 3 || n > 20);
        return n;
    }
    
    public static void gereSerieFibonacci(int n){
        int ultimo  , penultimo, novo;
        
        System.out.println("Dgite o primeiro termo da serie:");
        penultimo = sc.nextInt();
        System.out.println("Digite o segundo termo da série:");
        ultimo = sc.nextInt();
        System.out.print(penultimo);
        System.out.print(ultimo);
        
        for (int i = 2 ; i < n ; i++){
            novo = ultimo + penultimo;
            System.out.println(novo);
            penultimo = ultimo;
            ultimo = novo;
        
        
        }
        
    
    
    
    }
    
}

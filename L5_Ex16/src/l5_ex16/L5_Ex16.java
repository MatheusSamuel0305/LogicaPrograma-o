/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex16;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex16 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double angGraus, angRad, seno;
        
        System.out.println("Digite um angulo em graus: ");
        angGraus = sc.nextDouble();
        
        angRad = Math.toRadians(angGraus);
        seno = calculeSeno(angRad);
        
        System.out.println("O seno de " +angGraus+ " graus é: " +seno);
    }
    public static double calculeSeno(double rad){
        double potencia , divisao, soma = 0;
        int fatorial, temp = 1;
        
        for (int i = 1 ; i <= 15 ; i = i + 2){
            potencia = Math.pow(rad, i);
            fatorial = calculeFatorial (i);
            divisao = (potencia / fatorial) * temp;
            temp = temp * -1;
            soma += divisao;
        
        }
        return soma;
    }
    
    
    public static int calculeFatorial (int n){
        int fat = 1;
        for (int i = 2 ; i <= n ; i ++){
            fat += i;
        }
        
        return fat;
    
    
    }
    
}

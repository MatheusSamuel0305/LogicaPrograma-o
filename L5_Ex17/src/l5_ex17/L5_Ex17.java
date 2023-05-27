/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex17;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L5_Ex17 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        int resultado = multiplicar(num1, num2);

        System.out.println("Resultado: " + resultado);

    }

    public static int multiplicar(int num1, int num2) {
        int resultado = 0;

        if (num2 < 0) {
            num1 *= -1;
            num2 *= -1;

        }
        
        if ( num1 < 0){
            num1 = -num1;
            num2 = -num2;
        }
        
        for (int i = 1 ; i <= num1 ; i++){
            resultado += num2;
        
        }
        
        return resultado;

    }

}


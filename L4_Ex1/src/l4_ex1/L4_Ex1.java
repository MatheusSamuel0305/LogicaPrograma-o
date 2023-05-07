/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex1;

import java.util.Scanner;

    

public class L4_Ex1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        
        double resultadoArea = area (base , altura); //resultado é onde sera armazenado o valor da função (area) e o argumento é a variavel base e altura.
        double resultadoPerimetro = perimetro (base , altura);
        System.out.println("Resultado Area:" +resultadoArea);
        System.out.println(resultadoPerimetro);
        
        
       
        
    }
    
    public static double area (double x , double y){
        
       double multiplicacao = x * y;
    
        return multiplicacao;
    }
    
    public static double perimetro (double x, double y){
        
       double soma = x + x + y + y;
    
        return soma;
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex4;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex4 {
    
    static Scanner sc = new Scanner (System.in);

    
    public static void main(String[] args) {
        
        System.out.println("Temperatura Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = conversao(celsius);
        System.out.println("Temperatura Fahrenheit:"+fahrenheit);
        
    }
    
    public static double conversao(double c){
    
        return 9.0/5.0 * c + 32; //DOIS ERROS: ESQUECI DE DECLARAR O PARÂMETRO E USEI COMO SIMBOLO DE MULTIPLICAÇAO O PONTO 
        //Outro erro: A divisão 9/5 estava sendo realizada com operandos inteiros, o que faz com que o resultado seja truncado para um número inteiro,
         //ou seja, o resultado será 1 em vez de 1.8. Isso afeta o resultado final da conversão para Fahrenheit, tornando-o impreciso. 
        //Para corrigir esse problema, você pode alterar a divisão para 9.0/5.0 ou 9d/5d, que irá forçar a divisão a ser realizada com valores de ponto flutuante em vez de inteiros.
    }
    
}

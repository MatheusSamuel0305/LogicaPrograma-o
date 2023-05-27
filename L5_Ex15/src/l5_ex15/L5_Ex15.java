/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex15;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex15 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano;
        int A = 120;
        int B = 80;
        double aumentoPopulacionalA = 0;
        double aumentoPopulacionalB = 0;
        int i;

        for ( i = 0 ; A > B ; i++){
            aumentoPopulacionalA = A * 0.015;//ERRO: NÃO ESTOU ALTERANDO OS VALORES DE A E B, PORTANDO O LAÇO 'FOR' SERA EXECUTADO INFINITAMENTE
            aumentoPopulacionalB = B * 0.035;
            
            A += aumentoPopulacionalA;
            B += aumentoPopulacionalB;
        }
        
        System.out.println(i);
    }
    
}

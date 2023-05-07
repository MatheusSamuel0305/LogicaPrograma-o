/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex8;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double salario = sc.nextDouble();
     
        char categoria = sc.next().charAt(0); //Nova linha, entrada de dados tipo caractere
        double aumento;
        
        switch(categoria) {
        
            case 'A' : 
            case 'H' :
                aumento = 0.10;
                break;
                
            case 'B' :
            case 'D' :
            case 'E' :
                aumento = 0.15;
                break;
                
            case 'C' :
            case 'F' :
                aumento = 0.25;
                break;
                
            default : 
                aumento = 0.30;
                break;
        
        }
        
        double salarioReajustado = salario + (salario * aumento);
        System.out.println(salarioReajustado);
    }
    
}

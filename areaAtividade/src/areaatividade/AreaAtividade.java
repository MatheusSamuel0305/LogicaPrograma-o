/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaatividade;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class AreaAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        
        int tipoFigura;
        double area = 0, base, altura;//DECLARAÇAO VARIAVEIS
        
        System.out.println ("1 - quadrado " + "\n2 - triangulo");
        tipoFigura = sc.nextInt();
        
        System.out.print ("Base:");
        base = sc.nextDouble();
        System.out.print ("Altura:");
        altura = sc.nextDouble(); //ENTRADA DE DADOS 
        
        if (tipoFigura == 1) {
            area = base * altura;
            System.out.printf("%.2f%n" , area);
        } else {
        area = (base * altura) / 2;
        System.out.printf("%.2f%n" , area);
        }
        
        
        
        
   
        
        
    }
    
}

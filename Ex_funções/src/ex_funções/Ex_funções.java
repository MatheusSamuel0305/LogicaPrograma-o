/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_funções;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex_funções {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precoAntigo, precoNovo, acrescimo;
        
        precoAntigo = leiaValor();
        precoNovo = leiaNovoValor();
        if (precoAntigo >=  precoNovo){
        System.out.println("ERRO");}
    
        acrescimo = calculeAcrescimo(precoNovo, precoAntigo);
        System.out.println(acrescimo);
        
        
    }
    
    public static double leiaValor () {
    Scanner sc = new Scanner (System.in);
    
    System.out.print ("Valor antigo:");
    return sc.nextDouble();
            
    }
    
    public static double leiaNovoValor() {
    Scanner sc = new Scanner (System.in);
    
    System.out.print ("Valor novo:");
    return sc.nextDouble();
    
    }
    
    
    public static double calculeAcrescimo(double valorNovo, double valorAntigo) {
    
        double antigo = (valorNovo - valorAntigo) * 100;
    
    
    return antigo / valorAntigo;
    }
    
    
}

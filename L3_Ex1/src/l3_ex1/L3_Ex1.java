/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex1;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
        double precoWatt = sc.nextDouble(); //ESQUECI DOS PARENTESES PARA LEITURA DE DADOS
        int qntd_gasta = sc.nextInt();
        
      double conta =  precoWatt * qntd_gasta;
      double contaAtraso = (conta * 0.1) + conta ;
      
        System.out.println(conta);
        System.out.printf(  "%.2f\n"  , contaAtraso); // linha nova!!
      
      if (qntd_gasta > 70) {
          System.out.println("Consumo elevado");
      } else {
          System.out.println("Consumo consciente");
      }
    } //sout + tab = System.out.println(");
    
}

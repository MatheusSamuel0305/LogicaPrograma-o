/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.if_else4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExIf_else4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
          float preco , total ;
          int quilowatts;
          char atraso; //DECALRAÇAO DAS VARIAVEIS
          
          System.out.print ("Preço:");
          preco= Float.valueOf(input.nextLine());
          System.out.print ("Quilowatts:");
          quilowatts = Integer.valueOf(input.nextLine());
          System.out.print ("Atraso");
          atraso = input.nextLine().charAt(0); //ENTRADA DE DADOS
          
          total = preco * quilowatts; //PROCESSAMENTO
          
          if (atraso == 'S' || atraso == 's'){
              total = total + total * 10/100 ;
              System.out.println("Total:" +total);
          } 
          else {
              System.out.println("Total:" +total);
          } //SAÍDA DE DADOS
    
}
}

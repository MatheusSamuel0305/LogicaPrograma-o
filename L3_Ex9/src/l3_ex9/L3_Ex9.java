/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex9;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
      int tipoOperacao = sc.nextInt();
      double saldoAtual = sc.nextDouble();  
       double valorOperacao = sc.nextDouble();
       double novoValor = 0;
      switch (tipoOperacao){
      
          case 1 :novoValor = saldoAtual + valorOperacao; //ESQUECI DE ATRIBUIR O VALOR DA OPERAÇAO A UMA VARIAVEL
          break;
          
          case 2 : novoValor = saldoAtual - valorOperacao;
          break;
          
          default : System.out.println("operaçao invalida");
              break;  
    }
      
      System.out.println(novoValor);
 
      if (novoValor < 0 )  
          
          System.out.println("Serasa"); 
      
      
      
      
        
              
      
      
}
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv_função;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Atv_Função {

    
    public static void main(String[] args) {
       
       
       Scanner sc = new Scanner (System.in);
       
       
     
       int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
         int numero3 = sc.nextInt();
         
          System.out.println("Digite o tipo de operação (1, 2 ou 3):");
         
         int tipo_operacao = sc.nextInt();
         
         double mediaCalculada;
         
         
       
         
        mediaCalculada = (double) calculoMedia(numero1, numero2, numero3, tipo_operacao );
        
         
        System.out.println(mediaCalculada);
           
    }
    
    public static double calculoMedia(double num1 ,double num2,double num3 , int tipo_operacao) {
          Scanner sc = new Scanner (System.in);
          
          double media = 0;
          switch (tipo_operacao){
              case 1 : media = ( num1 + num2 + num3 ) / 3;
                      break;
              
              case 2 : media =  (num1 * 1 + num2 * 2 + num3 * 2 ) / 5;
                      break;
              
              case 3 : media = (double) Math.cbrt (num1 * num2 * num3);
                break;
                
              default : 
                  break;
                
               
                  
              
          }  
          
          return media;

    }
    
}

    


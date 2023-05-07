
package exercicio.pkg6_lista1;

import java.util.Scanner;


public class Exercicio6_Lista1 {

   
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      float celsius, fahrenheit; //DECLARANDO VARIAVEIS
      
      System.out.print ("digite a temperatura em celsius:");
      celsius = Float.valueOf(input.nextLine()); //ENTRADA DE DADOS
      
      fahrenheit = 9/5f * celsius + 32; //PROCESSAMENTO => SEM O F (FLOAT), O CODIGO NAO FUNCIONA POIS EM VEZ DE ARMAZENAR UM NUMERO REAL, ESTA ARMAZENANDO UM NUMERO INTEIRO
      
      System.out.println("A temperatura em fahrenheit é:" +fahrenheit); //SAÍDA DE DADOS
      
      
    }
    
}

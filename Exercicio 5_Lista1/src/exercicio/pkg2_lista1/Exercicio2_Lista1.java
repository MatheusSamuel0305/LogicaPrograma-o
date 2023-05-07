
package exercicio.pkg2_lista1;

import java.util.Scanner;


public class Exercicio2_Lista1 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int base,altura,area,perimetro; /*DECLARAÇÃO DAS VARIÁVEIS*/
       
       System.out.print ("Digite a base do retângulo:");
       base = Integer.valueOf(input.nextLine());
       System.out.print ("Digite a altura do retângulo:");
       altura = Integer.valueOf (input.nextLine());
       
       area = base * altura;
       perimetro = 2 * base + 2 * altura;
       
       System.out.println ("A área do retângulo é: " +area);
       System.out.println ("O perímetro do retângulo é: "+perimetro);
       
    }
    
}

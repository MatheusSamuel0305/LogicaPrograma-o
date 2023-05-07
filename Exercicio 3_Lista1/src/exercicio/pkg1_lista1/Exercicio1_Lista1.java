
package exercicio.pkg1_lista1;

import java.util.Scanner;


public class Exercicio1_Lista1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero1,numero2,quadradoDaSoma; /*declaraçao das variaveis */
        System.out.print ("Digite um numero:");
        numero1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite outro numero");
        numero2 = Integer.valueOf(input.nextLine()); /*entrada de dados*/
        
        quadradoDaSoma = numero1 * numero1 + numero2 * numero2; /*processamento*/
        System.out.println ("A soma dos quadrados deste numero é" +quadradoDaSoma);
    }
    
}

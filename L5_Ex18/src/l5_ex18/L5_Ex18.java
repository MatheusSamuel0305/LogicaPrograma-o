/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex18;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L5_Ex18 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite o numero do canal (-1 para encerrar): ");
        int canal = sc.nextInt();
        int totalPessoas = 0;
        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal7 = 0;
        int audienciaCanal12 = 0;

        while (canal != -1) {
            

            if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                System.out.println("Digite o numero de pessoas assistindo: ");
                int pessoasAssistindo = sc.nextInt();

                switch (canal) {
                    case 4:
                        audienciaCanal4 += pessoasAssistindo;
                        break;

                    case 5:
                        audienciaCanal5 += pessoasAssistindo;
                        break;

                    case 7:
                        audienciaCanal7 += pessoasAssistindo;
                        break;

                    case 12:
                        audienciaCanal12 += pessoasAssistindo;
                        break;

                } //FECHAMENTO SWITCH

                totalPessoas += pessoasAssistindo;
                
                System.out.println("Digite o numero do canal (-1 para encerrar): ");
                canal = sc.nextInt();

            }/*FECHAMENTO IF*/ else {
                System.out.println("Código invalido, digite novamente: ");
                canal = sc.nextInt();

            } //FECHAMENTO ELSE

        } //FECHAMENTO WHILE
        
        System.out.println("===Relatório de Audiência ===");
        
        if (totalPessoas == 0) {
            System.out.println("Nenhum dado de audiência foi registrado");
        } else {
            System.out.printf("Canal 4: %.2f  de audiência %n" ,  ((double) audienciaCanal4 / totalPessoas) * 100);
            System.out.printf("Canal 5: %.2f  de audiência %n" ,  ( (double) audienciaCanal5 / totalPessoas) * 100);
            System.out.printf("Canal 7: %.2f  de audiência %n" , ( (double) audienciaCanal7 / totalPessoas) * 100);
            System.out.printf("Canal 12: %.2f  de audiência %n" ,  ((double) audienciaCanal12 / totalPessoas) * 100);
        
        
        
        
        }
        
    } //FECHAMENTO MAIN

} //FECHAMENTO CLASS

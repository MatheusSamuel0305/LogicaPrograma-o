/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3_ex2;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L3_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
     
           int prova1 = sc.nextInt();
           int prova2 = sc.nextInt();
           int trabalho = sc.nextInt();
           
           if (trabalho >= 6 && (prova1 >= 6 || prova2 >= 6)){
               System.out.println("Aprovado");}
            //PRECISO QUE A PREPOSIÇÃO PROVA1 >= 6 || PROVA 2 >= 6 SEJAM SEPARADAS POR PARENTESES
           else {
               System.out.println("reprovado");}
           
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_prova;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex2_prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        float nota_portugues, nota_matematica, nota_conhGerais, media;
        boolean aprovado; //DECLARAÇAO VARIAVEIS 
        
        System.out.print ("Digite o nome do candidato:");
        nome = input.nextLine();
        
        System.out.print ("Digite sua nota em portugues:");
        nota_portugues = Float.valueOf(input.nextLine());
        
         System.out.print ("Digite sua nota em matematica:");
        nota_matematica = Float.valueOf(input.nextLine());
        
         System.out.print ("Digite sua nota em conhecimentos gerais:");
        nota_conhGerais = Float.valueOf(input.nextLine()); //ENTRADA DE DADOS
        
        media = (nota_portugues + nota_matematica + nota_conhGerais)/3;
        
         aprovado =  media>=7 && (nota_portugues >=8 && nota_matematica >=8) || (nota_portugues >=8 && nota_conhGerais >=8)|| (nota_matematica >=8 && nota_conhGerais>=8); 
        
        System.out.println("O nome do candidato é:" +nome);
        System.out.println("O candidato foi aprovado?:" +aprovado);
        
        
        
        

    }
    
}

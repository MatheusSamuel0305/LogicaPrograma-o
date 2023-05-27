/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex14;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L5_Ex14 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int quantidadeMasculino = 0;
        int quantidadeFeminino = 0;
        int quantidadeIndefinido = 0;
        int quantidadeExperiencia = 0;
        int quantidadeSemExperiencia = 0;
        int somaIdadeExperiencia = 0;
        int somaIdadeSemExperiencia = 0;
        int quantidadeExperienciaMenor35 = 0;
        int idadeMaisJovem = Integer.MAX_VALUE; //the maximum possible Integer number that can be represented
        int idade;
        char genero;

        do {
            System.out.println("Digite o gênero do candidato (M/F/I ou X para terminar): ");
            genero = sc.next().charAt(0);
            genero = Character.toUpperCase(genero);

            if (genero != 'X') {
                System.out.println("Digite a idade do candidato: ");
                idade = sc.nextInt();

                if (idade < idadeMaisJovem) {
                    idadeMaisJovem = idade;

                }
                System.out.println("Possui experiência no serviço? (S/N): ");
                char experiencia = sc.next().charAt(0);
                experiencia = Character.toUpperCase(experiencia);

                if (genero == 'M') {
                    quantidadeMasculino++;

                } else if (genero == 'F') {
                    quantidadeFeminino++;

                } else if (genero == 'I') {
                    quantidadeIndefinido++;

                }

                if (experiencia == 'S') {
                    quantidadeExperiencia++;
                    somaIdadeExperiencia += idade;

                    if (idade < 35) {
                        quantidadeExperienciaMenor35++;

                    }

                } else if (experiencia == 'N') {
                    quantidadeSemExperiencia++;
                    somaIdadeSemExperiencia += idade;

                }

            } //FECHAMENTO IF (GENERO != 'X');

        } while (genero != 'X');
        
        double mediaIdadeExperiencia = quantidadeExperiencia > 0 ? (double) somaIdadeExperiencia / quantidadeExperiencia : 0;
        double mediaIdadeSemExperiencia = quantidadeSemExperiencia > 0 ? (double) somaIdadeSemExperiencia / quantidadeSemExperiencia : 0;
        double percentualExperienciaMenor35 = quantidadeExperiencia > 0 ? (double) quantidadeExperienciaMenor35 / quantidadeExperiencia * 100 : 0;
        
        System.out.println("Quantidade de candidatos por gênero: ");
        System.out.println("Masculino: " +quantidadeMasculino);
        System.out.println("Masculino: " +quantidadeFeminino);
        System.out.println("Masculino: " +quantidadeIndefinido);
        System.out.println();
        
        System.out.println("Quantidade de candidatos com experiência no serviço: " + quantidadeExperiencia);
        System.out.println("Quantidade de candidatos sem experiência no serviço: " + quantidadeSemExperiencia);
        System.out.println();
        
        System.out.println("Idade média dos candidatos com experiência no serviço: " +mediaIdadeExperiencia );
        System.out.println("Idade média dos candidatos sem experiência no serviço: " +mediaIdadeSemExperiencia);
        System.out.println();
        
        System.out.println("Percentual de candidatos com experiência no serviço e idade inferior a 35: " +percentualExperienciaMenor35);
        System.out.println();
        
        System.out.println("Idade do candidato mais jovem: " +idadeMaisJovem);
    }
}

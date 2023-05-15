/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex5;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex5 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int turma = 45;
         int contIdadeMenor18 = 0;
         int contAltura170 = 0;
         int somaAltura170 = 0;
         int contIdadeMaior20 = 0;
         int somaAltura20 = 0;
         
            for (int i = 1 ; i <= turma ; i++){
                
                System.out.println("Idade do " +i+ " aluno:");
                int idade = sc.nextInt();
                
                System.out.println("Altura do " +i+ " aluno:");
                double altura = sc.nextDouble(); //ALTURA É DOUBLE
                
                if (idade < 18){
                    contIdadeMenor18++;
                }
                
                if (altura < 1.7) {
                    contAltura170++;
                    somaAltura170 += altura;
                }
                if (idade > 20) {
                    contIdadeMaior20++;
                    somaAltura20 += altura;
                }
            
            
            }
         
            double mediaIdadeMenor170 = (double)somaAltura170 / contAltura170;
            double mediaAltura20 = (double)somaAltura20 / contIdadeMaior20;
            
            //QUANDO DIVIDIMOS VALORES DECIMAIS PRECISAMOS DEIXAR EXPLICITO QUE É UM DOUBLE
            
            System.out.println(contIdadeMenor18);
            System.out.println(mediaIdadeMenor170);
            System.out.println(mediaAltura20);
        
       
    
    
    
        
    }
    
}

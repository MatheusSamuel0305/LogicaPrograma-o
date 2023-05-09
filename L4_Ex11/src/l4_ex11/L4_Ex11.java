/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex11;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex11 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double prova1 = sc.nextDouble();
        double prova2 = sc.nextDouble();
        double trabalho = sc.nextDouble();
        
        boolean aprovado = validandoNota(prova1, prova2 , trabalho);
        
        if (aprovado){
            System.out.println("Aprovado");
        } else{
            System.out.println("Desaprovado");
        }
    }
    
    public static boolean validandoNota(double nota1 , double nota2 , double notaTrabalho){

        boolean aprovado = notaTrabalho >= 7 && (nota1 >=6 || nota2 >=6);
                
        return aprovado;



}
}

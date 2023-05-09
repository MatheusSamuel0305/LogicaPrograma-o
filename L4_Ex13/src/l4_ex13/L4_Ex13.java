/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex13;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex13 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int abscissa = sc.nextInt();
        int ordenada = sc.nextInt();
        
        localizandoQuadrante(abscissa, ordenada);
    }
    
    public static void localizandoQuadrante(int x , int y){
        int quadrante;
        
        if (x > 0 && y > 0){
            System.out.println("1");
        
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    
    
    
    }
    
    
}

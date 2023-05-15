/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex8;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex8 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n ;
        int contNum = 0;
        int soma = 0;
        
        do{
        n = sc.nextInt();
            if (n != 0 && n > 0){
                
                contNum++;
                soma += n;
                
            } else if (n < 0) {
                System.out.println("NaN");
            }
        
        
        } while (n != 0);
        
        double media = (double) soma / contNum;
        System.out.println(media);
        System.out.println(contNum);
        System.out.println(soma);
    }
    
}

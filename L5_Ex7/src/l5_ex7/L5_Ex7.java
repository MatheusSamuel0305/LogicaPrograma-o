/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex7;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex7 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        int soma = 0;
        int contNum = 0; //ESQUECI DE INICIALIZAR
        
        do{
        n = sc.nextInt();       
        if (n != 0){
        soma += n;
        contNum++;
        }
       } while(n != 0);
           
            
        
        
        
        
        double media = (double)soma / (contNum == 0 ? 1 : contNum);
        //Note que, no cálculo da média, verificamos se 
        //o contNum é igual a 0 para evitar uma divisão por 0, e, caso isso ocorra, 
        //consideramos que há apenas 1 número na média (o último valor diferente de 0 digitado pelo usuário).
        
        System.out.println(contNum );
        System.out.println(soma);
        System.out.println(media);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex6;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex6 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int qntd_funcionarios = sc.nextInt();
        char categoria = sc.next().charAt(0);
        double salarioAtual = sc.nextDouble();
       double salarioReajustado = efetuandoAumento(salarioAtual, categoria);
        System.out.println(salarioReajustado);
    }
    
    public static double efetuandoAumento(double salarioAtual, char categoria){
    
        switch (categoria){
        
            case 'a': salarioAtual += salarioAtual * 0.10; //Há um erro na declaração dos casos (case) do switch.  
                                                         //O correto é colocar a letra "a", "b" e "c" entre aspas simples, indicando que são caracteres.
                break;
                
            case 'b': salarioAtual += salarioAtual * 0.12;
                break;
                
           case 'c': salarioAtual += salarioAtual * 0.14;
                break;
                
           case 'd': salarioAtual += salarioAtual * 0.16;
                break;
                
                
           case 'e': salarioAtual += salarioAtual * 0.18;
                break;
            
           case 'f': salarioAtual += salarioAtual * 0.20;
                break;
            
           case 'g': salarioAtual += salarioAtual * 0.22;
                break;
                
                
           case 'h': salarioAtual += salarioAtual * 0.24;
                break;
                
           case 'i': salarioAtual += salarioAtual * 0.26;
                break;
                
           case 'j': salarioAtual += salarioAtual * 0.28;
                        
                break;     
                
           default: salarioAtual += salarioAtual * 0.3;
           
           
                
              
                
                
              
           
        }
        
    
       return salarioAtual;
                
    
    }

}


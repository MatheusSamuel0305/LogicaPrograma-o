/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex10;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L5_Ex10 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        
            do{
                System.out.println("1 – Inclusão de cliente.");
                System.out.println("2 – Alteração de cliente.");
                System.out.println("3 – Exclusão de cliente.");
                System.out.println("4 – Visualização de cliente.");
                System.out.println("5 – Sair.");
                opcao = sc.nextInt();
                
                
                switch (opcao){
                case 1: System.out.println("1 – Inclusão de cliente.");
                    break;
                    
                case 2 : System.out.println("2 – Alteração de cliente.");
                    break;
                    
                case 3: System.out.println("3 – Exclusão de cliente.");
                    break;
                    
                case 4 :System.out.println("4 – Visualização de cliente.");
                    break;
                    
                default : System.out.println("Codigo invalido");
            
            
            }
                
            } while (opcao !=5);
            
            
            switch (opcao){
                case 1: System.out.println("1 – Inclusão de cliente.");
                    break;
                    
                case 2 : System.out.println("2 – Alteração de cliente.");
                    break;
                    
                case 3: System.out.println("3 – Exclusão de cliente.");
                    break;
                    
                case 4 :System.out.println("4 – Visualização de cliente.");
                    break;
                    
                default : System.out.println("Codigo invalido");
            
            
            }
            
                
            
            
            
            
            
            
           
       
    }
    
}

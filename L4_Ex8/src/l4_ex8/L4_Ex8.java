/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex8;

    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex8 {
    
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double valorVenda = sc.nextDouble();
        int condicaoPagamento = sc.nextInt();
        
        double valorFinal = efetuarOperacoes(valorVenda , condicaoPagamento); 
        
        System.out.println(valorFinal);
        
        
    }
    
        public static double efetuarOperacoes (double venda , int pagamento){
            
            double resultado = 0;
            
            switch (pagamento){
                case 1 :  resultado = venda - venda * 0.1;
                        break;
                
                case 2 : resultado = venda - venda * 0.05;
                    break;
                    
                case 3 : resultado = venda;
                    break;
                    
                case 4 : resultado = venda + venda * 0.05;
                    break;
                    
                case 5 : resultado = venda - venda * 0.07;
                    break;
                    
                case 6 : resultado = venda - venda * 0.05;
                    break;
                    
                    
                    
                
               
                    
                    
        }
            return resultado;
        }
    
}

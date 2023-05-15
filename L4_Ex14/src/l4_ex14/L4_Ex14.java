/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex14;

import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex14 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int numConta = sc.nextInt();
        double saldo = sc.nextDouble();
        int tipo_operacao = sc.nextInt();
        double valorDaOperacao = sc.nextDouble();
        double novo_saldo = efetuandoCalculo(saldo , valorDaOperacao, tipo_operacao);
        //System.out.println(novo_saldo);
    }
    
        public static double efetuandoCalculo (double saldoAtual, double valorDaTransacao, int operacao){
        
            switch (operacao) {
                
                case 1 :  saldoAtual += valorDaTransacao;
                    break;
                case 2 : saldoAtual -= valorDaTransacao;
                    break;
                
                default : System.out.println("Numero invalido");
            }
            
            if (saldoAtual < 0)
                System.out.println("Conta Estourada:" +saldoAtual );
            
            else 
                System.out.println("Progresso:" +saldoAtual);
            
            
            
           
            
            return saldoAtual;
            
            
        
        
        }
    
    
}

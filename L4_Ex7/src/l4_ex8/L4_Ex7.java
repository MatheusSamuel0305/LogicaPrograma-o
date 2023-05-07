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
public class L4_Ex7 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double saldo = sc.nextDouble();
        double taxaJuros = sc.nextDouble();
        
        double novoSaldo = efetuarJuros(saldo, taxaJuros);
        System.out.println(novoSaldo);
        
    }
    
    public static double efetuarJuros(double saldo, double juros){
    
    
        saldo += saldo * (juros / 100);
    
        return saldo;
    }
    
}

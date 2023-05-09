/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex9;
    
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex9 {
    static Scanner sc = new Scanner (System.in);
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario_minimo = sc.nextDouble();
        int carrosVendidos = sc.nextInt();
        double valorDaVenda = sc.nextDouble();
        double comicoes = salario_minimo + efetuarAdicional(carrosVendidos , valorDaVenda);
        System.out.println(comicoes);
    }
    
    public static double efetuarAdicional(double qntVendida, double valorTotal){
        
        double resultado = qntVendida * 150 + (0.05 * valorTotal) ;
    
        return resultado;
    }
    
}

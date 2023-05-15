/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriefibonaccidesafio_l5;
    import java.util.Scanner;   
/**
 *
 * @author mathe
 */
public class SerieFibonacciDesafio_L5 {
    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, penultimo, ultimo;

        num = leiaNumero();
        //gereSerieFibonacci(num);

        penultimo = leiaTermosRicci("primeiro");
        ultimo = leiaTermosRicci("segundo");
        gereSerie(num, penultimo, ultimo);
        //gereSerieRicci(num, penultimo, ultimo);
        
    }

    public static int leiaTermosRicci(String valor) {
        int termo;

        System.out.println("Digite o " + valor + " termo para Ricci: ");
        termo = sc.nextInt();

        return termo;
    }

    public static void gereSerieRicci(int n, int penultimo, int ultimo) {
        gereSerie(n, penultimo, ultimo);
    }

    public static int leiaNumero() {
        int num;

        System.out.println("Digite um número entre 3 e 20: ");
        num = sc.nextInt();

        while (num < 3 || num > 20) {
            System.out.println("Número inválido. Digite novamente: ");
            num = sc.nextInt();
        }

        return num;
    }

    public static void gereSerie(int n, int penultimo, int ultimo) {
        int novo;

        System.out.print(penultimo + " " + ultimo + " ");
        for (int i = 2; i < n; i++) {
            novo = ultimo + penultimo;
            System.out.print(novo + " ");
            penultimo = ultimo;
            ultimo = novo;
        }
       // System.out.println();
    }
    
}  

    /* public static void gereSerieFibonacci(int n) {
        gereSerie(n, 0, 1);
    }
}

    
      /*  int num, penultimo, ultimo, novo;
        
        num = leiaNumero();
        gereSerieFibonacci(num);
        
        penultimo = leiaTermosRicci("primeiro");
        ultimo = leiaTermosRicci("segundo");
        gereSerieRicci(num, penultimo, ultimo);
    }
    
    public static int leiaTermosRicci(String valor) {
        int penultimo;
        
        System.out.println("Digite o " +valor+ " termo para Ricci: ");
        
        return sc.nextInt();
        
    
    
    }
    
    public static void gereSerieRicci(int n, int penultimo, int ultimo) {
       gereSerie(n , penultimo, ultimo);
    
    }
    
    public static int leiaNumero(){
        int num;
        
        System.out.println("Digite um numero entre 3 e 20: ");
        num = sc.nextInt();
        
        while (num < 3  || num > 20) {
            System.out.println("Digite o numero novamente ");
            num = sc.nextInt();
        
        }
        
        return num;
    
    }
    
    public static void gereSerie (int n, int penultimo,int ultimo ){
        int novo = 0;
        
        System.out.println(penultimo + " " + ultimo + " ");
        for (int i = 2; i < n; i++) { //i = contador , n = quantidade
            novo = ultimo + penultimo;
            System.out.println(novo + " ");
            penultimo = ultimo;
            ultimo =  novo;
        
        
        }
    
    
    
    }
    
    public static void gereSerieFibonacci (int n ) {
        gereSerie (n , 0 , 1);
    } */
    
    
    


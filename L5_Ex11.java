/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5_ex11;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class L5_Ex11 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char continuar;
        int quantidadeAlunos = 0, quantidadeAlunosRendaSuperior = 0;
        double rendaMensal, gastoAlimentacao, gastoAluguel, outrosGastos, gastoTotal, proporcaoAlimentacao, proporcaoAluguel, somaGastoTotalRendaSuperior = 0,somaGastoAluguel = 0;

        do {

            rendaMensal = leiaContas("renda mensal:");
            gastoAlimentacao = leiaContas("gastos com alimentação:");
            gastoAluguel = leiaContas("gastos com aluguel:");
            outrosGastos = leiaContas("outros gastos:");

            gastoTotal = efetuandoGastoTotal(gastoAlimentacao, gastoAluguel, outrosGastos);
            System.out.println("Gasto Total: R$" + gastoTotal);
            proporcaoAlimentacao = proporcao_alimentacaoRenda(gastoAlimentacao, rendaMensal);
            System.out.println("Porcentagem de gastos com alimentação: " +proporcaoAlimentacao);
            proporcaoAluguel = proporcao_aluguelRenda(gastoAluguel, rendaMensal);
            System.out.println("Porcentagem de gastos com aluguel:  "  +proporcaoAluguel);

            if (rendaMensal > 2000) {
                somaGastoTotalRendaSuperior += gastoTotal;
                quantidadeAlunosRendaSuperior++;

            }
            
            somaGastoAluguel += gastoAluguel;

            System.out.println("Deseja registrar mais algum aluno? (S/N)");
            continuar = sc.next().charAt(0);// Nao entendi porque preciso declarar fora do laço do-while

            quantidadeAlunos++;
            
            

        } while (Character.toUpperCase(continuar) == 'S');

       double mediaAluguel = efetuandoMediaAluguel(quantidadeAlunos, somaGastoAluguel); //soma dividido pela quantidade 
        System.out.println("Media aluguel:  " +mediaAluguel);
        double mediaRendaSuperior = calculoTotalMediaRendaSuperior(quantidadeAlunosRendaSuperior, somaGastoTotalRendaSuperior);
        System.out.println("Media total gastos renda superior: " +mediaRendaSuperior);
        
        

    }

    public static double leiaContas(String contas) {

        System.out.println("Digite os(a)" + contas);
        return sc.nextDouble();

    } //Entrada de dados

    public static double efetuandoGastoTotal(double alimentacao, double aluguel, double outros) {

        return alimentacao + aluguel + outros;

    }

    public static double proporcao_alimentacaoRenda(double alimentacao, double renda) {

        return (double) (alimentacao / renda) * 100 ;
    }

    public static double proporcao_aluguelRenda(double aluguel, double renda) {

        return (double) (aluguel / renda) * 100;
    }

    public static double efetuandoMediaAluguel(int quantidadeAlunos, double somaAluguel) {
        
       return (double) somaAluguel / quantidadeAlunos;
    }

    public static double calculoTotalMediaRendaSuperior(int quantidadeRendaSuperior, double somaTotalGasto) {
        return (double) somaTotalGasto / quantidadeRendaSuperior ;

    }
}


/* 

public static double efetuandoMediaAluguel(int n, double aluguel) {
        double somaAluguel = 0;

        for (int i = 0; i < n; i++) {
            somaAluguel += aluguel;
        }

        return somaAluguel / n;
    }
   import java.util.Scanner;

public class L5_Ex11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char continuar;

        do {
            double rendaMensal = leiaContas("renda mensal:");
            double gastoAlimentacao = leiaContas("gastos com alimentação:");
            double gastoAluguel = leiaContas("gastos com aluguel:");
            double outrosGastos = leiaContas("outros gastos:");

            double gastoTotal = efetuandoGastoTotal(gastoAlimentacao, gastoAluguel, outrosGastos);

            double alimentacaoRenda = proporcao_alimentacaoRenda(gastoAlimentacao, rendaMensal);

            double aluguelRenda = proporcao_aluguelRenda(gastoAluguel, rendaMensal);

            System.out.println("Gasto total: " + gastoTotal);
            System.out.println("Proporção de gastos com alimentação em relação à renda: " + alimentacaoRenda);
            System.out.println("Proporção de gastos com aluguel em relação à renda: " + aluguelRenda);

            System.out.println("\nDeseja registrar mais algum aluno? (S/N)");
            continuar = sc.next().charAt(0);
        } while (Character.toUpperCase(continuar) == 'S');

        double gastoMedioAluguel = efetuandoMediaAluguel(); // Cálculo do gasto médio com aluguel
        System.out.println("Gasto médio com aluguel: " + gastoMedioAluguel);

        double gastoTotalMedio = efetuandoMediaGastoTotal(); // Cálculo do gasto total médio para renda familiar > R$ 2000,00
        System.out.println("Gasto total médio dos alunos com renda familiar superior a R$ 2000,00: " + gastoTotalMedio);
    }

    public static double leiaContas(String contas) {
        System.out.println("Digite " + contas);
        return sc.nextDouble();
    }

    public static double efetuandoGastoTotal(double alimentacao, double aluguel, double outros) {
        return alimentacao + aluguel + outros;
    }

    public static double proporcao_alimentacaoRenda(double alimentacao, double renda) {
        return alimentacao / renda;
    }

    public static double proporcao_aluguelRenda(double aluguel, double renda) {
        return aluguel / renda;
    }

    public static double efetuandoMediaAluguel() {
        int quantidade = 0;
        double somaAluguel = 0;

        System.out.println("Digite a quantidade de alunos:");
        quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o gasto com aluguel do aluno " + (i + 1) + ":");
            double gastoAluguel = sc.nextDouble();
            somaAluguel += gastoAluguel;
        }

        return somaAluguel / quantidade;
    }

    public static double efetuandoMediaGastoTotal() {
        int


*/

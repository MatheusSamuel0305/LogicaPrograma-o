/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4_ex15;
    import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class L4_Ex15 {
    static Scanner sc = new Scanner(System.in);
    static double descontos = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double salarioBruto = sc.nextDouble();
        int dependentes = sc.nextInt();
        double salarioLiquido = efetuandoINSS(salarioBruto);
        double salarioLiquidoFinal = efetuandoImpostoDeRenda(salarioLiquido);
        double total = salarioLiquidoFinal * dependentes + (250 * dependentes);
        System.out.println(total);
        
        
        
    }
    
        public static double efetuandoINSS (double bruto){
        
            if (bruto < 2000)
                descontos = bruto - bruto * 0.08;
            
            else
                descontos = bruto - bruto * 0.11;
            
            
            
            return descontos;
        }
        
        public static double efetuandoImpostoDeRenda (double bruto){
        
            if (bruto < 2500)
                descontos = bruto;
            
            else if (bruto < 5000)
                descontos = bruto - bruto * 0.075;
            
            else if (bruto < 10000)
                descontos = bruto - bruto * 0.15;
            else
                descontos = bruto - bruto * 0.27;
           
            
            
            
            return descontos;
        }
    
    
}


/*package l4_ex15;

public class L4_Ex15 {
    static Scanner sc = new Scanner(System.in);
    static final double INSS_LOWER_RATE = 0.08;
    static final double INSS_HIGHER_RATE = 0.11;
    static final double IR_LOWER_RATE = 0;
    static final double IR_MIDDLE_RATE = 0.075;
    static final double IR_HIGHER_RATE = 0.15;
    static final double IR_TOP_RATE = 0.27;
    static final double DEPENDENT_BONUS = 250;

    
    public static void main(String[] args) {
        double grossSalary = sc.nextDouble();
        int dependents = sc.nextInt();

        double netSalary = calculateNetSalary(grossSalary);
        double finalSalary = calculateFinalSalary(netSalary, dependents);
        System.out.println(finalSalary);
    }

    
    public static double calculateNetSalary(double grossSalary) {
        double netSalary;
        if (grossSalary < 2000) {
            netSalary = grossSalary - grossSalary * INSS_LOWER_RATE; rate = taxa// net = liquido
        } else {
            netSalary = grossSalary - grossSalary * INSS_HIGHER_RATE;
        }
        return netSalary;
    }

   
    public static double calculateFinalSalary(double netSalary, int dependents) {
        double irRate;
        double finalSalary = netSalary;
        if (netSalary < 2500) {
            irRate = IR_LOWER_RATE;
        } else if (netSalary < 5000) {
            irRate = IR_MIDDLE_RATE;
        } else if (netSalary < 10000) {
            irRate = IR_HIGHER_RATE;
        } else {
            irRate = IR_TOP_RATE;
        }
        finalSalary -= netSalary * irRate;
        finalSalary += dependents * DEPENDENT_BONUS;
        return finalSalary;
    }
}
*/
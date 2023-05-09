import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0;
		
		if (salario <= 2000) {System.out.println("Isento");
		}
		else if (salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		} else if (salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.8 ;
		} else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.8;
		}
		
		System.out.println(imposto);
		
	}

}

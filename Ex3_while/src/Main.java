import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int gasolina = 0 , diesel = 0 , alcool = 0;
		
		int tipo = sc.nextInt();
		
		
		
		while (tipo !=4) {
			if ( tipo == 1){
				alcool = alcool + 1;
			} 
			else if (tipo == 2) {
				diesel = diesel + 1 ;
			} 
			else if (tipo ==3) {
				gasolina = gasolina + 1;
			}
			
			tipo = sc.nextInt();
		}
		
		System.out.println("Muito obrigado:" );
		System.out.println("Alcool:" +alcool );
		System.out.println("Gasolina:" +gasolina );
		System.out.println("Diesel:" +diesel );
	}

}

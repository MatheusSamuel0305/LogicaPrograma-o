import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1 ; x >= i ; i++ ) {
			
			if (i % 2 != 0 ) {
				System.out.println(i); // atalho sysout + ctrl + espaço
			}
			
			
		}					//for (DECLARAR valor_inicial , condição , incremento ou decremento )

	}

}

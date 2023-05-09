import java.util.Scanner;
public class main_intervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int out = 0;
		int in = 0;
		
		for (int i = 0 ; x > i ; i++) {
			if (x >=10 && x <= 20) {
				in = + 1;
			} 
			else {
				out = + 1;
			}
		}
		System.out.println(out);
		System.out.println(in);
		

	}

}

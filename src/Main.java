import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = 0, par = 0;
		
		
		while (numero != 50) {
			
			numero = numero + 1;
			par = par + 2;
			System.out.println(par);
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	private void start() {
		System.out.println("Palavra ou frase: ");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		
		System.out.println("Por caractere: ");
		
		char[] letras = texto.toCharArray();
		String textoCompleto = "";
		
		for (int i = letras.length - 1; i >= 0; i--) {
			System.err.print(letras[i]);
			textoCompleto += letras[i];
		}
		
		System.out.println();
		System.out.println("String: " + textoCompleto);
	}
}

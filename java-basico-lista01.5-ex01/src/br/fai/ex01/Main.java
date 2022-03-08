package br.fai.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	private void start() {
		
		leituraValor();
		
	
	}
	public void leituraValor() {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite primeiro valor: ");
			int n1 = scanner.nextInt();
			
			System.out.println("Digite segundo valor: ");
			int n2 = scanner.nextInt();
			
			System.out.println("Digite terceiro valor: ");
			int n3 = scanner.nextInt();
			
			System.out.println("Digite quarto valor: ");
			int n4 = scanner.nextInt();
			
			
			calculoMaior(n1, n2, n3, n4);
			
		}
		
	public void calculoMaior(int n1, int n2, int n3, int n4) {
		
		int menor1 = Math.min(n1, n2);
		int menor2 = Math.min(n3, n4);
		int menor = Math.min(menor1, menor2);
		
		int maior1 = Math.max(n1, n2);
		int maior2 = Math.max(n3, n4);
		int maior = Math.max(maior1, maior2);
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Maior valor: " + maior);
		
		
		if (maior > 50) {
			System.out.println("Valor muito alto");
		} else {
			System.out.println("valor normal");
		}
	}

}

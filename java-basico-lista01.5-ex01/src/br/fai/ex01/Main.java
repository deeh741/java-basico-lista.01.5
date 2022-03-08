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
			
			int valor1 = 0;
			int valor2 = 0;
			int valor3 = 0;
			int valor4 = 0;
			
			int i = 0;
			while (i <4) {
				System.out.print("Digite o valor " + i + ": " );
				int valorLido = scanner.nextInt();
				
				switch (i) {
				case 0: 
					valor1 = valorLido;
					break;
				
				case 1: 
					valor2 = valorLido;			
					break;
				case 2: 
					valor3 = valorLido;
					break;
				case 3: 
					valor4 = valorLido;
					break;
				default:
					System.out.println("Valor invalido");
					break;
				}
				i += 1;
			}
			
			calculoMaior(valor1, valor2, valor3, valor4);
			
		}
		
	public void calculoMaior(int valor1, int valor2, int valor3, int valor4) {
		
		
		int maiorValor = Math.max(valor1, Math.max(valor2, Math.max(valor3, valor4)));
		int menorValor = Math.min(valor1, Math.min(valor2, Math.min(valor3, valor4)));
		
		
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Maior valor: " + maiorValor);
		
		
		if (maiorValor > 50) {
			System.out.println("Valor muito alto");
		} else {
			System.out.println("valor normal");
		}
	}

}

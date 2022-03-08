package br.fai.ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	private void start() {
		System.out.println("Frase :");
		Scanner scanner = new Scanner(System.in);
		String valor = scanner.nextLine();
		
		if (valor.isEmpty()) {
			System.out.println("Nada foi digitado.");
		} else {
			String[] palavras = valor.split(" ");
			System.out.println("Penultima Palavra: " + palavras[palavras.length - 2]);
			
			if (palavras.length > 4) {
				System.out.println("Texto muito longo.");
			}
		}
	}
}	

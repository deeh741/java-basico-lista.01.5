package br.fai.ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	private void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("String: ");
		String valor = scanner.nextLine();
		
		int valorConvertido = Integer.parseInt(valor);
		System.out.printf("Int %d", valorConvertido);
		
	}
}

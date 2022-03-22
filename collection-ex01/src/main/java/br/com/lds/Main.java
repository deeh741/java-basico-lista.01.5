package br.com.lds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private Scanner scanner = new Scanner(System.in);
	private final String RETORNO_INVALIDO = "INVALIDO";

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {

		List<String> lista = new ArrayList<String>();

		while (lista.size() < 5) {

			String textoDigitado = obterDados();

			if (!textoDigitado.isEmpty() && textoDigitado != RETORNO_INVALIDO) {
				lista.add(textoDigitado);
			}
		}

		System.out.println("-------------------------------------");

		for (String itemDaLista : lista) {
			System.out.println("Valor digitado: " + itemDaLista);
		}

		lista.add("Item adicionado automaticamente 01");
		lista.add("Item adicionado automaticamente 02");

		System.out.println("-------------------------------------");

		for (String itemDaLista : lista) {
			System.out.println("Valor digitado: " + itemDaLista);
		}

		lista.remove(1);
		lista.remove(1);

		System.out.println("-------------------------------------");

		for (String itemDaLista : lista) {
			System.out.println("Valor digitado: " + itemDaLista);
		}
	}

	private String obterDados() {
		try {
			System.out.println("Digite o valor: ");

			int valor = scanner.nextInt();

			return String.valueOf(valor);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Dados invalidos");

			scanner.next();
			return RETORNO_INVALIDO;
		}
	}
}

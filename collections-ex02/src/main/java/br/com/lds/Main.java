package br.com.lds;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private Map<String, String> mapa = new HashMap<String, String>();

	private void start() {

		adicionarItensNoMapa();
		iterarMapa();

		System.out.println("---------------------------");
		exibirValorDoMapaPelaChave("SRS");
		exibirValorDoMapaPelaChave("MG");

		mapa.put("SRS", "Santa Rita");
		iterarMapa();
	}

	private void adicionarItensNoMapa() {

		try {
			mapa.put("SRS", "Santa Rita do Sapucai");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conceição dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void iterarMapa() {
		for (String chave : mapa.keySet()) {

			String valor = mapa.get(chave);

			System.out.println("Chave: " + chave + " | valor: " + valor);
		}
	}

	private void exibirValorDoMapaPelaChave(String chave) {

		try {

			if (mapa.containsKey(chave)) {
				String valor = mapa.get(chave);
				System.out.println("Valor: " + valor);
			} else {
				System.out.println("Chave: " + chave + " nao existe.");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Ocorreu um erro");
		} finally {
			System.out.println("------------------------");
		}

	}

}

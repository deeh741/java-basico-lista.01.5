package br.com.lds;

import br.com.lds.models.Animal;
import br.com.lds.models.Cachorro;
import br.com.lds.models.Gato;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {

		Animal cachorro = new Cachorro("Tiburssinho");
		Animal gato = new Gato();
		Cachorro segundoCachorro = new Cachorro("Aroldo");

		cachorro.som();
		cachorro.dizerMeuNome();
		cachorro.dizerMinhaIdade();

		System.out.println("--------------------------");

		segundoCachorro.oQueGostoDeFazer();

		System.out.println("--------------------------");

		gato.som();
		gato.dizerMeuNome();
		gato.dizerMinhaIdade();
		System.out.println("Cor do primeiro gato: " + gato.getCor());

		Animal segundoGato = new Gato("Azul");
		System.out.println("Cor do segundo gato: " + segundoGato.getCor());

	}
}

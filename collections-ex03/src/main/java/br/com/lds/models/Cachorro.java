package br.com.lds.models;

public class Cachorro extends Animal {

	public Cachorro(String nome) {

	}

	@Override
	public void som() {

		// super.som();

		System.out.println("Eu gosto de Latir");
	}

	public void oQueGostoDeFazer() {
		System.out.println("Gosto de morder os carteiros =D");
	}

}

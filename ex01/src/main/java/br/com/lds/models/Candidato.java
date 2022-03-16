package br.com.lds.models;

public class Candidato {

	public Candidato(int idQueFoiPassadoNoConstrutor, String nomeQueFoiPassadoNoConstrutor) {

		this.id = idQueFoiPassadoNoConstrutor;
		this.nome = nomeQueFoiPassadoNoConstrutor;

		this.numeroDeVotos = 0;
	}

	private int id;
	private String nome;
	private int numeroDeVotos;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void adicionarVoto() {
		this.numeroDeVotos += 1;
	}

	public int getNumeroDeVotos() {
		return numeroDeVotos;
	}

}

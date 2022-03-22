package br.com.lds.models;

public abstract class Animal {

	public void som() {
		System.out.println("Esse e o som padrao de um animal: zzzzzzz");

	}

	public void dizerMeuNome() {
		System.out.println("Ainda nao tenho um nome");
	}

	public void dizerMinhaIdade() {
		System.out.println("Ainda nao tenho uma idade");
	}

	private String cor = "preto";
	private int idade = 5;
	private String nome = "Não identificado";

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

}

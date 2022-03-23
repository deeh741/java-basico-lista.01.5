package br.com.lds.models;

public class Animal {

	public void som() {
		System.out.println("Esse e o som padrao de um animal: zzzzzzz");

	}

	public void dizerMeuNome() {
		System.out.println("Meu nome eh: " + getNome());
	}

	public void dizerMinhaIdade() {
		System.out.println("Minha idade é: " + getIdade());
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

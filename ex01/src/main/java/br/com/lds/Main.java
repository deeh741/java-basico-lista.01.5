package br.com.lds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.com.lds.models.Candidato;

public class Main {

	private Map<Integer, Candidato> mapaDeCandidatos = new HashMap<Integer, Candidato>();

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	private void start() {

		incializarMapaDeCanditados();

		while (true) {

			int voto = obterVoto();
			if (voto == 0) {
				break;
			}

			registrarVoto(voto);

		}

		apurarVotos();
	}

	private void apurarVotos() {

		List<Candidato> candidatos = new ArrayList<Candidato>();

		for (Candidato candidato : mapaDeCandidatos.values()) {
			candidatos.add(candidato);
		}

		candidatos.sort((a, b) -> {
			return b.getNumeroDeVotos() - a.getNumeroDeVotos();
		});

		Candidato candidatoEleito = candidatos.get(0);

		if (candidatoEleito.getNumeroDeVotos() == 0) {
			System.out.println("Nenhum camdidato foi votado.");
			return;
		}

		System.out.println("O candidato eleite eh: " + candidatoEleito.getNome() + "com"
				+ candidatoEleito.getNumeroDeVotos() + "votos");

		System.out.println("-----------------------------");

		for (int i = 0; i < candidatos.size(); i++) {

			Candidato candidato = candidatos.get(i);

			System.out
					.println("Lugar " + (i + 1) + ": " + candidato.getNome() + " com " + candidato.getNumeroDeVotos());

		}

	}

	private void registrarVoto(int voto) {

		if (mapaDeCandidatos.containsKey(voto)) {

			Candidato candidato = mapaDeCandidatos.get(voto);
			System.out.println("Candidato votado: " + candidato.getNome());

			candidato.adicionarVoto();

			System.out.println("Obrigado pelo seu voto!");

		} else {
			System.out.println("Candidato(a) inexistente. Tente novamente.");
		}

	}

	private int obterVoto() {

		System.out.println("Digite seu voto: ");

		Scanner scanner = new Scanner(System.in);

		try {

			return scanner.nextInt();

		} catch (Exception e) {
			System.out.println("Voto invalido");
			return -1;
		}

	}

	private void incializarMapaDeCanditados() {

		Candidato joao = new Candidato(1, "Joao");
		mapaDeCandidatos.put(joao.getId(), joao);

		Candidato maria = new Candidato(2, "Maria");
		mapaDeCandidatos.put(maria.getId(), maria);

		Candidato jose = new Candidato(3, "Jose");
		mapaDeCandidatos.put(jose.getId(), jose);

		Candidato antonio = new Candidato(4, "Antonio");
		mapaDeCandidatos.put(antonio.getId(), antonio);

		Candidato tiburssinho = new Candidato(5, "Tiburssinho");
		mapaDeCandidatos.put(tiburssinho.getId(), tiburssinho);

	}

}

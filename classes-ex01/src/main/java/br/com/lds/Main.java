package br.com.lds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private Scanner scanner = new Scanner(System.in);

	private void start() {

		boolean emExecucao = true;
		while (emExecucao) {

			exibirMenu();

			int opcao = -1;

			try {
				opcao = scanner.nextInt();
			} catch (Exception e) {
				scanner.next();

				System.out.println(e.getMessage());
				System.out.println("Ocorreu um erro. Tente novamente.");
				System.out.println("--------------");

				continue;
			}

			switch (opcao) {
			case 1:
				cadastrarCavalo();
				break;
			case 2:
				cadastrarGirafa();
				break;
			case 3:
				listarCavalo();
				break;
			case 4:
				listarGirafa();
				break;
			case 5:
				listarTodosOsAnimais();
				break;
			case 6:
				removerUmAnimalPorId();
				break;
			case 7:
				exibirAQuantidadeDeAnimaisPorTipo();
				break;
			case 8:
				System.out.println("Saindo...");
				emExecucao = false;
				break;
			default:
				System.out.println("Opcao invalida.");
				break;
			}

		}

	}

	private void exibirMenu() {
		System.out.println("1. Cadastrar cavalo");
		System.out.println("2. Cadastrar girafa");
		System.out.println("3. Listar cavalo");
		System.out.println("4. Listar girafa");
		System.out.println("5. Listar todos os animais");
		System.out.println("6. Remover um animal por id");
		System.out.println("7. Exibir a quantidade de animais por tipo");
		System.out.println("8. sair");

		System.out.println("Sua opção: ");
	}

	private void cadastrarCavalo() {

	}

	private void cadastrarGirafa() {

	}

	private void listarCavalo() {

	}

	private void listarGirafa() {

	}

	private void listarTodosOsAnimais() {

	}

	private void removerUmAnimalPorId() {

	}

	private void exibirAQuantidadeDeAnimaisPorTipo() {

	}

}

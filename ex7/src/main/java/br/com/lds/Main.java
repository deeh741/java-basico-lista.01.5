package br.com.lds;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private final int VALOR_MINIMO_DO_TAMANHO_DO_ARRAY = 2;
	private final int VALOR_MAXIMO_DO_TAMANHO_DO_ARRAY = 5;

	private final int VALOR_MINIMO_DO_CONTEUDO_DO_ARRAY = -100;
	private final int VALOR_MAXIMO_DO_CONTEUDO_DO_ARRAY = 100;

	private int[] gerarArrayComValoresAleatorios() {
		
		int tamanhoDoArray = obterValorAleatorio(VALOR_MINIMO_DO_TAMANHO_DO_ARRAY, VALOR_MAXIMO_DO_TAMANHO_DO_ARRAY);
		
		System.out.println("Tamanho do array: " + tamanhoDoArray);
		
		int[] arrayDinamico = new int[tamanhoDoArray];
		
		for (int i = 0; i < arrayDinamico.length; i++) {
			arrayDinamico[i] = obterValorAleatorio(VALOR_MINIMO_DO_CONTEUDO_DO_ARRAY, VALOR_MAXIMO_DO_CONTEUDO_DO_ARRAY);
		}
		
		return arrayDinamico;
	}

	private int obterValorAleatorio(int minimo, int maximo) {
		// TODO Auto-generated method stub
		Random random = new Random();
		return random.nextInt((maximo - minimo) + 1) + minimo;
	}

	private void start() {

		// int[] primeiroArray = { 50, -20, 0, 40 };
		int[] primeiroArray = gerarArrayComValoresAleatorios();
		// int[] segundoArray = { 5, -50, 10, 60 };
		int[] segundoArray = gerarArrayComValoresAleatorios();

		exibirValoresDoArray(primeiroArray);
		exibirValoresDoArray(segundoArray);

		int[] arraysCombinados = combinarArrays(primeiroArray, segundoArray);
		int soma = somar(arraysCombinados);
		double media = media(soma, arraysCombinados.length);

		exibirMediaComCasasDecimais(media);
	}

	private void exibirValoresDoArray(int[] array) {

		System.out.println("Valores do array: " + Arrays.toString(array));

	}

	private int[] combinarArrays(int[] primeiroArray, int[] segundoArray) {

		int[] arraysCombinados = ArrayUtils.addAll(primeiroArray, segundoArray);
		System.out.println("Arrays combinados: " + Arrays.toString(arraysCombinados));

		return arraysCombinados;
	}

	private int somar(int[] array) {

		int soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}

		System.out.println("Valor da soma: " + soma);
		return soma;
	}

	private Double media(int soma, int numeroDeItens) {
		return (double) (soma / numeroDeItens);
	}

	private void exibirMediaComCasasDecimais(Double media) {

		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Média: " + decimalFormat.format(media));
	}
}

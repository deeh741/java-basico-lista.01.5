package br.com.lds;

import java.text.DecimalFormat;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {

		int[] primeiroArray = { 50, -20, 0, 40 };
		int[] segundoArray = { 5, -50, 10, 60 };

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
		System.out.println("Media: " + decimalFormat.format(media));
	}
}

package br.com.lds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(30);
		lista.add(40);
		lista.add(60);
		lista.add(70);
		
		for (int i = 0; i < lista.size(); i++) {
		}
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(1, "FAI");
		mapa.put(2, "ETE");
		mapa.put(3, "Inatel");
		mapa.put(4, "Luis Pinto");
		mapa.put(5, "Grupao");
		mapa.put(6, "Sanico");
		mapa.put(7, "Colegio");
		
		for (String valorDoMapa : mapa.values()) {
			System.out.println("Valor do mapa: " + valorDoMapa);
		}
		
		for (Integer valorDaChave : mapa.keySet()) {
			System.out.println("Valor do chave: " + valorDaChave);
		}
	}
}

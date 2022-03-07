package noTengoIdea;

import java.util.ArrayList;

public class Bolillero {
	
	private final static int NUMERO_MINIMO = 1;
	private final static int NUMERO_MAX = 90;
	private int contadorSacados;
	private ArrayList<Integer> numeros;
	
	



	public Bolillero() {
		this.contadorSacados = 0;
		this.numeros = new ArrayList<>();
		agregarNumeros();
	}
	
	private void agregarNumeros() {
		for (int i = 1; i < 90; i++) {
			numeros.add(i);
		}
		
	}

	public int sacarNumero() {
		int numero = (int) Math.floor(Math.random()*numeros.size());
		numeros.remove(numero);
		contadorSacados++;
		return numero;
	}

	public int getContadorSacados() {
		return contadorSacados;
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public boolean tieneNumeros() {
		return numeros.size() > 0 ;
	}
}

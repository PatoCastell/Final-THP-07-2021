package noTengoIdea;

import java.util.ArrayList;

public class Carton {

	private final static int CANT_NUMEROS = 15;
	private ArrayList<Integer> numeros;
	private int restantes;
	
	
	public Carton(ArrayList<Integer> numerosCarton) {
		this.numeros = new ArrayList<>();
		asignarNumeros(numerosCarton);
		this.restantes = CANT_NUMEROS;
	}
	
	private void asignarNumeros(ArrayList<Integer> numerosBolillero) {
		for (int i = 0; i < CANT_NUMEROS; i++) {
		int random = (int) Math.floor(Math.random()*numerosBolillero.size());
		numeros.add(numerosBolillero.get(random));
		}
	}
		
	
	public boolean buscarNumero(int numeroBolillero) {
		boolean bingo = false;
		boolean tieneNumero = false;
		int i = 0;

		while (i < this.numeros.size() && !tieneNumero) {
			if (this.numeros.get(i) == numeroBolillero) {
				restantes--;
			}
			i++;
		}
		if (restantes == 0) {
			bingo = true;
		}

		return bingo;
	}

	public void recorrerNumeros() {
		for (Integer numero : numeros) {
			System.out.println(numero.toString());
		}
		
	}




}

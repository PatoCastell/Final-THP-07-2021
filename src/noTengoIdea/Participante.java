package noTengoIdea;

import java.util.ArrayList;

public class Participante {

	private int id;
	private Carton carton;
	
	public Participante(int id, ArrayList<Integer> numerosCarton) {
		this.id = id;
		this.carton = new Carton(numerosCarton);
	}
	
	public boolean verificarNumero(int numero) {
		return carton.buscarNumero(numero);
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void  dameNumerosCarton() {
		carton.recorrerNumeros();
	}
	
}

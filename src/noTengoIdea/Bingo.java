package noTengoIdea;

import java.util.ArrayList;

public class Bingo {

	private static final int NUMEROS_CARTON = 15;
	private final static int PARTICIPANTES_MINIMO = 5;
	private final static int PARTICIPANTES_MAX = 100;

	private Bolillero bolillero;
	private ArrayList<Participante> participantes;
	private ArrayList<Participante> ganadores;
	
	public Bingo() {
		this.ganadores = new ArrayList<>();
	}
	

	public int getNumerosEmitidos() {
		return bolillero.getContadorSacados();
	}

	public void simularRonda(int cantParticipantes) {
		boolean tieneBingo = false;
		participantes = new ArrayList<Participante>();
		if (cantParticipantes >= PARTICIPANTES_MINIMO && cantParticipantes <= PARTICIPANTES_MAX) {
			bolillero = new Bolillero();
			System.out.println("Arranca la ronda con " + cantParticipantes + "Participantes");
			for (int i = 0; i < cantParticipantes; i++) {

				Participante participante = new Participante(i, bolillero.getNumeros());
				participantes.add(participante);
			}
			while (bolillero.tieneNumeros() && tieneBingo == false) {
				int numeroActual = bolillero.sacarNumero();
				tieneBingo = recorrerParticipantes(numeroActual);
			}
			if(tieneBingo) {
				mostrarGanadores();
			}
		}
	}

	private void mostrarGanadores() {
		System.out.println("Se tiraron "+this.getNumerosEmitidos()+" numeros antes de conocer a el o los ganadores!!");
		for (Participante participante : ganadores) {
			System.out.println("Participante " + participante.getId() + " numeros de carton: ");
			participante.dameNumerosCarton();
			
		}
		
	}

	private boolean recorrerParticipantes(int numeroActual) {
		boolean bingo;
		boolean tieneBingo = false;
		for (Participante participante : participantes) {
			bingo = participante.verificarNumero(numeroActual);
			if(bingo) {
				System.out.println("El participante "+ participante.getId()+" canto BINGO con el numero "+numeroActual);
				tieneBingo = true;
				ganadores.add(participante);
			}
		}
		return tieneBingo;
	}


}

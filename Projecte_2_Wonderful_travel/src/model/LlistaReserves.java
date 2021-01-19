package model;

import java.util.ArrayList;

public class LlistaReserves {
	
	private ArrayList<Reserva> llistaReserves = new ArrayList();
	
	
	public LlistaReserves() {
		
	}
	
	public void addReserva(Reserva c) {
		llistaReserves.add(c);
	}
	
	public ArrayList<Reserva> getAllReserves(){
		return llistaReserves;
	}

}

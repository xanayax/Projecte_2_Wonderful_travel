package model;

import java.util.ArrayList;

public class LlistaReserves {
	
	private ArrayList<Reserva> llistaReserves = new ArrayList();
	
	
	public LlistaReserves() {
		
	}
	
	public void addReserva(Reserva r) {
		llistaReserves.add(r);
	}
	
	public ArrayList<Reserva> getAllReserves(){
		return llistaReserves;
	}

}

package Ejercicio9_PistasBaloncesto;

public class Gestor {

	private int balones;
	public Gestor(int b) {
		this.balones = b;
	}
	
	public synchronized void iniciar() {
		while(balones<=0) {
			try {
				
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balones --;
		
	}
	
	public synchronized void finalizar() {
		balones++;
		notify();
		
	}
	
	
}

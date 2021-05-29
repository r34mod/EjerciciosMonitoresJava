package Ejercicio10_TiendaMascota2Monitores;

public class GestorComer {
	private int comer;

	public GestorComer(int c) {
		this.comer=c;
		
	}
	
	public synchronized void comer() {
		while(comer<=0) {
			try {
				wait();
			}catch(InterruptedException e ) {
				e.getStackTrace();
			}
		}
		comer--;
	}
	
	public synchronized void dejarComer() {
		comer++;
		notify();
	}
	
	
	
}

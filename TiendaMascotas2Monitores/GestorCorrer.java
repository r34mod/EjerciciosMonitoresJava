package Ejercicio10_TiendaMascota2Monitores;

public class GestorCorrer {
	
	private int correr;
	
	public GestorCorrer() {
		this.correr = 1;
	}
	
	public synchronized void correr() {
		while(correr<=0) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		correr--;
	}
	
	
	public synchronized void dejarCorrer() {
		correr++;
		notify();
	}
}

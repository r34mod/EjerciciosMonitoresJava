package EjerciciosMonitores.src.Ejercicio10_TIendaMascota;

public class Gestor {
	private int comer;
	private int correr;
	public Gestor(int c) {
		this.comer=c;
		this.correr = 1;
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
		notifyAll();
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
		notifyAll();
	}
	
}

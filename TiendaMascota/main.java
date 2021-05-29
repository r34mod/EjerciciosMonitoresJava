package EjerciciosMonitores.src.Ejercicio10_TIendaMascota;

import java.util.concurrent.Semaphore;

public class main {

	public static void main(String[] args) {
		
		
		Gestor g = new Gestor(3);
		Tienda[] t= new Tienda[50];
		for(int i=0;i<t.length;i++) {
			t[i] = new Tienda(g, i);
			t[i].start();
		}
	}

}

package EjerciciosMonitores.src.Ejercicio3_Consumidores;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;



public class Consumidor extends Thread {
	private final Gestor Gestor;
	 private final int id;
	  
	 

	public Consumidor(Gestor gestor, int id) {
		this.Gestor = gestor;
		this.id = id;
	}



	public void run() {
		while (Boolean.TRUE) {
			System.out.println("El consumidor " + id + " consume: " + Gestor.get());
		}
	}
}
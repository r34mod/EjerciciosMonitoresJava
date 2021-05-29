package EjerciciosMonitores.src.Ejercicio3_Consumidores;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;



public class Productor extends Thread {
	  
	private final Gestor Gestor;
	private final int id;

	public Productor(Gestor gestor, int id) {
		super();
		Gestor = gestor;
		this.id = id;
	}
	
	public void run() {
		while(Boolean.TRUE) {
			int n = (int) (Math.random()*300);
			Gestor.put(n);
			System.out.println("El productor " + id + " pone: " + n);
			try {
				Thread.sleep((int) (Math.random()*2000));
			}catch(InterruptedException e) {
				e.getStackTrace();
			}
		
		}
	} 
}
/*
 * private final Gestor Gestor;
	private final int id;

	public Productor(Gestor gestor, int id) {
		super();
		Gestor = gestor;
		this.id = id;
	}
	
	public void run() {
		while(Boolean.TRUE) {
			int n = (int) (Math.random()*300);
			Gestor.put(n);
			System.out.println("El productor " + id + " pone: " + n);
			try {
				Thread.sleep((int) (Math.random()*2000));
			}catch(InterruptedException e) {
				e.getStackTrace();
			}
		
		}
	} */
 
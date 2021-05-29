package EjerciciosMonitores.src.Ejercicio10_TIendaMascota;

import java.util.concurrent.Semaphore;

public class Tienda extends Thread{

	Gestor gestor;
	private int num;
	public Tienda(Gestor g, int num) {
		this.gestor = g;
		this.num = num;
	}
	
	public void run() {
		System.out.println("intenta comer Hamster: " + num);
		gestor.comer();
		
		try {
			System.out.println("Están comiendo Hamster: " + num);
			sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		gestor.dejarComer();
		System.out.println("Acaban de comer Hamster: " + num);
		System.out.println("Intenta correr Hamster: " + num);
		gestor.correr();
		try {
			System.out.println("Empieza a correr Hamster: " + num);
			sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		gestor.dejarCorrer();
		System.out.println("Termina de correr Hamster: " + num);
		
	}
}

package Ejercicio10_TiendaMascota2Monitores;

import java.util.concurrent.Semaphore;

public class Tienda extends Thread{

	GestorComer gestorComer;
	GestorCorrer gestorCorrer;
	private int num;
	public Tienda(GestorCorrer GCorrer, GestorComer GComer, int n) {
		this.gestorComer = GComer;
		this.gestorCorrer = GCorrer;
		this.num = n;
	}
	
	public void run() {
		System.out.println("intenta comer Hamster: " + num);
		gestorComer.comer();
		
		try {
			System.out.println("Están comiendo Hamster: " + num);
			sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		gestorComer.dejarComer();
		System.out.println("Acaban de comer Hamster: " + num);
		System.out.println("Intenta correr Hamster: " + num);
		gestorCorrer.correr();
		try {
			System.out.println("Empieza a correr Hamster: " + num);
			sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		gestorCorrer.dejarCorrer();
		System.out.println("Termina de correr Hamster: " + num);
		
	}
}

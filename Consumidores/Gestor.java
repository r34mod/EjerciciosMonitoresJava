package EjerciciosMonitores.src.Ejercicio3_Consumidores;

import java.util.ArrayList;

public class Gestor {
	
	private int contenido;
	private boolean contenedorLleno = Boolean.FALSE;
	
	public synchronized int get() {
		
		while(contenedorLleno!= false) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.getStackTrace();
			}
		}
		contenedorLleno = Boolean.TRUE;
		notify();
		return contenido;
		
	}
	public synchronized void put(int valor) {
		while(contenedorLleno == true) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.getStackTrace();
			}
		}
		contenido = valor;
		contenedorLleno = Boolean.TRUE;
		notify();
	}
}

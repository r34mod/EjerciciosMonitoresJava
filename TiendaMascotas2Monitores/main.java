package Ejercicio10_TiendaMascota2Monitores;

import java.util.concurrent.Semaphore;

public class main {

	public static void main(String[] args) {
		
		
		GestorComer g = new GestorComer(3);
		GestorCorrer g2 = new GestorCorrer();
		Tienda[] t= new Tienda[50];
		for(int i=0;i<t.length;i++) {
			t[i] = new Tienda(g2, g, i);
			t[i].start();
		}
	}

}

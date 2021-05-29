package Ejercicio9_PistasBaloncesto;

import java.util.concurrent.Semaphore;

public class Main {
	
	
    
    public static void main (String [] args) throws InterruptedException{
    	
    	
    	Gestor g = new Gestor(8);
    	Partido[] p = new Partido[300];
    	
    	for(int i=0;i<p.length;i++) {
    		p[i] = new Partido(g, i);
    		p[i].start();
    	}

	}

}

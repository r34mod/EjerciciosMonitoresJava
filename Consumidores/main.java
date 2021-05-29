package EjerciciosMonitores.src.Ejercicio3_Consumidores;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;



public class main {

	private static Gestor gestor;
    private static Thread productor;
    private static Thread [] consumidores;
	
	public static void main(String[] args) {
		
		
		
	    gestor = new Gestor();
        productor = new Thread(new Productor(gestor, 1));
        consumidores = new Thread[5];
 
        for(int i = 0; i < consumidores.length; i++)
        {
            consumidores[i] = new Thread(new Consumidor(gestor, i));
            consumidores[i].start();
        }
         
        productor.start();

	}

}

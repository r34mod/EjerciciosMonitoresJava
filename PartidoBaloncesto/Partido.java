package Ejercicio9_PistasBaloncesto;

public class Partido extends Thread{
	
	Gestor g;
	private int num;
	public Partido(Gestor m, int i) {
		this.g = m;
		this.num = i;
	}

	public void run() {
		
		try {
			System.out.println("Nos ponemos de acuerdo el partido: " + num);
			sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Intenta pillar balón partido: " + num);
		g.iniciar();
		try {
			sleep(1000);
			System.out.println("Empieza partido: " + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.finalizar();
		System.out.println("Acaba el partido: " + num);
	}

}

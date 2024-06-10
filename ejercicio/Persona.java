package ejercicio;

public class Persona implements Runnable{
private int piso = 0;
	
	public Persona (String nombre) {
		piso = (int) Math.random();
		
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	@Override
		public void run() {
			
		}
}

package ejercicio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		Ascensor a1 = new Ascensor();
		Ascensor a2 = new Ascensor();
		
		ExecutorService pool = Executors.newFixedThreadPool(100);
		pool.execute(new Persona());
	}

	
	
}

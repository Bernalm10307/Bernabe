package Hilos;

public class AppPracticaHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticaHilos nuevo = new PracticaHilos("Hilo 1");
		Thread hilo = new Thread(nuevo);

		PracticaHilos nuevo2 = new PracticaHilos("Hilo 2");
		Thread hilo2 = new Thread(nuevo2);

		PracticaHilos nuevo3 = new PracticaHilos("Hilo 3");
		Thread hilo3 = new Thread(nuevo3);

		hilo.start();
		hilo2.start();
		hilo3.start();

	}

}

package hilos;

import java.util.Scanner;

public class Hilo1 implements Runnable {

	public boolean stopHilo = false;

	//funcion para parar el hilo de forma correcta
	public void pararHilo() {
		stopHilo = true;
	}

  
	
	@Override
	public void run() {
		
	int numeroCorrecto = 1989;//numero a adivinar
	int numeroIntroducido=0; //numero que introduce el usuario
		
	//mientras no se pare el hilo
	while(!stopHilo) {
		
 
		do {
			
			System.out.println("información del hilo:"+Thread.currentThread().toString());
			Scanner sc = new Scanner(System.in);
			System.out.println("¿En que año gano la vuelta a España Pedro Delgado?"
					+ " ¡Si no aciertas en 30 segundos destruiré todos tus datos!");
			System.out.println("Introduce una respuesta: ");

			numeroIntroducido = sc.nextInt();
			
			
				System.out.println("Jugador dice " + numeroIntroducido);
				//comparamos segun respuesta
				if (numeroIntroducido == numeroCorrecto) {

					System.out.println("Jugador  gana!");
					pararHilo();
					System.out.println("Por esta vez te has salvado, no te fíes de los extraños");
					System.out.println("Fin del programa");
					System.exit(0);
				

				} else {
					System.out.println("Numero " + numeroIntroducido + ", Has fallado!!");
				}
			
		}while(numeroCorrecto != numeroIntroducido);
		
	}
	
	
	
	}



	
}

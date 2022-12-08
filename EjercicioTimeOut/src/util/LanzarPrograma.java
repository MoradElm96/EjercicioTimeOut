package util;

import hilos.Hilo1;


public class LanzarPrograma {



	public static void main(String[] args) {

		Hilo1 h1 = new Hilo1();

		Thread t1 = new Thread(h1);

	
        //para poder cronometrar los 30segundos
		long start = System.currentTimeMillis();
		long end = start + 30 * 1000; // parar en 30segundos, porque son milisegundos

	
		    //ARRANCAMOS EL HILO
			t1.start();
	       
			 //si pasan 30 segundos destruyo todo
			 while(System.currentTimeMillis() < end) {
				 
				 //temporizador en marcha		
				 
			 }
			 //Mostramos mensaje
			 borrarOrdenador();
			 //paramos el hilo
		     h1.pararHilo();
		    
		  
		     System.out.println("estado:"+t1.getState());
		     System.out.println("fin del hilo 1");
		     System.exit(0); //salimos del programa
			
	}
	
	
	//FUNCION PARA QUE IMITA BORRAR
	public static void borrarOrdenador() {
		System.out.println("BORRANDO ARCHIVOS DEL SISTEMA...");
			System.out.println("Fin del programa,el hilo de preguntar termino");
	}

}

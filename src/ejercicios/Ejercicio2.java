package ejercicios;

import java.util.Arrays;
import java.util.Scanner;
	

public class Ejercicio2 {

	static boolean esPrimo (int numero) {
		boolean primo=true;
		if (numero ==1) {
			primo=false;
		}
		for (int j = 2; j<numero;j++) {
			if (numero%j==0) {
				primo=false;
			}
		}
		return (primo);	
	}
	public static void main(String[] args) {
		int numPrimo []= new int [10];
		
		Scanner read= new Scanner (System.in);
		 
		for (int i = 0; i<numPrimo.length;i++) {
			numPrimo[i]=read.nextInt();
		}
		
		Arrays.sort(numPrimo);
	
		//Recorremos la tabla
				for(int i =0; i < numPrimo.length;i++) {
					//Mientras que el módulo del números sea distinto a 2
					if (!esPrimo(numPrimo[i])) {
						//Se eliminarán los números impares
						System.arraycopy(numPrimo, i+1, numPrimo, i, numPrimo.length-i-1);
						numPrimo=Arrays.copyOf(numPrimo, numPrimo.length-1);
					}
				}
				
				//Se mostrarará el array.
				System.out.println(Arrays.toString(numPrimo));
		
	}

	
}



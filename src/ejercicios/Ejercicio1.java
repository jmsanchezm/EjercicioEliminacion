package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Creamos el array con el tamaño indicado
		int numAleatorios []= new int [20];
		
		//Mediante un for, generamos los números y lo vamos guardando en el array.
		for (int i = 0 ; i<numAleatorios.length;i++) {
			numAleatorios[i]= (int)(Math.random()*100+1);
		}
		
		//Recorremos la tabla
		for(int i =0; i < numAleatorios.length;i++) {
			//Mientras que el módulo del números sea distinto a 2
			while (numAleatorios [i]%2!=0) {
				//Se eliminarán los números impares
				System.arraycopy(numAleatorios, i+1, numAleatorios, i, numAleatorios.length-i-1);
				
			}
		}
		
		//Se mostrarará el array.
		System.out.println(Arrays.toString(numAleatorios));
		

	}

}

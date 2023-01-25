package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int  numEnteros [] = new int[10];
		String eleccion;
		int valor;
		
		
		
		Scanner read= new Scanner (System.in);
		
		
		
		
		System.out.println("1.Mostrar valores.");
		System.out.println("2.Eliminar valor.");
		System.out.println("3.Salir.");
		
		eleccion=read.next();
		eleccion.toLowerCase();
		
		do{ 
			switch (eleccion) {
		
		case "a":
			System.out.println(Arrays.toString (numEnteros));
			break;
			
		case "b":
			System.out.println("Introduzca un valor");
			break;
			
		case "c":
			System.out.println("Has salido del programa.");
			break;
		default:
				System.out.println("ERROR");
			}
			}while (eleccion.equals ("c"));
				
			
		}
	}	

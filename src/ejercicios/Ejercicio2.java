package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int notaEscrita;
		int notaOral;
		String resultadoNivel = "nulo";
		
		
		System.out.println("Ingre nota escirta");
		notaEscrita = sc.nextInt();
		
		System.out.println("Ingrese nota oral");
		notaOral = sc.nextInt();
		
		if ( notaEscrita <= 95) {
			resultadoNivel = ("Nivel 1");
		} else if (notaEscrita > 95 && notaOral <= 75) {
			resultadoNivel = ("Nivel 2");
		} else if (notaEscrita > 95 && notaOral > 75) {
			resultadoNivel = ("Nivel 3");
		} else {
			System.out.println("Nulo");
		}
		
		System.out.println("Su nivel es " + resultadoNivel);


		if ( resultadoNivel.equals("Nivel 1")) {
			System.out.println("Su precio es 150 soles");
		} else if ( resultadoNivel.equals("Nivel 2")) {
			System.out.println("Su precio es 250 soles");
		} else if (resultadoNivel.equals("Nivel 3")) {
			System.out.println("Su precio es 400 soles");
		} else {
			System.out.println("Nulo1");
		}
		
	}
}





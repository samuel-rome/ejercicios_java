package ejercicios;

import java.util.Scanner;

public class MetodoEjercicio2 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int notaEscrita;
        int notaOral;
        
        System.out.println("Ingrese nota escrita");
        notaEscrita = sc.nextInt();
        
        System.out.println("Ingrese nota oral");
        notaOral = sc.nextInt();

        String resultadoNivel = obtenerNivel(notaEscrita, notaOral);
        System.out.println("Su nivel es " + resultadoNivel);

        String precio = obtenerPrecio(resultadoNivel);
        System.out.println(precio);

        sc.close();
    }

    private static String obtenerNivel(int notaEscrita, int notaOral) {
        if (notaEscrita <= 95) {
            return "Nivel 1";
        } else if (notaEscrita > 95 && notaOral <= 75) {
            return "Nivel 2";
        } else if (notaEscrita > 95 && notaOral > 75) {
            return "Nivel 3";
        } else {
            return "Nulo";
        }
    }

    private static String obtenerPrecio(String nivel) {
        if ("Nivel 1".equals(nivel)) {
            return "Su precio es 150 soles";
        } else if ("Nivel 2".equals(nivel)) {
            return "Su precio es 250 soles";
        } else if ("Nivel 3".equals(nivel)) {
            return "Su precio es 400 soles";
        } else {
            return "Nivel no válido";
        }
    }
}

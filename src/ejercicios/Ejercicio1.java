package ejercicios;

public class Ejercicio1 {

		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
			
			//sueldo bruto mensual
			int sbm = 5500;
			
			//utilidad por persona al año
			int upa = 3500;
			
			int sa = 14;
			
			int uit = 3600;
			
			int impuesto = ((((sbm * sa) + upa ) - (uit * 7)) * 21) / 100; 
			
			if(impuesto > 0) {
				System.out.println("Su impuesto es de " + impuesto);
			} else {
				System.out.println("El impuesto es 0 ");
			}
			
		}
}

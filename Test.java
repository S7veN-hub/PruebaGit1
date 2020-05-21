/** Crea dos objetos de la clase rectángulo, solicita por teclado el nombre, alto y ancho.
* - Compara sus aéreas, e indica cuál de ellos tiene un área mayor, refiriéndote a ellos por
*   sus nombres.
* - Incrementa 10 veces el ancho del primer rectángulo.
* - Muestra su área.
* - Comprueba si alguno de los dos rectángulos es un cuadrado y dilo por pantalla
* @author Belmont Yaka Eladsua
*/

package figuras;

import java.util.Scanner;

public class Test {
	public static void main (String[] args) {
		
		int i;
		int ancho = 0;
		int altura = 0;
		String nombre = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escribe el ancho del primer rectangulo");  //lectura valores del primer rectangulo
		ancho = in.nextInt();
		System.out.println("Escribe la altura del primer rectangulo");
		altura = in.nextInt();
		System.out.println("Escribe el nombre del primer rectangulo");
		nombre = in.next();
		in.close();
	
		Rectangulo rc1 = new Rectangulo(ancho, altura, nombre);  //declaracion objetos
		Rectangulo rc2 = new Rectangulo();
		
		System.out.println("");
		System.out.println("Comparacion de areas");   //comparacion de areas
		System.out.println("");
		
		if (rc1.area() > rc2.area()) {
			
			System.out.println("El area de " + rc1.getNombre() + " es mayor que el de " + rc2.getNombre());
		}
		else if (rc2.area() > rc1.area()) {
			
			System.out.println("El area de " + rc2.getNombre() + " es mayor que el de " + rc1.getNombre());
		}
		else {
			
			System.out.println("El area de " + rc1.getNombre() + " es igual a " + rc2.getNombre());
		}
		
		System.out.println("");
		System.out.println("Incremento del ancho del primer rectangulo");  //incremento del ancho del pimer rectangulo
		System.out.println("");
		
		for (i = 1; i <= 10; i++) {
			rc1.incrementaAncho();
		}
		System.out.println("El ancho del primer rectangulo es " + rc1.getAncho());
		System.out.println("El area del primer rectangulo es de " + rc1.area());  //area primer rectangulo
		
		System.out.println("");
		System.out.println("Comprobacion de cuadrado");  //comprobacion cuadrado
		System.out.println("");
		
		if (rc1.esCuadrado() == true) {
			
			System.out.println("La figura " + rc1.getNombre() + " es un cuadrado");
		}
		else if (rc1.esCuadrado() == false) {
			
			System.out.println("La figura " + rc1.getNombre() + " NO es un cuadrado");
		}
		
		if (rc2.esCuadrado() == true) {
			
			System.out.println("La figura " + rc2.getNombre() + " es un cuadrado");
		}
		else if (rc2.esCuadrado() == false) {
			
			System.out.println("La figura " + rc2.getNombre() + " NO es un cuadrado");
		}
		
		System.out.println("");
		System.out.println("Dibujo del relleno");  //relleno figura
		System.out.println("");
		rc1.pintaRelleno('*');
		System.out.println("");
		System.out.println("Dibujo del perimetro");  //perimetro figura
		System.out.println("");
		rc1.pintaPerimetro('*');
	}
	
}






package viajes;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <h1>Ejercicio con JavaDoc
 * <h1/>
 * <h2>Desarrollar una aplicación para la gestión de una agencia de viajes para
 * estudiantes universitarios. Esta agencia solo organiza viajes que se realizan
 * mediante avión al extranjero o mediante tren en territorio nacional.
 * <h2/>
 * 
 * @author diegoba
 * @since 16/3/22
 * @version 1.0
 *
 */
class App_Viajes {
	public static void main(String[] args) {
		// Crearemos un menu donde llamaremos a todos los metodos
		Scanner teclado = new Scanner(System.in);
		Metodos_Viaje c = new Metodos_Viaje();
		c.cargardatos();
		int opcion = 1;
		while (opcion >= 1 && opcion <= 5) {
			System.out.println("\n--------AGENCIA DE VIAJES--------");
			System.out.println("1.- Mostrar todos los datos de todos los viajes tanto mediante avión como tren.");
			System.out.println("2.- Calcular el precio del viaje mediante referencia. ");
			System.out.println("3.- Grabar los viajes realizados mediante tren en un fichero.  ");
			System.out.println("4.- Leer los viajes internacionales realizados mediante avión");
			System.out.println("5.- Añadir viajes");
			System.out.println("6.- Eliminar todos los viajes realizados a Europa");
			System.out.println("7.- Salir");
			System.out.print("Introduzca una opcion: ");
			opcion = teclado.nextInt();
			switch (opcion) {
			// Llamada a los metodos
			case 1:
				c.ver_datos();
				;
				break;
			case 2:
				c.descuento();
				break;
			case 3:
				c.grabar();
				break;
			case 4:
				c.leer();
				break;
			case 5:
				c.añadir();
				break;
			case 6:
				c.eliminar();
				break;
			default:
				break;
			}

		}

	}
}

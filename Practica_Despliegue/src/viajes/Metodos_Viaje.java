package viajes;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import viajes.Avion;
import viajes.Viaje;

/**
 * <h1>Ejercicio con JavaDoc<h1/>
 * <h2>Desarrollar una aplicación para la gestión de una agencia de viajes para estudiantes universitarios. 
Esta agencia solo organiza viajes que se realizan mediante avión al extranjero o mediante tren en territorio nacional.<h2/>
 * @author Diego Bango
 * @since 16/3/22
 * @version 1.0
 *
 */
/**
 * Metodo para crear el ArrayList
 */
public class Metodos_Viaje {
	static ArrayList<Viaje> lista_viajes = new ArrayList<>();

	/**
	 * Metodo para introducir los viajes y sus tipos
	 */
	public void cargardatos() {
		lista_viajes.add(new Tren("123456", 1, "Baja", 50, "Nacional", "Primera Clase"));
		lista_viajes.add(new Avion("234567", 4, "Alta", 400, "Internacional", "14789563Z", "Premium", 5));

		lista_viajes.add(new Avion("897456", 5, "Media", 200, "Europa", "78945612P", "Primera Clase", 8));
		lista_viajes.add(new Tren("741236", 10, "Alta", 100, "Nacional", "Premium"));
		lista_viajes.add(new Avion("589741", 6, "Baja", 150, "Nacional", "14789652D", "Basico", 2));
		lista_viajes.add(new Avion("258963", 2, "Alta", 195, "Europa", "78945632Y", "Premium", 1));

	}

	/**
	 * Metodo para visualizar todos los datos de todos los viajes tanto mediante
	 * avión como tren.
	 */
	public void ver_datos() {
		for (Viaje viajes : lista_viajes) {
			if (viajes instanceof Avion) {
				System.out.println(((Avion) viajes).toString());
				System.out.println("Viajes en avión " + (((Avion) viajes)));

			} else if (viajes instanceof Tren) {
				System.out.println(((Tren) viajes).toString());
				System.out.println("Viajes en tren " + (((Tren) viajes)));

			}
		}

	}

	/**
	 * Metodo para grabar en un fichero los viajes realizados en avion
	 */

	public void grabar() {
		try {
			System.out.print("Grabamos los aviones");
			ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("Aviones.dat"));
			guardar.writeObject(lista_viajes);
			guardar.close();

		} catch (FileNotFoundException a) {
			System.out.println("El archivo no es accesible");
		} catch (IOException b) {
			System.out.println("No se puede leer el archivo.");
		}
	}

	/**
	 * Metodo para leer los viajes los viajes internacionales realizados mediante
	 * avión.
	 */
	public void leer() {
		Iterator<Viaje> it = lista_viajes.iterator();
		try {
			ObjectInputStream leerput = new ObjectInputStream(new FileInputStream("Aviones.dat"));
			lista_viajes = (ArrayList) leerput.readObject();
			leerput.close();
		} catch (ClassNotFoundException a) {
			System.out.println("No se puede acceder a la clase.");
		} catch (FileNotFoundException b) {
			System.out.println("El archivo no es accesible");
		} catch (IOException c) {
			System.out.println("No tienes el serializable.");
		}

		while (it.hasNext()) {
			Viaje listado = it.next();

			if (listado instanceof Avion) {
				System.out.println(((Avion) listado).toString());
			}

		}
	}

	/**
	 * Metodo para eliminar todos los viajes realizados a Europa.
	 */
	public void eliminar() {

		Scanner teclado = new Scanner(System.in);
		Iterator<Viaje> it = lista_viajes.iterator();
		String destino;
		String respuesta = "si";
		boolean bol = false;
		while (respuesta.equalsIgnoreCase("si")) {
			System.out.println("Borrado lista con iterator");
			it = lista_viajes.iterator();
			System.out.println("Teclee el destino");
			destino = teclado.next();
			while (it.hasNext()) {
				Viaje aux = it.next();
				if (aux.getDestino().equals("Europa") || aux.getDestino().equals("Europa")) {
					it.remove();
					System.out.println("Viajes con destino a Europa borrados");
					bol = true;
				}
			}
			if (bol == false) {
				System.out.println(destino + " no esta en la lista");
			}
			System.out.print("Quiere introducir otro destino? (si/no): ");
			respuesta = teclado.next();
			bol = false;
		}

	}

	/**
	 * Metodo para buscar viaje por codigo
	 * /**
	 * @return booleano que indica si el codigo existe o no
	 */
	public static boolean buscarCodigo(String referencia) {

		for (Viaje aux : lista_viajes) {

			if (aux.getReferencia().equalsIgnoreCase(referencia)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo para añadir un viaje mediante cualquier medio de transporte
	 */
	public static void añadir() {

		String referencia, temporada, destino, pasaporte, tipo_asiento, tipo_vagon;
		double precio_habitacion;
		int viajeros, n_maletas, tipo_viaje;
		boolean existente = false;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero de referencia: ");
		referencia = teclado.next();
		existente = buscarCodigo(referencia);
		while (existente == true) {
			System.out.println("Ya existe un viaje con ese numero de referencia");
			System.out.print("Introduce otra referencia: ");
			referencia = teclado.next();
			existente = buscarCodigo(referencia);
		}
		System.out.print("Numero de viajeros: ");
		viajeros = teclado.nextInt();
		System.out.print("Temporada: ");
		temporada = teclado.next();
		System.out.print("Precio de habitacion: ");
		precio_habitacion = teclado.nextDouble();
		System.out.print("Destino: ");
		destino = teclado.next();
		System.out.print("Tipo de viaje(Avion(1) o Tren(2)): ");
		tipo_viaje = teclado.nextInt();
		while (tipo_viaje != 1 && tipo_viaje != 2) {
			System.out.print("Tipo de viaje invalido, introduzca otro");
			System.out.print("(Avion(1) o Tren(2)): ");
			tipo_viaje = teclado.nextInt();
		}
		if (tipo_viaje == 1) {
			System.out.print("Pasaporte");
			pasaporte = teclado.next();
			System.out.print("Tipo de asiento");
			tipo_asiento = teclado.next();
			System.out.print("Numero de maletas: ");
			n_maletas = teclado.nextInt();
			lista_viajes.add(new Avion(referencia, viajeros, temporada, precio_habitacion, destino, pasaporte,
					tipo_asiento, n_maletas));
			System.out.println("Nuevo viaje en avion añadido");

		} else {
			System.out.print("Tipo de vagon: ");
			tipo_vagon = teclado.next();
			lista_viajes.add(new Tren(referencia, viajeros, temporada, precio_habitacion, destino, tipo_vagon));
			System.out.println("Nuevo viaje en tren añadido");

		}
	}

	/**
	 * Metodo para realizar descuentos al precio del viaje
	 */
	public static void descuento() {
		String referencia;
		double rebaja = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero de referencia: ");
		referencia = teclado.next();
		while (buscarCodigo(referencia) == false) {
			System.out.println("No existe un viaje con ese numero de referencia");
			System.out.print("Introduce otra referencia: ");
			referencia = teclado.next();
		}
		for (Viaje viajes : lista_viajes) {
			if (viajes.getReferencia().equalsIgnoreCase(referencia)) {
				if (viajes.getTemporada().equalsIgnoreCase("Alta")) {
					rebaja = viajes.getPrecio_habitacion();
					System.out.println("No tiene rebaja y su precio es de " + rebaja);
				}
				if (viajes.getTemporada().equalsIgnoreCase("Media")) {
					rebaja = viajes.getPrecio_habitacion() * 0.2;
					rebaja = (viajes.getPrecio_habitacion() - rebaja);
					System.out.println("Esta temporada tiene una rebaja del 20% y su precio es de " + rebaja + " € ");
				}
				if (viajes.getTemporada().equalsIgnoreCase("Baja")) {
					rebaja = viajes.getPrecio_habitacion() * 0.4;
					rebaja = (viajes.getPrecio_habitacion() - rebaja);
					System.out.println("Esta temporada tiene una rebaja del 40% y su precio es de " + rebaja + " € ");
				}
				System.out.println("Numero total de pasajeros : " + (viajes.getViajeros() + "\nPrecio total del viaje: "
						+ (rebaja * viajes.getViajeros()) + "€"));
			}

		}
	}

}

package viajes;

/**
 * <h1>Ejercicio con JavaDoc
 * <h1/>
 * <h2>Desarrollar una aplicaci�n para la gesti�n de una agencia de viajes para
 * estudiantes universitarios. Esta agencia solo organiza viajes que se realizan
 * mediante avi�n al extranjero o mediante tren en territorio nacional.
 * <h2/>
 * 
 * @author diegoba
 * @since 16/3/22
 * @version 1.0
 *
 */
public class Avion extends Viaje {
	/**
	 * Atributos de la clase Avion que que hereda algunos de la clase Viaje
	 */
	private String pasaporte;
	private String tipo_asiento;
	private int n�_maletas;

	/**
	 * Metodo publico Avion
	 * 
	 * @param referencia
	 * @param viajeros
	 * @param temporada
	 * @param precio_habitacion
	 * @param destino
	 * @param pasaporte
	 * @param tipo_asiento
	 * @param n�_maletas
	 */
	public Avion(String referencia, int viajeros, String temporada, double precio_habitacion, String destino,
			String pasaporte, String tipo_asiento, int n�_maletas) {
		super(referencia, viajeros, temporada, precio_habitacion, destino);
		this.pasaporte = pasaporte;
		this.tipo_asiento = tipo_asiento;
		this.n�_maletas = n�_maletas;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getTipo_asiento() {
		return tipo_asiento;
	}

	public void setTipo_asiento(String tipo_asiento) {
		this.tipo_asiento = tipo_asiento;
	}

	public int getN�_maletas() {
		return n�_maletas;
	}

	public void setN�_maletas(int n�_maletas) {
		this.n�_maletas = n�_maletas;
	}

	@Override
	public String toString() {
		return "Avion [pasaporte=" + pasaporte + ", tipo_asiento=" + tipo_asiento + ", n�_maletas=" + n�_maletas + "]";
	}

}
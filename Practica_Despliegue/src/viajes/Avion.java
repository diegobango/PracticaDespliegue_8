package viajes;

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
public class Avion extends Viaje {
	/**
	 * Atributos de la clase Avion que que hereda algunos de la clase Viaje
	 */
	private String pasaporte;
	private String tipo_asiento;
	private int nº_maletas;

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
	 * @param nº_maletas
	 */
	public Avion(String referencia, int viajeros, String temporada, double precio_habitacion, String destino,
			String pasaporte, String tipo_asiento, int nº_maletas) {
		super(referencia, viajeros, temporada, precio_habitacion, destino);
		this.pasaporte = pasaporte;
		this.tipo_asiento = tipo_asiento;
		this.nº_maletas = nº_maletas;
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

	public int getNº_maletas() {
		return nº_maletas;
	}

	public void setNº_maletas(int nº_maletas) {
		this.nº_maletas = nº_maletas;
	}

	@Override
	public String toString() {
		return "Avion [pasaporte=" + pasaporte + ", tipo_asiento=" + tipo_asiento + ", nº_maletas=" + nº_maletas + "]";
	}

}
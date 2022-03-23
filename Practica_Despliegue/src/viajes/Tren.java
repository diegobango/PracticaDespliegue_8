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
public class Tren extends Viaje {
	/**
	 * Atributos de la clase Tren que que hereda algunos de la clase Viaje
	 */
	private String tipo_vagon;
	/**
	 * Metodo publico Tren
	 * @param referencia
	 * @param viajeros
	 * @param temporada
	 * @param precio_habitacion
	 * @param destino
	 * @param tipo_vagon
	 */

	public Tren(String referencia, int viajeros, String temporada, double precio_habitacion, String destino,
			String tipo_vagon) {
		super(referencia, viajeros, temporada, precio_habitacion, destino);
		this.tipo_vagon = tipo_vagon;
	}

	public String getTipo_vagon() {
		return tipo_vagon;
	}

	public void setTipo_vagon(String tipo_vagon) {
		this.tipo_vagon = tipo_vagon;
	}

	@Override
	public String toString() {
		return "Tren [tipo_vagon=" + tipo_vagon + "]";
	}

}

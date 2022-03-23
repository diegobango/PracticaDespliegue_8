package viajes;
import java.io.Serializable;

/**
 * <h1>Ejercicio con JavaDoc
 * <h1/>
 * <h2>Desarrollar una aplicación para la gestión de una agencia de viajes para
 * estudiantes universitarios. Esta agencia solo organiza viajes que se realizan
 * mediante avión al extranjero o mediante tren en territorio nacional.
 * <h2/>
 * 
 * @author Diego Bango
 * @since 16/3/22
 * @version 1.0
 *
 */
public class Viaje implements Serializable {
	/**
	 * Atributos de la clase Viaje
	 */
	private String referencia;
	private int viajeros;
	private String temporada;
	private double precio_habitacion;
	private String destino;

	/**
	 * Metodo publico Viaje
	 * 
	 * @param referencia
	 * @param viajeros
	 * @param temporada
	 * @param precio_habitacion
	 * @param destino
	 */
	public Viaje(String referencia, int viajeros, String temporada, double precio_habitacion, String destino) {
		super();
		this.referencia = referencia;
		this.viajeros = viajeros;
		this.temporada = temporada;
		this.precio_habitacion = precio_habitacion;
		this.destino = destino;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getViajeros() {
		return viajeros;
	}

	public void setViajeros(int viajeros) {
		this.viajeros = viajeros;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double getPrecio_habitacion() {
		return precio_habitacion;
	}

	public void setPrecio_habitacion(double precio_habitacion) {
		this.precio_habitacion = precio_habitacion;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Viaje [referencia=" + referencia + ", viajeros=" + viajeros + ", temporada=" + temporada
				+ ", precio_habitacion=" + precio_habitacion + ", destino=" + destino + "]";
	}

}
package videoclub;


public class Oficina {


	/*
	 * a continuacion vamos a declarar los atributos de la clase Oficina.
	 */
	/**
	 * atributos de la clase Oficina
	 */
	private String ciudad;
	private String direccion;
	private String telefono;

	/**
	 * llamamos al metodo toString.
	 */
	public String toString() {
		return ("La Clase Oficina: " + ciudad + direccion + telefono);

	}


	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}


	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}

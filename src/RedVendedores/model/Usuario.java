package RedVendedores.model;

import java.util.Objects;

public abstract class Usuario {

	private String nombre;
	private String apellidos;
	private String direccion;
	private String cedula;
	
	/**
	 * metodo constructor de Usuario
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param cedula
	 */
	public Usuario(String nombre, String apellidos, String direccion, String cedula) {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDireccion(direccion);
		this.setCedula(cedula);
	}

	/**
	 * sed del atributo nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * set del atributo nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * get del atributo apellidos
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * set del atributo apellidos
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * get del atributo direccion
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * set del atributo direccion
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * get del atributo direccion
	 * @return
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * set del atributo cedula
	 * @param cedula
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, cedula, direccion, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(cedula, other.cedula)
				&& Objects.equals(direccion, other.direccion) && Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", cedula="
				+ cedula + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

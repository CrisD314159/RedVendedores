package RedVendedores.model;

import java.util.Objects;

public class Producto {

	
	private String nombre;
	private String codigo;
	private String categoria;
	private double precio;
	private TipoEstado tipoEstado;
	
	/**
	 * constructor de producto
	 * @param nombre
	 * @param codigo
	 * @param categoria
	 * @param precio
	 * @param tipoEstado
	 */
	public Producto(String nombre, String codigo, String categoria, double precio, TipoEstado tipoEstado) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.categoria = categoria;
		this.precio = precio;
		this.tipoEstado = tipoEstado;
	}

	/**
	 * get de el atributo nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * set de el atributo nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * get del atributo codigo
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * set del atributo codigo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * get del atributo categoria
	 * @return
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * set del atributo categoria
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * get del atributo precio
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * set del atributo precio
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * get del TipoEstado
	 * @return
	 */
	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}

	/**
	 * Set del TipoEstado
	 * @param tipoEstado
	 */
	public void setTipoEstado(TipoEstado tipoEstado) {
		this.tipoEstado = tipoEstado;
	}


	@Override
	public int hashCode() {
		return Objects.hash(categoria, codigo, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", categoria=" + categoria + ", precio=" + precio
				+ ", tipoEstado=" + tipoEstado + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

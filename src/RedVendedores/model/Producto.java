package RedVendedores.model;

import java.util.Objects;

public class Producto {

	
	private String nombre;
	private String codigo;
	private String categoria;
	private double precio;
	private TipoEstado tipoEstado;
	
	
	public Producto(String nombre, String codigo, String categoria, double precio, TipoEstado tipoEstado) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.categoria = categoria;
		this.precio = precio;
		this.tipoEstado = tipoEstado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public TipoEstado getTipoEstado() {
		return tipoEstado;
	}


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

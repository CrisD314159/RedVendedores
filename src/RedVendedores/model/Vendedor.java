package RedVendedores.model;

import java.util.ArrayList;
import java.util.Objects;

public class Vendedor extends Usuario {

	
	private Muro muro;
	private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
	private ArrayList<Producto> listaProducto = new ArrayList<Producto>();
	
	/**
	 * Metodo constructor del vendedor
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param cedula
	 * @param muro
	 */
	public Vendedor(String nombre, String apellidos, String direccion, String cedula, Muro muro) {
		super(nombre, apellidos, direccion, cedula);
		this.setMuro(muro);
	}

	/**
	 * get del muro
	 * @return
	 */
	public Muro getMuro() {
		return muro;
	}

	/**
	 * set del muro
	 * @param muro
	 */
	public void setMuro(Muro muro) {
		this.muro = muro;
	}

	/**
	 * get de listaVendedores
	 * @return
	 */
	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}

	/**
	 * set de listaVendedores
	 * @param listaVendedores
	 */
	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}

	/**
	 * get de listaProducto
	 * @return
	 */
	public ArrayList<Producto> getListaProducto() {
		return listaProducto;
	}

	/**
	 * set de listaProducto
	 * @param listaProducto
	 */
	public void setListaProducto(ArrayList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(listaProducto, listaVendedores);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		return Objects.equals(listaProducto, other.listaProducto)
				&& Objects.equals(listaVendedores, other.listaVendedores);
	}


	@Override
	public String toString() {
		return "Vendedor [muro=" + muro + ", listaVendedores=" + listaVendedores + ", listaProducto=" + listaProducto
				+ "]";
	}
	
	
	
	
	
	

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


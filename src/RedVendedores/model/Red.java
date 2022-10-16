package RedVendedores.model;

import java.util.ArrayList;
import java.util.Objects;

import RedVendedores.exceptions.AdministradorException;
import RedVendedores.exceptions.ProductoException;
import RedVendedores.exceptions.VendedorException;

public class Red {

	
	private String nombre;
	private ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
	private ArrayList <Producto> listaProductos = new ArrayList<Producto>();
	
	
	
	/**
	 * metodo contructor de red
	 * @param nombre
	 */
	public Red(String nombre) {
		super();
		this.setNombre(nombre);
	}



	/**
	 * get del atributo nombre 
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
	 * get de la lista de usuarios
	 * @return
	 */
	public ArrayList <Usuario> getListaUsuarios() {
		return listaUsuarios;
	}



	/**
	 * Set de la lista de usuarios
	 * @param listaUsuarios
	 */
	public void setListaUsuarios(ArrayList <Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}



	/**
	 * get de la lista de producto
	 * @return
	 */
	public ArrayList <Producto> getListaProductos() {
		return listaProductos;
	}



	/**
	 * set de la lista de productos
	 * @param listaProductos
	 */
	public void setListaProductos(ArrayList <Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}




	@Override
	public int hashCode() {
		return Objects.hash(listaProductos, listaUsuarios, nombre);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Red other = (Red) obj;
		return Objects.equals(listaProductos, other.listaProductos)
				&& Objects.equals(listaUsuarios, other.listaUsuarios) && Objects.equals(nombre, other.nombre);
	}




	@Override
	public String toString() {
		return "Red [nombre=" + nombre + ", listaUsuarios=" + listaUsuarios + ", listaProductos=" + listaProductos
				+ "]";
	}
	
	

	//-----Crud vendedor-----
	
	/**
	 * este metodo crea un usuario
	 * @param newVendedor
	 * @return
	 */
	public String createVendedor( Vendedor newVendedor) {
	
		String messaje = "";
		
		Vendedor vendedorFound = null;

		try {
			vendedorFound  = verifyVendedor(newVendedor.getCedula());
			listaUsuarios.add(newVendedor);
			messaje = "Vendedor Creado exitosamente";

		} catch (VendedorException e) {
			messaje  = e.getMessage();
		}
		return messaje;
	}


	/**
	 * este metodo verifica si un vendedor existe
	 * @param name
	 * @param id
	 * @return
	 * @throws VendedorException
	 */
	public Vendedor verifyVendedor(String id) throws VendedorException {
		
		Vendedor vendedorFound = null;
		for(Usuario seller : listaUsuarios) {
			if(seller instanceof Vendedor) {
				if(seller.getCedula().equals(id)) {
					vendedorFound = (Vendedor) seller;
					throw new VendedorException ("Imposible crear el vendedor, esta ye existe");
				}
					
				
			}
			
		}
		
	
		return null;
	}
	
	
	
	/**
	 * Este metodo busca un vendedor por cedula
	 * @param id
	 * @return
	 * @throws VendedorException
	 */
	public Vendedor readVendedor(String id) throws VendedorException {
		
		Vendedor vendedorFound = null;
		for(Usuario seller : listaUsuarios) {
			if(seller instanceof Vendedor) {
				if(seller != null && seller.getCedula().equals(id)) {
					vendedorFound = (Vendedor) seller;
				}
					
				
			}
		}if(vendedorFound == null) {
			throw new VendedorException ("Imposible encontrar el vendedor, intenta de nuevo");
		}
		
		
		return vendedorFound;
	}
	
	
	/**
	 * este metodo actualiza los datos de una vendedor
	 * @param name
	 * @param surname
	 * @param id
	 * @param addres
	 * @return
	 * @throws VendedorException
	 */
	public String updateVendedor(String name, String surname, String id, String addres) throws VendedorException {
		String messaje = "";
		Vendedor vendedorFound = null;
		
		for(Usuario seller : listaUsuarios) {
			if(seller instanceof Vendedor) {
				if(seller.getCedula().equals(id)) {
					vendedorFound = (Vendedor) seller;
					vendedorFound.setApellidos(surname);
					vendedorFound.setNombre(name);
					vendedorFound.setDireccion(addres);
					messaje = "Vendedor actualizado";
					break;
				}else {
					throw new VendedorException ("Imposible acttualizar el vendedor, intenta de nuevo");
				}
			}
		}
		return messaje;
	}
	
	
	/**
	 * Este metodo elimina un vendedor solicitado
	 * @param id
	 * @return
	 * @throws VendedorException
	 */
	public String deleteVendedor(String id) throws VendedorException  {
		String messaje = "";
		Vendedor sellerFound = null;
		for(Usuario seller : listaUsuarios) {
			if(seller instanceof Vendedor) {
				if(seller.getCedula().equals(id)) {
					sellerFound = (Vendedor) seller;
					listaUsuarios.remove(sellerFound);
					messaje = "Vendedor eliminado";
					break;
				}else {
					throw new VendedorException ("Imposible eliminar el vendedor, intenta de nuevo");
				
				}
			}
		}
		return messaje;
	}
	
	
	
	//CRUD Administrador
	
	
	/**
	 * este metodo crea un administrador
	 * @param newAdministrador
	 * @return
	 */
	public String createAdministrador( Administrador newAdministrador) {
		
		String messaje = "Administrador Creado";
		
		Administrador AdministradorFound = null;

		try {
			AdministradorFound  = verifyAdministrador(newAdministrador.getCedula());
			listaUsuarios.add(newAdministrador);

		} catch (AdministradorException e) {
			messaje  = e.getMessage();
		}
		return messaje;
	}


	/**
	 * este metodo verifica si el administrador ya existe
	 * @param name
	 * @param id
	 * @return
	 * @throws AdministradorException
	 */
	public Administrador verifyAdministrador(String id) throws AdministradorException {
		
		Administrador administradorFound= null;
		for(Usuario administrator : listaUsuarios) {
			if(administrator instanceof Administrador) {
				if(administrator.getCedula().equals(id)) {
					administradorFound = (Administrador) administrator;
					
				}else {
					throw new AdministradorException ("Imposible crear el administrador, esta ye existe");
				}
			}
			
		}
		return  administradorFound;

	}
	
	/**
	 * este metodo obtiene un administrador por su cedula y nombre
	 * @param name
	 * @param id
	 * @return
	 * @throws AdministradorException
	 */
	public Administrador readAdministrador(String id) throws AdministradorException {

		Administrador administradorFound = null;
		for(Usuario administrator : listaUsuarios) {
			if(administrator instanceof Administrador) {
				if(administrator.getCedula().equals(id)) {
					administradorFound = (Administrador) administrator;	
				}
			}
			
		}if(administradorFound == null) {
			throw new AdministradorException ("Imposible encontrar el administrador, este ye existe");
		}
		return administradorFound ;
	}

	/**
	 * este metodo actualiza los datos de una administrador
	 * @param name
	 * @param surname
	 * @param id
	 * @param address
	 * @return
	 * @throws AdministradorException
	 */
	public String updateAdministrador(String name, String surname, String id, String address) throws AdministradorException {
		
		String messaje = "";
		Administrador administradorFound = null;
		
		for(Usuario administrator : listaUsuarios) {
			if(administrator instanceof Administrador) {
				if(administrator.getCedula().equals(id)) {
					administradorFound = (Administrador) administrator;
					administradorFound.setApellidos(surname);
					administradorFound.setDireccion(address);
					administradorFound.setNombre(name);
					administradorFound.setNombre(name);
					messaje = "Administrador actualizado";
					break;
				}else {
					throw new AdministradorException ("Imposible actualizar el administrador, intenta de nuevo");
				}
					
				

			}
		}
		return messaje;	
	}
	
	/**
	 * este metodo elimina un administrador
	 * @param id
	 * @return
	 * @throws AdministradorException
	 */
	public String deleteAdministrador(String id) throws AdministradorException {
		String messaje = "";
		Administrador administradorFound = null;
		for(Usuario administrator : listaUsuarios) {
			if(administrator instanceof Administrador) {
				if(administrator.getCedula().equals(id)) {
					 administradorFound = (Administrador) administrator;
					listaUsuarios.remove(administradorFound);
					messaje = "Administrador Eliminado";
					break;
					
				}else {
					throw new AdministradorException ("Imposible encontrar el administrador, este ye existe");

				}
					
				
			}
			
		}
		
		return messaje;
	}
	
	
	//----CRUD Producto----
	/**
	 * Este metodo crea un producto
	 * @param newProducto
	 * @return
	 */
	public String createProducto(Producto newProducto) {
		
		String messaje = "";
		Producto productoFound= null;
		
		try{
			productoFound = verifyProducto(newProducto.getCodigo());
			listaProductos.add(newProducto);
			messaje = "Producto creado";
			
			
		}catch (ProductoException e) {
			messaje  = e.getMessage();
		}
		
		
		
		
		return messaje;
	}


	/**
	 * Este metodo verifica si el producto ya existe 
	 * @param code
	 * @return
	 * @throws ProductoException
	 */
	public Producto verifyProducto(String code) throws ProductoException {
		
		Producto productoFound = null;
		for(Producto product : listaProductos) {
			if(product != null && product.getCodigo().equals(code)) {
				productoFound = product;
				throw new ProductoException("Imposible crear el producto, este ya existe");
			}
		}
			
		
	
		return null;
	}
	
	
	/**
	 * Este metodo obtien un producto por su codigo
	 * @param code
	 * @return
	 * @throws ProductoException
	 */
	public Producto readProducto(String code) throws ProductoException {
		
		Producto productoFound = null;
		for(Producto product : listaProductos) {
			if(product != null && product.getCodigo().equals(code)) {
				productoFound = product;
			}
		}if(productoFound == null) {
			throw new ProductoException("Imposible encontrar el producto, intenta de nuevo");
		}
	
		return productoFound;
	}

	/**
	 * Este metodo actualiza los datos de un producto
	 * @param code
	 * @param name
	 * @param category
	 * @param price
	 * @param status
	 * @return
	 * @throws ProductoException
	 */
	public String updateProducto(String code, String name, String category, double price, TipoEstado status) throws ProductoException {
		String messaje = "";
		Producto productoFound = null;
		for(Producto product : listaProductos) {
			if(product != null && product.getCodigo().equals(code)) {
				productoFound = product;
				productoFound.setCategoria(category);
				productoFound.setPrecio(price);
				productoFound.setTipoEstado(status);
				productoFound.setNombre(name);
				messaje = "Producto Actualizado";
				break;
			}else {
				throw new ProductoException("Imposible actualizar el producto, intenta de nuevo");
			}
		}
		return messaje;
	}
	
	/**
	 * Este metodo elimina un producto 
	 * @param code
	 * @return
	 * @throws ProductoException
	 */
	public String deleteProducto(String code) throws ProductoException {
		String messaje = "";
		Producto productoFound = null;
		for(Producto product : listaProductos) {
			if(product != null && product.getCodigo().equals(code)) {
				productoFound = product;
				listaProductos.remove(productoFound);
				messaje = "Producto eliminado";
				break;
			}else {
				throw new ProductoException ("Imposible eliminar el producto, intenta de nuevo");
			}
		}
	
		return messaje;
	}
	
	
	
	
	
}

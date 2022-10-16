package RedVendedores.test;

import RedVendedores.exceptions.AdministradorException;
import RedVendedores.exceptions.ProductoException;
import RedVendedores.exceptions.VendedorException;
import RedVendedores.model.Administrador;
import RedVendedores.model.Producto;
import RedVendedores.model.Red;
import RedVendedores.model.TipoEstado;
import RedVendedores.model.Vendedor;
import junit.framework.TestCase;


public class TestUnit extends TestCase {
	
	private Red red1;
	Vendedor vendedor1 = new Vendedor("Juan", "Lopez", "Cl 13", "124628", null);
	Administrador admin1 = new Administrador("Carlos", "Perez", "Cl 23", "24135");
	Producto product1 = new Producto("Dark_Souls", "15672", "Videojuegos", 150000.0, TipoEstado.PUBLICADO);

	
	public void TestRed() {
		red1 = new Red("Red de vendedores");
	}
	
	
	//JUnits de Vendedor
	public void testcreateVendedor() {
		TestRed();
		assertTrue(red1.createVendedor(vendedor1) == "Vendedor Creado exitosamente");
		
		
	}
	
	
	public void testupdateVendedor() throws VendedorException {
		TestRed();
		red1.createVendedor(vendedor1);
		assertTrue(red1.updateVendedor("Pepe", "Villanueva", "124628", "Cl 14") == ("Vendedor actualizado"));
		
	}
	
	public void testdeleteVendedor() throws VendedorException{
		TestRed();
		red1.createVendedor(vendedor1);
		assertTrue(red1.deleteVendedor("124628") ==  ("Vendedor eliminado"));
		
	}
	
	
	// JUnits de Administrador
	
	public void testCreateAdministrador() {
		TestRed();
		assertTrue(red1.createAdministrador(admin1) == "Administrador Creado");
		
		
	}
	
	
	public void testUpdateAdministrador() throws AdministradorException {
		TestRed();
		red1.createAdministrador(admin1);
		assertTrue(red1.updateAdministrador("Nicolas", "Villanueva", "24135", "Cl 34") == "Administrador actualizado");
		
	}
	
	public void testdeleteAdministrador() throws AdministradorException{
		TestRed();
		red1.createAdministrador(admin1);
		assertTrue(red1.deleteAdministrador("24135") == "Administrador Eliminado");
		
	}
	
	
	// JUnits de Producto
	
	public void testCreateProducto() {
		TestRed();
		assertTrue(red1.createProducto(product1) == "Producto creado");
		
		
	}
	
	public void testupdateProducto() throws ProductoException {
		TestRed();
		red1.createProducto(product1);
		assertTrue(red1.updateProducto( "15672", "AC/DC", "Musica", 14000.0, TipoEstado.PUBLICADO) == "Producto Actualizado");
		
	}
	
	public void testdeleteProducto() throws ProductoException{
		TestRed();
		red1.createProducto(product1);
		assertTrue(red1.deleteProducto("15672") == "Producto eliminado");
		
	}
	
	
	
	
	
	
}

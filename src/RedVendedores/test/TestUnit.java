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
	public void testcreateVendedor() throws VendedorException {
		TestRed();
		assertTrue(red1.verifyVendedor("124628") == null);
		assertTrue(red1.createVendedor(vendedor1) == "Vendedor Creado exitosamente");
		
		
	}
	
	public void testreadVendedor() throws VendedorException {
		TestRed();
		red1.createVendedor(vendedor1);
		assertTrue(red1.readVendedor("124628") == vendedor1);
		
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
	
	public void testCreateAdministrador() throws AdministradorException {
		TestRed();
		assertTrue(red1.verifyAdministrador("24135") == null);
		assertTrue(red1.createAdministrador(admin1) == "Administrador Creado");
		
		
	}
	
	public void testreadAdministrador() throws AdministradorException {
		TestRed();
		red1.createAdministrador(admin1);
		assertTrue(red1.readAdministrador("24135") == admin1);
		
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
	
	public void testCreateProducto() throws ProductoException {
		TestRed();
		assertTrue(red1.verifyProducto("15672") == null);
		assertTrue(red1.createProducto(product1) == "Producto creado");
		
		
	}
	
	public void testreadProducto() throws ProductoException {
		TestRed();
		red1.createProducto(product1);
		assertTrue(red1.readProducto("15672") == product1);
		
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

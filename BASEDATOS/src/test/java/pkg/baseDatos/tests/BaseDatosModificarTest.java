package pkg.baseDatos.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import pkg.baseDatos.BaseDeDatos;
import pkg.baseDatos.Dato;

public class BaseDatosModificarTest {

	private BaseDeDatos base;
	private ArrayList<Dato> lista;
	
	@Before
	public void setUp() throws Exception {
		ArrayList<Dato> lista = new ArrayList<Dato>();
		lista.add(new Dato("0", "Objeto 0"));
		lista.add(new Dato("1", "Objeto 2"));
		base = new BaseDeDatos(lista);
	}
	
	@Test
	public void cuandoSeModificaRegistroEntoncesNotNull() {
		Dato dato = new Dato("1", "Objeto 1");
		assertNotNull(this.base.modificar(dato));
	}
	
	@Test
	public void cuandoModifica1EntoncesTrue() {
		Dato dato = new Dato("0", "Objeto 0");
		this.base.modificar(dato);
		int largo = this.base.listar().size();
		assertTrue(largo==2);
	}

}

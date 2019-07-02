package pkg.baseDatos.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import pkg.baseDatos.BaseDeDatos;
import pkg.baseDatos.Dato;

public class BaseDatosEliminarTests {

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
	public void cuandoSeEliminaRegistroEntoncesNotNull() {
		Dato dato = new Dato("1", "Objeto 1");
		assertNotNull(this.base.eliminar(dato.getId()));
	}
	
	@Test
	public void cuandoSeEliminaRegistroEntonces1menos() {
		String idEliminar = "0";
		this.base.eliminar(idEliminar);
		int largo = this.base.listar().size();
		assertEquals(1, largo);
	}

}

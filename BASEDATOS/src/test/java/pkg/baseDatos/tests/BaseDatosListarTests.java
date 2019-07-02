package pkg.baseDatos.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


import pkg.baseDatos.BaseDeDatos;
import pkg.baseDatos.Dato;

public class BaseDatosListarTests {
	
	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		ArrayList<Dato> lista = new ArrayList<Dato>();
		lista.add(new Dato("0", "Objeto 0"));
		lista.add(new Dato("1", "Objeto 2"));
		base = new BaseDeDatos(lista);
	}
	
	@Test
	public void cuandoListarEntoncesNotNull() {
		assertNotNull(this.base.listar());
	}
	
	@Test
	public void cuandoListarEntoncesSize2() {
		int largo = this.base.listar().size();
		assertTrue(largo==2);
	}
}

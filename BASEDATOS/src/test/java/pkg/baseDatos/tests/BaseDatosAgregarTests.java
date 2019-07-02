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


public class BaseDatosAgregarTests {
	
	private BaseDeDatos base;
	private ArrayList<Dato> lista;
	
	@Before
	public void setUp() throws Exception {
		lista = new ArrayList<Dato>();
		lista.add(new Dato("0", "Objeto 0"));
		lista.add(new Dato("1", "Objeto 2"));
		base = new BaseDeDatos(lista);
	}
	
	@Test
	public void cuandoSeAgregaRegistroEntoncesNotNull() {
		Dato dato = new Dato("1", "Objeto 1");
		this.base.agregar(dato);
		assertNotNull(base);
	}
	
	@Test
	public void cuandoInserta1Entonces3() {
		lista.add(new Dato("3", "Objeto 3"));
		int largo = this.base.listar().size();
		assertTrue(largo==3);
	}
	
}

package pkg.baseDatos.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BaseDatosAgregarTests.class, BaseDatosEliminarTests.class, BaseDatosListarTests.class,
		BaseDatosModificarTest.class })
public class AllTests {

}

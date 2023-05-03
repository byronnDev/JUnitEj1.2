package ed23_ud12_junit_ej1_2;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.cuatrovientos.ed.GeneradorIp;
import org.junit.internal.runners.statements.Fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	GeneradorIp ip;
	@BeforeEach
	void setUp() throws Exception {
		ip = new GeneradorIp();
	}

	@RepeatedTest(1000)
	void testGenerarNumero() {
		int min = 1;
		int max = 254;
		int actual = ip.generarNumero(min, max);
		assertTrue(actual >= min && actual <= max, actual + " está mal");
	}
	
	@Test
	void testGeneraIp() {
		String ipActual = ip.generarIp();
		String[] target = ipActual.split("\\.");
		assertTrue(!target[0].startsWith("0") || !target[3].startsWith("0"),"La IP "+ipActual+ " NO es correcta");
	}

}

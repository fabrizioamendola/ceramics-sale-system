import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCeramic {
	
	Ceramic ceramic;

	@BeforeEach
	void setUp() throws Exception {
		ceramic = new Ceramic("SPL",
							  "Monalisa",
							  80, 160,
							  Type.PORCELAIN,
							  1,
							  48500,
							  50);
	}

	@Test
	void test_eachCeramic_knowsItsBrand_andName() {
		//first test using TDD
		//ceramic = new Ceramic("Lourdes",
		//				"Calcareo gris");
		assertEquals("SPL", ceramic.getBrand());
		assertEquals("Monalisa", ceramic.getName());
	}
	
	@Test
	void test_eachCeramic_knowsItsHeight_andWidth() {
		assertEquals(80, ceramic.getHeight());
		assertEquals(160, ceramic.getWidth());
	}
	
	@Test
	void test_eachCeramic_knowsItsType_andQuality() {
		assertEquals(Type.PORCELAIN, ceramic.getType());
		assertEquals(1, ceramic.getQuality());
	}
	
	@Test
	void test_eachCeramic_knowsItsPrice_andRealStock() {
		assertEquals(48500, ceramic.getPrice());
		assertEquals(50, ceramic.getRealStock());
	}
	

}

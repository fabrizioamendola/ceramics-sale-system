import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCeramic {
	
	Ceramic ceramic;

	@BeforeEach
	void setUp() throws Exception {
		ceramic = new Ceramic("SPL",           //brand
							  "Monalisa",      //name
							  0.80, 1.60,	   //height and width
							  Type.PORCELAIN,  //type
							  1,			   //quality
							  48500,           //price
							  50,              //real stock
							  3.84);		   //amount per box
	}

	@Test
	void test_eachCeramic_knowsItsBrand_andName() {
		//first test using TDD
		assertEquals("SPL", ceramic.getBrand());
		assertEquals("Monalisa", ceramic.getName());
	}
	
	@Test
	void test_eachCeramic_knowsItsHeight_andWidth() {
		assertEquals(0.80, ceramic.getHeight());
		assertEquals(1.60, ceramic.getWidth());
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
	
	@Test
	void test_eachCeramic_knowsItsAmountPerBox() {
		assertEquals(3.84, ceramic.getAmountPerBox());
	}
	
	@Test
	void test_tilesPerBox() {
		// 0.8 * 1.6 = 1.28
		// 3.84 / 1.28 = 3
		assertEquals(3, Math.ceil(ceramic.tilesPerBox())); //Math.ceil redondea el número
	}
	
	@Test
	void test_addStock(){
		ceramic.addStock(50);
		assertEquals(100, ceramic.getRealStock());
	}
	
	@Test
	void test_removeStock() {
		ceramic.removeStock(50);
		assertEquals(0, ceramic.getRealStock());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package tests;

import static org.junit.Assert.*;

import java.awt.geom.Area;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import peak.Peak;

public class MyTests {
	
	ArrayList<Integer> testArray = new ArrayList<>();
	
	@Before
	public void setUp() throws Exception {
		testArray.add(2);
		testArray.add(6);
		testArray.add(6);
		testArray.add(6);
		testArray.add(3);
	}

	@Test
	public void test() {
		
		Peak testPeak = new Peak(); 
		assertEquals("2,6,6,6,3 Should give 2 castles", 2, testPeak.findPeak(testArray));
	}

}

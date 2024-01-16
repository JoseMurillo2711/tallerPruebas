package test;

import static Calculate.Calculation.findMax;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class testCalculate {

	@Test
	public void testFindMax() {
		assertEquals(4,findMax(new int[] {1,3,4,2}));
		assertEquals(-1,findMax(new int[] {-12,-1,-3,-4,-2}));
		assertEquals(12,findMax(new int[] {12,-1,3,-4,2}));
		
	}
}
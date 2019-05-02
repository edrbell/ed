package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void indexOf() {
		int[] v = new int[] {16, 12, 15, 14, 17};
		assertEquals(0, Vector.indexOf(v, 16));
		assertEquals(2, Vector.indexOf(v, 15));
		assertEquals(4, Vector.indexOf(v, 17));
		assertEquals(-1, Vector.indexOf(v, 33));
	}
	
	@Test
	void indexOfEmpty() {
		int[] v = new int[] {};
		assertEquals(-1, Vector.indexOf(v, 22));
	}
	
	@Test
	void min() {
		assertEquals(12, Vector.min(new int[] {16, 12, 15, 14, 17}));
	}
	
	@Test
	void indexOfMin() {
		int[] v = new int[] {16, 12, 15, 14, 17};
		assertEquals(1, Vector.indexOfMin(v, Vector.min(v)));
	}
	
	@Test
	void sort() {
		int[] v = new int[] {15, 12};
		Vector.sort(v);
		assertArrayEquals(new int[] {12, 15}, v);
		v = new int[] {17, 12, 15};
		Vector.sort(v);
		assertArrayEquals(new int[] {12, 15, 17}, v);
		v = new int[] {17};
		Vector.sort(v);
		assertArrayEquals(new int[] {17}, v);
		v = new int[] {17, 54, 78, 4, 0};
		Vector.sort(v);
		assertArrayEquals(new int[] {0, 4, 17, 54, 78}, v);
	}
}

package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int[] v = new int[] {16, 12, 15, 14, 17};
		int index = indexOf(v, 12);
		System.out.println("index=" + index);
		sort(v);
	}

	public static int indexOf(int[] v, int x) {
		for (int index = 0; index < v.length; index++) {
			if (v[index] == x)
				return index;
		}
		return -1;
	}
	
	public static int min(int[] v) {
		int menor = v[0];
		for (int index = 0; index < v.length; index++) {
			if (v[index] < menor)
				menor = v[index];
		}
		return menor;
	}
	
	public static int indexOfMin(int[] v, int menor) {
		for (int index = 0; index < v.length; index++) {
			if (v[index] == menor)
				return index;
		}
		return -1;
	}
	
	public static void sort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int indexOfMin = i;
			for (int index = i; index < v.length; index++) {
				if (v[index] < v[indexOfMin])
					indexOfMin = index;
			}
			int aux = v[i];
			v[i] = v[indexOfMin];
			v[indexOfMin] = aux;
		}
	}
	
}

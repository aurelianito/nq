package nq;

import java.util.Vector;
import java.util.stream.IntStream;

public class Solution extends Exception {
	/* Extends exception to ease backtracking bailout */
	
	private Vector<Integer> vec;
	
	public Solution(Vector<Integer> v) {
		vec = v;
	}
	
	public void show() {
		int size = vec.size();
		IntStream.range(0, size).forEachOrdered(i -> {
			IntStream.range(0, size).forEachOrdered( j -> {
				System.out.print( vec.get(i) == j ? 'o' : '.');
			});
			System.out.println();
		});
	}
}

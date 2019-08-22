package nq;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solution extends Exception {
	/* Extends exception to ease backtracking bailout. I prefer to avoid ifs :) */
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Integer> vec;
	
	public Solution(ArrayList<Integer> v) {
		vec = v;
	}
	
	public void show() {
		int size = vec.size();
		IntStream.range(0, size).forEachOrdered(i -> {
			IntStream.range(0, size).forEachOrdered( j -> {
				System.out.print( vec.get(i) == j ? "o " : ". ");
			});
			System.out.println();
		});
	}
}

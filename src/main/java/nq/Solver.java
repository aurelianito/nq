package nq;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Solver {
	public static int diag1(int x, int y) {
		return x+y;
	}
	
	public static int diag2(int x, int y) {
		return x-y;
	}
	
	private int size;
	private Set<Integer> diag1s;
	private Set<Integer> diag2s;
	private Set<Integer> rows;
	private Vector<Integer> solutionVec;
	
	public Solver(int size) {
		this.size = size;
		diag1s = new HashSet<Integer>(); 
		diag2s = new HashSet<Integer>();
		rows = new HashSet<Integer>();
		solutionVec = new Vector<Integer>();
	}
	
	

}

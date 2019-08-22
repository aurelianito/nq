package nq;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Solver {
	public static int diag1(int x, int y) {
		return x + y;
	}

	public static int diag2(int x, int y) {
		return x - y;
	}

	private int size;
	private Set<Integer> diag1s;
	private Set<Integer> diag2s;
	private Set<Integer> rows;
	private ArrayList<Integer> solutionVec;

	public Solver(int size) {
		this.size = size;
		diag1s = new HashSet<Integer>();
		diag2s = new HashSet<Integer>();
		rows = new HashSet<Integer>();
		solutionVec = new ArrayList<Integer>();
	}

	public void solve() throws Solution {
		if (solutionVec.size() == size) {
			throw new Solution(solutionVec);
		}
		
		int i = solutionVec.size();
		for (int j=0; j<size; j++) {
			int d1 = diag1(i,j);
			if( rows.contains(j)) {
				continue;
			}
			if( diag1s.contains(d1) ) {
				continue;
			}
			int d2 = diag2(i,j);
			if( diag2s.contains(d2)) {
				continue;
			}
			
			solutionVec.add(j);
			rows.add(j);
			diag1s.add(d1);
			diag2s.add(d2);
			
			solve();
			
			// Can be reached only if a solution is not found 
			solutionVec.remove(solutionVec.size() - 1);
			rows.remove(j);
			diag1s.remove(d1);
			diag2s.remove(d2);
		}
	}

}

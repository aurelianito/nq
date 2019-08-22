package nq;

import java.util.HashSet;
import java.util.Set;
import java.math.BigInteger;
import java.util.ArrayList;

public class Solver {
	
	public static int gcd(int a, int b) {
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}
	
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
	
	public boolean aligned3(int i, int j) {
		for (int ii=0; ii<i; ii++) {
			int jj = solutionVec.get(ii);
			
			int delta_i = i - ii;
			int delta_j = j - jj;
			
			int g = gcd(delta_i, delta_j);
			
			int i_step = delta_i / g;
			int j_step = delta_j / g;
			
			//avoid aliasing to not mess with for
			int cur_i = ii;
			int cur_j = jj;
			
			do {
				cur_i = cur_i - i_step;
				if (cur_i < 0) {
					break;
				}
				cur_j = cur_j - j_step;
				if (solutionVec.get(cur_i) == cur_j) {
					return true;
				}
			} while(true);
		}
		return false;
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
			
			if (aligned3(i,j)) {
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

package nq;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolverTest {

	@Test
	public void testDiag1() {
		assertEquals(3, Solver.diag1(1, 2));
	}
	
	@Test
	public void testDiag2() {
		assertEquals(-1, Solver.diag2(1, 2));
	}


}

package nq;

public class App {
    public static void main(String[] args) {
    	
    	int size = Integer.valueOf(args[0]);
    	Solver solver = new Solver(size);
    	try {
    		solver.solve();
    	} catch (Solution s) {
    		s.show();
    	}
    }
}

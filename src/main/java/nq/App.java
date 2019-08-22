package nq;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
    	
    	int size = Integer.valueOf(args[0]);    	
    	ArrayList<Integer> v = new ArrayList<Integer>();
    	IntStream.range(0, size).forEachOrdered(i -> {
    		v.add(i);
    	});
    	
    	Solution s = new Solution(v);
    	
    	s.show();
    }
}

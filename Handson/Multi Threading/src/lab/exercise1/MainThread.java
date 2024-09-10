package lab.exercise1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainThread {
	public static int[][] splitArray(int[] inputArray, int chunkSize) {
	    return IntStream.iterate(0, i -> i + chunkSize)
	            .limit((int) Math.ceil((double) inputArray.length / chunkSize))
	            .mapToObj(j -> Arrays.copyOfRange(inputArray, j, Math.min(inputArray.length, j + chunkSize)))
	            .toArray(int[][]::new);
	}
	
	
	public static void main(String[] args) {
	
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15};
		int chunkSize = 5;
		
		int[][] output = splitArray(inputArray, chunkSize);
		// sub thread
    	for (int[] x : output) {
    		MiniMapReduce t = new MiniMapReduce(x);
    		t.start();
    	}
    	//MAIN THREAD
    	MiniMapReduce t = new MiniMapReduce();
    	try {
    	Thread.sleep(1000);
    	}
    	catch(Exception e) {
    	
    	}
    	int a = t.getAvg();
    	System.out.println("final avg of array of elements: " +a/output.length);
}
}



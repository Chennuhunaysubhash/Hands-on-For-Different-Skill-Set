package lab.exercise1;



class MiniMapReduce extends Thread {
	private int[] array;
	int arrayLength; 
	static int avgMain = 0;
	
	public MiniMapReduce(){
		
	}
	
	public MiniMapReduce(int[] array) {
		this.array = array;
		this.arrayLength = array.length;
		
	}
	
	public int getAvg() {
		return avgMain;
	}
	
	@Override
	public synchronized void run(){
		
		try {
			int sum = 0;
			int avg;
			
			for(int i = 0;i<arrayLength;i++) {
				sum = sum + array[i];
			}
			
			avg = sum/arrayLength;
			avgMain = avgMain+avg;
		}catch(Exception e) {
			System.out.println();
		}	
	}
	
	
}


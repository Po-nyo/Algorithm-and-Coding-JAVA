package editDistance;

public class EditDistance {
	private String str1;
	private String str2;
	private int[][] distanceArray;	/* 부분문자열에 대한 편집거리 배열  */
	private String workDetails;
	private int minimumCost;
	
	public EditDistance(String str1, String str2) {
		this.str1 = " "+str1;
		this.str2 = " "+str2;
		this.distanceArray = new int[this.str1.length()][this.str2.length()];
		work();
	}
	
	private void work() {
		for(int i=0; i<distanceArray.length; i++)
			distanceArray[i][0] = i;
		
		for(int i=0; i<distanceArray[0].length; i++)
			distanceArray[0][i] = i;
		
		for(int i=1; i<distanceArray.length; i++) {
			for(int j=1; j<distanceArray[i].length; j++) {
				if(str1.charAt(i) == str2.charAt(j)) 	 /* 같은 문자이면			*/
					distanceArray[i][j] = distanceArray[i-1][j-1]; /* 왼쪽 위의 값 가져옴(같음)	*/
				else { /* 다른 문자이면									*/
					   /* 왼쪽위, 왼쪽, 위쪽 중에 가장 작은 값에 1 을 더하여 가져옴	*/
					   /* 왼쪽 위 : 수정									*/
					   /* 왼쪽 : 삽입									*/
					   /* 위쪽 : 삭제									*/
					int min = min(distanceArray[i][j-1], distanceArray[i-1][j-1], distanceArray[i-1][j]);
					distanceArray[i][j] = min+1;
				}
			}
		}
		
		this.minimumCost = distanceArray[distanceArray.length-1][distanceArray[0].length-1];
		trace();
	}
	
	private int min(int a, int b, int c) {
		int minValue = a;
		
		if(minValue > b)
			minValue = b;
		if(minValue > c)
			minValue = c;
		
		return minValue;
	}
	
	private void trace() {
		workDetails = "";
		int i = distanceArray.length-1;
		int j = distanceArray[0].length-1;
			
		while(i!=0 || j!=0) {
			if(i==0) {	// 왼쪽 (삽입)
				workDetails = "I"+workDetails;
				j--;
				continue;
			}
			if(j==0) {	// 위쪽 (삭제)
				workDetails = "D"+workDetails;
				i--;
				continue;
			}
			int min = min(distanceArray[i][j-1], distanceArray[i-1][j-1], distanceArray[i-1][j]);
				
			if(min == distanceArray[i][j]) {	// 같음 : Match
				workDetails = "M"+workDetails;
				i--;
				j--;
			}
			else if(min == distanceArray[i-1][j]) { // 위쪽 : Delete
				workDetails = "D"+workDetails;
				i--;
			}
			else if(min == distanceArray[i-1][j-1]) {	// 왼쪽 위 : Substitute
				workDetails = "S"+workDetails;
				i--;
				j--;
			}
			else {	// 왼쪽 : Insert
				workDetails = "I"+workDetails;
				j--;
			}
		}
	}
	
	public void print() {
		// 형식에 맞게 출력
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		// 최소 비용
		System.out.println("Minimum cost = "+minimumCost);
		System.out.println();
		System.out.println(workDetails);	// 편집추적
		System.out.println();
			
		// 편집거리 배열 출력
		printDistanceArray();
		System.out.println();
	}
	
	public void printDistanceArray() {
		System.out.print("     ");
		for(int i=0; i<str2.length(); i++) {
			System.out.print(str2.charAt(i)+"  ");
		}
		System.out.println();
		
		for(int i=0; i<distanceArray.length; i++) {
			System.out.print(str1.charAt(i)+":  ");
			for(int j=0; j<distanceArray[i].length; j++) {
				if(j == distanceArray[i].length-1)
					System.out.printf("%2d",distanceArray[i][j]);
				else
					System.out.printf("%2d ",distanceArray[i][j]);
			}
			System.out.println();
		}
	}
	
	public int getMinimumCost() {
		return this.minimumCost;
	}
	
	public String getWorkDetails() {
		return this.workDetails;
	}
	
	public int[][] getDistanceArray() {
		return distanceArray;
	}

}

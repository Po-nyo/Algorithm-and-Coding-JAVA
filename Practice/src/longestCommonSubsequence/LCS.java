package longestCommonSubsequence;

public class LCS {
	private String str1;
	private String str2;
	private int[][] lcsArray;
	private String lcs;
	private int lcsLength;
	
	public LCS(String str1, String str2) {
		this.str1 = " "+str1;
		this.str2 = " "+str2;
		
		lcsArray = new int[str1.length()][str2.length()];
	}
	
	public void call() {
		work();
		trace();
		print();
	}
	
	public void print() {
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("lcs : "+lcs);
		System.out.println("Length = "+lcsLength);
	}
	
	private void work() {
		for(int i=1; i<lcsArray.length; i++) {
			for(int j=1; j<lcsArray[0].length; j++) {
				if(str1.charAt(i) == str2.charAt(j))
					lcsArray[i][j] = lcsArray[i-1][j-1]+1;
				else
					lcsArray[i][j] = Math.max(lcsArray[i-1][j], lcsArray[i][j-1]);
			}
		}
	}
	
	private void trace() {
		lcs = "";
		
		int i = lcsArray.length-1;		
		int j = lcsArray[0].length-1;
			
		// 배열의 맨 끝 부터 추적
		// 같은 숫자가 있는 곳 까지 왼쪽 이동
		// 같은 숫자가 있는 곳 까지 위로 이동
		// 왼쪽,위쪽에 같은 수가 없으면 
		// 왼쪽 대각선으로 이동한뒤 문자 result 에 추가
		while(lcsArray[i][j]!=0) {
			if(lcsArray[i][j] == lcsArray[i][j-1])	
				j--;
			else if (lcsArray[i][j] == lcsArray[i-1][j])
				i--;
			else {
				lcs = str2.charAt(j) + lcs;
				i--;
				j--;
			}
		}
		
		lcsLength = lcs.length();
	}

	public int[][] getLcsArray() {
		return lcsArray;
	}

	public String getLcs() {
		return lcs;
	}

	public int getLcsLength() {
		return lcsLength;
	}
	
}

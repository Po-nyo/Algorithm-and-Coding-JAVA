package longestIncreasingSubsequence;

public class LIS {
	private String sequence;
	private int maxLength;
	private String lis;
	private int[] dp;
	private int max_dp_index;
	private int[] parent;
	
	public LIS(String sequence) {
		this.sequence = sequence;
		dp = new int[sequence.length()];
		parent = new int[sequence.length()];
		
		work();
	}
	
	private void work() {
		dp[0] = 1;
		parent[0] = 0;
		
		for(int i=1; i<dp.length; i++) {
			int max = 0;
			int parentIndex = i;
			char current = sequence.charAt(i);
			
			for(int j=0; j<i; j++) {
				if(sequence.charAt(j)<current && dp[j]>max) {
					parentIndex = j;
					max = dp[j];
				}
			}
			
			dp[i] = max+1;
			parent[i] = parentIndex;
		}
		
		max_dp_index = maxIndex(dp);
		subsequence();
		maxLength = lis.length();
	}
	
	private int maxIndex(int[] arr) {
		int max = arr[0];
		int max_index = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				max_index = i;
			}
		}
		
		return max_index;
	}
	
	private void subsequence() {
		int n = max_dp_index;
		String result = ""+sequence.charAt(n);
		
		while(parent[n] != n) {
			result = sequence.charAt(parent[n]) + result;
			n = parent[n];
		}

		this.lis = result;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public String getLis() {
		return lis;
	}

}

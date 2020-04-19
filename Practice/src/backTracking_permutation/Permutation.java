package backTracking_permutation;

public class Permutation {
	
	private int n;
	private int cnt;
	
	public Permutation(int n) {
		this.n = n;
		this.cnt = 0;
	}
	
	public void run() {
		int[] permutation = new int[n];
		backtrack(permutation, 0, n);
		System.out.println(" 총 순열의 갯수 : "+cnt);
	}
	
	private void backtrack(int[] permutation, int depth, int n) {
		if(depth == n) {
			printPermutation(permutation);
			cnt++;
		}
		else {
			for(int i=1; i<=n; i++) {
				if(isPromising(permutation, depth, i)) {
					permutation[depth] = i;
					backtrack(permutation, depth+1, n);
				}
			}
		}
	}
	
	private boolean isPromising(int[] permutation, int depth, int i) {
		for(int j=0; j<depth; j++) {
			if(permutation[j] == i)
				return false;
		}
		
		return true;
	}
	
	private void printPermutation(int[] permutation) {
		for(int i : permutation)
			System.out.print(" "+i);
		System.out.println();
	}
	
	public void setN(int n) {
		this.n = n;
		this.cnt = 0;
	}

}

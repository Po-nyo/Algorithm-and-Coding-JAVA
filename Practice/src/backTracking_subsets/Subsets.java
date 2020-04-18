package backTracking_subsets;

public class Subsets {
	
	private int[] parentSet;
	private int count;
	private int n;
	
	public Subsets(int n) {
		this.n = n;
		this.count = 0;
		inIt();
	}
	
	public void setN(int n) {
		this.n = n;
		this.count = 0;
		inIt();
	}
	
	private void inIt() {
		parentSet = new int[n];
		
		for(int i=1; i<=n; i++)
			this.parentSet[i-1] = n;
	}
	
	public void printSubsets() {
		boolean[] using = new boolean[parentSet.length];
		
		backtrack(using, 0, n);
		System.out.println("Number of subsets : "+this.count);
	}
	
	private void backtrack(boolean[] using, int depth, int n) {
		if(depth == n) {
			print(using);
			count++;
		}
		else {
			boolean[] candidates = new boolean[2];
			int ncand = construct_candidates(candidates);
			
			for(int i=0; i<ncand; i++) {
				using[depth] = candidates[i];
				backtrack(using, depth+1, n);
			}
		}
	}
	
	private int construct_candidates(boolean[] candidates) {
		candidates[0] = false;
		candidates[1] = true;
		
		return 2;
	}

	private void print(boolean[] using) {
		System.out.print("{ ");
		for(int i=0; i<using.length; i++) {
			if(using[i])
				System.out.print((i+1)+" ");
		}
		System.out.println("}");
	}
	
}

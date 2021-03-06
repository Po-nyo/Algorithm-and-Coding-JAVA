package backTracking_subsets;

public class Subsets {
	
	private int[] superSet;
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
		superSet = new int[n];
		
		for(int i=1; i<=n; i++)
			this.superSet[i-1] = n;
	}
	
	public void printSubsets() {
		boolean[] using = new boolean[superSet.length];
		
		backtrack(using, 0);
		System.out.println("Number of subsets : "+this.count);
	}
	
	private void backtrack(boolean[] using, int depth) {
		if(depth == n) {
			print(using);
			count++;
		}
		else {
			boolean[] candidates = new boolean[2];
			int ncand = construct_candidates(candidates);
			
			for(int i=0; i<ncand; i++) {
				using[depth] = candidates[i];
				backtrack(using, depth+1);
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

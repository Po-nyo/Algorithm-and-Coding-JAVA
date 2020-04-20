package coloringVertex;

public class ColoringVertexService {
	
	private int[][] graph;
	private int n;	// 색깔의 갯수
	private boolean solved;
	
	public ColoringVertexService(int[][] graph, int n) {
		this.graph = graph;
		this.n = n;
	}
	
	public boolean coloring() {
		int[] colored = new int[graph.length];	// index : 꼭짓점, value : 색깔
		colored[0] = 0;	// 0번 꼭짓점을 0번 색으로 칠하고 시작
		
		backtrack(colored, 1);
		return solved;
	}
	
	private void backtrack(int[] colored, int v) {
		if(v == graph.length || solved)
			solved = true;
		else {
			for(int i=0; i<n; i++) {
				if(isPromising(colored, v, i)) {
					colored[v] = i;
					backtrack(colored, v+1);
				}
			}
		}
	}
	
	private boolean isPromising(int[] colored, int v, int i) {
		for(int j=0; j<v; j++) {
			if(graph[v][j]==1 && colored[j]==i)
				return false;
		}
		
		return true;
	}

}

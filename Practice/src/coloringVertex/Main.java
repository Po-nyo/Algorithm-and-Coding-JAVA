package coloringVertex;

import java.util.Scanner;

/**
 * 
 * @author wkj11
 * 꼭짓점의 갯수 v와 색깔의 갯수 n,
 * 그리고 그래프의 인접행렬이 주어졌을 때
 * n가지 색만을 사용하여 인접한 
 * 두 꼭짓점에 같은 색이 칠해지지 않도록
 * 모든 꼭짓점을 색칠할 수 있는지 판별한다.
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v;	// 꼭짓점 갯수
		int n;	// 색깔의 갯수
		int[][] graph;
		
		while(sc.hasNextLine()) {
			v = sc.nextInt();
			n = sc.nextInt();
			
			graph = new int[v][v];
			for(int i=0; i<v; i++) {
				for(int j=0; j<v; j++)
					graph[i][j] = sc.nextInt();
			}
			
			ColoringVertexService cvs = new ColoringVertexService(graph, n);
			if(cvs.coloring())
				System.out.println("Solutions Exist");
			else
				System.out.println("No Solution");
		}
		sc.close();
	}

}

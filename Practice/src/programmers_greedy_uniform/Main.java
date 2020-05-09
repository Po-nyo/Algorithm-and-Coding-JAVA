package programmers_greedy_uniform;
/**
 * 
 * @author wkj11
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		int[] lost = {2, 3, 5, 6, 7, 8, 10, 11};
		int[] reserve = {3, 4, 5, 7, 8, 9};

		Solution s = new Solution();
		int answer = s.solution(n, lost, reserve);
		System.out.println(answer);

	}

}

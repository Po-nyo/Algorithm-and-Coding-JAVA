package baekjoon_1062;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] words = new String[n];
		
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String word = sc.nextLine();
			words[i] = word.substring(4, word.length()-4);
		}
		
		Solution s = new Solution();
		s.solution(words, k);
		
		sc.close();

	}

}

package baekjoon_1062;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		String[] words = new String[n];

		for(int i=0; i<n; i++) {
			String word = br.readLine();
			words[i] = word.substring(4, word.length()-4);
		}

		Solution s = new Solution();
		s.solution(words, k);

	}

}

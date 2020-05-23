package baekjoon_1062;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		int k = Integer.parseInt(line.split(" ")[1]);

		String[] words = new String[n];

		for(int i=0; i<n; i++) {
			String word = br.readLine();
			words[i] = word.substring(4, word.length()-4);
		}

		Solution s = new Solution();
		s.solution(words, k);

	}

}

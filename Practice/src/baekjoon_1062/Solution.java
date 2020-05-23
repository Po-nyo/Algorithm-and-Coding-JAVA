package baekjoon_1062;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	String[] words;
	int max;
	
	public void solution(String[] words, int k) {
		this.words = words;
		this.max = 0;
		
		Set<Character> learned = new HashSet<>();
		learned.add('a');
		learned.add('n');
		learned.add('t');
		learned.add('i');
		learned.add('c');
		
		if(k <= 5)
			System.out.println(0);
		else if(k == 26)
			System.out.println(words.length);
		else {
			backtrack(learned, 0, k-5);
			System.out.println(this.max);
		}
	}
	
	private void backtrack(Set<Character> learned, int depth, int k) {
		if(depth == k) {
			count(learned);
		}
		else {
			for(Character c='a'; c<='z'; c++) {
				if(!learned.contains(c)) {
					learned.add(c);
					backtrack(learned, depth+1, k);
					learned.remove(c);
				}
			}
		}
	}
	
	private void count(Set<Character> learned) {
		int cnt = 0;
		
		Loop : for(String word : this.words) {
			for(int i=0; i<word.length(); i++) {
				if(!learned.contains(word.charAt(i)))
					continue Loop;
			}
			cnt++;
		}
		
		if(this.max < cnt)
			this.max = cnt;
	}
	
}

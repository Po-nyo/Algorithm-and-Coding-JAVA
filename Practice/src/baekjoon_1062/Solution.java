package baekjoon_1062;

import java.util.ArrayList;

public class Solution {
	String[] words;
	boolean[] alphabets;
	ArrayList<Character> candidates;
	int max;
	
	public void solution(String[] words, int k) {
		this.words = words;
		alphabets = new boolean[26];
		this.max = 0;
		
		candidates = candidates();
		
		if(k < 5)
			max = 0;
		else if(candidates.size() <= k-5)
			max = words.length;
		else 
			backtrack(0, 5, k);
		
		System.out.println(this.max);
	}
	
	private ArrayList<Character> candidates() {
		alphabets['a'-'a'] = true;
		alphabets['n'-'a'] = true;
		alphabets['t'-'a'] = true;
		alphabets['i'-'a'] = true;
		alphabets['c'-'a'] = true;
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(String word : words) {
			for(int i=0; i<word.length(); i++) {
				char c = word.charAt(i);
				if(!alphabets[c-'a'] && !list.contains(c))
					list.add(c);
			}
		}
		
		return list;
	}
	
	private void backtrack(int start, int depth, int k) {
		if(depth == k) {
			count();
		}
		else {
			for(int i=start; i<this.candidates.size(); i++) {
				char c = this.candidates.get(i);				
				this.alphabets[c-'a'] = true;
				backtrack(i+1, depth+1, k);
				this.alphabets[c-'a'] = false;
			}
		}
	}
	
	private void count() {
		int cnt = 0;
		
		Loop : for(String word : this.words) {
			for(int i=0; i<word.length(); i++) {
				if(!alphabets[word.charAt(i)-'a'])
					continue Loop;
			}
			cnt++;
		}
		
		if(this.max < cnt)
			this.max = cnt;
	}

}

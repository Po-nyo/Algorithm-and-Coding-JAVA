package programmers_greedy_uniform;

import java.util.Arrays;

public class Solution {
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        int[] uniforms = new int[n+1];
        Arrays.fill(uniforms, 1);
        
        for(int i=0; i<lost.length; i++)
           uniforms[lost[i]]--;
        
        for(int i=0; i<reserve.length; i++)
           uniforms[reserve[i]]++;
        
        if(uniforms[1] == 2 && uniforms[2] == 0) {
           uniforms[1]--;
           uniforms[2]++;
        }
        
        if(uniforms[n] == 2 && uniforms[n-1] == 0) {
           uniforms[n]--;
           uniforms[n-1]++;
        }
        
        for(int i=2; i<uniforms.length-1; i++) {
           if(uniforms[i] == 2) {
              if(uniforms[i-1] == 0) {
                 uniforms[i-1]++;
                 uniforms[i]--;
              }
              else if(uniforms[i+1] == 0) {
                 uniforms[i+1]++;
                 uniforms[i]--;
              }
           }
        }
        
        for(int i=1; i<uniforms.length; i++) {
           if(uniforms[i] == 0)
              answer--;
        }   
        
        return answer;
    }

}

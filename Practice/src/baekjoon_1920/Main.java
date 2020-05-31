package baekjoon_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		Set<Integer> numberSet = new HashSet<Integer>();
		
		String[] numbers = br.readLine().split(" ");
		for(int i=0; i<numbers.length; i++)
			numberSet.add(Integer.parseInt(numbers[i]));
		
		br.readLine();
		
		numbers = br.readLine().split(" ");
		for(int i=0; i<numbers.length; i++) {
			if(numberSet.contains(Integer.parseInt(numbers[i])))
				System.out.println(1);
			else
				System.out.println(0);
		}

	}

}

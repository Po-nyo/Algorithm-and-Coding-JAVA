package alphabet_operator;

import java.util.ArrayList;
import java.util.List;

public class MyCalculator {
	private List<Character> operators;
	private String num;
	
	public MyCalculator() {
		this.operators = new ArrayList<Character>();
		this.operators.add('P');
		this.operators.add('S');
		this.operators.add('T');
		this.operators.add('V');
		
		this.num = "ABCDEFGHIJ";
	}
	
	public void run(String exp) {
		String translated = translate(exp);
		String[] numbers = translated.split("P|S|T|V");
		
		if(!isValid(translated))
			System.out.println("Error");
		else {
			int result = Integer.parseInt(numbers[0]);
			int numIndex = 1;
			
			String oper = translated.replaceAll("[0-9]", "");
			
			for(int i=0; i<oper.length(); i++) {
				result = calc(oper.charAt(i), result, Integer.parseInt(numbers[numIndex++]));
			}
			
			System.out.println(result);
		}
	}
	
	private String translate(String exp) {
		String translated = "";
		
		for(int i=0; i<exp.length(); i++) {
			char current = exp.charAt(i);
			if(!operators.contains(current))
				translated += this.num.indexOf(current);
			else
				translated += current;
		}
		
		return translated;
	}
	
	private int calc(char operator, int a, int b) {
		if(operator == 'P')
			return a+b;
		else if(operator == 'S')
			return a-b;
		else if(operator == 'T')
			return a*b;
		else
			return a/b;
	}
	
	private boolean isValid(String translated) {
		translated = translated.replaceAll("[0-9]", "N");
		
		for(int i=0; i<translated.length(); i++) {
			if(translated.charAt(i) != 'N') {
				if(i==0 || i==translated.length()-1)
					return false;
				else
					if(translated.charAt(i-1) != 'N' || translated.charAt(i+1) != 'N')
						return false;
			}
		}
		return true;
	}
}

package puzzles;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedOrNot {
	static int[] balancedOrNot(String[] expressions,int []maxReplacements) {
		int searchIndex=0,possibleReplacement=0;
		int result[]=new int[expressions.length];
		Arrays.fill(result, 1);
		String expression;
		for( int i = 0 ; i < expressions.length ; i++ ) {
			expression=expressions[i];
			if( expression.endsWith("<")) {
				result[i]=0;
				continue;
			}
			for(int j=0;j<expression.length();j++) {
				if(expression.charAt(j) == '<' && expression.indexOf(">", searchIndex) != -1) {
						searchIndex=expression.indexOf(">", searchIndex);
					}
					else if(expression.charAt(j) == '<' && expression.indexOf(">", searchIndex) == -1) {
						result[i]=0;
					}
					else if(expression.charAt(j)=='>' && j>searchIndex) {
						possibleReplacement++;
					}
				}
			if(result[i]!=0) {
				if(maxReplacements[i]<possibleReplacement) {
					result[i]=0;
				}
			}
			}
		return result;
	}
	public static void main(String s[]) {
		int index=0;
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		String [] expressions =new String [size];
		while(index< size)
		expressions[index++]= sc.next();
		int maxReplacementSize =sc.nextInt();
		int [] maxReplacements = new int[maxReplacementSize];
		index=0;
		sc.close();
		while(index< size)
			maxReplacements[index++] = sc.nextInt();
		balancedOrNot(expressions, maxReplacements);
	}
}

package puzzles;

import java.util.Scanner;

public class ConsecutiveSum {
	static int consecutive(long num) {
		int count = 0;
		
		for( int startIndex = 1 ; startIndex <= ( num / 2 ) + 1 ; startIndex++ ) {
			long total = 0;
			for( int i = startIndex ; i <= (num / 2) + 1 ; i++ ) {
				total = total + i; 
				if(total == num) {
					count++;
				}
				else if( total > num) {
					break;
				}
			}
		}
		return count;
		
	}
	public static void main(String s[]) {
		Scanner sc = new Scanner( System.in );
		long num =Long.parseLong( sc.next() );
		sc.close();
		System.out.println( consecutive( num ) );
	}
}

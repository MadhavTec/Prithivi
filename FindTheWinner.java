package puzzles;

import java.io.IOException;
import java.util.Scanner;

public class FindTheWinner {
	
	static String winner(int[]andrea,int []maria, String s) {
		String winner = null;
		if(s.equalsIgnoreCase("odd")) {
			winner = calculator( 1 , andrea.length , andrea , maria );
		}
		else if(s.equalsIgnoreCase("even")) {
			winner=calculator( 0 , andrea.length , andrea , maria );
		}
		return winner;
	}
	static String calculator(int index , int n , int[] andrea , int[] maria) {
		 int mariaScore=0;
		 int andreaScore=0;
		for(int i = index ; i < n ; i = i + 2) {
			mariaScore += (maria[i] - andrea[i]);
			andreaScore += (andrea[i] - maria[i]);
		}
		if(mariaScore>andreaScore) {
			return "Maria";
		}
		else {
			return "Andrea";
		}
	}
		public static void main(String[] args)throws IOException {
			
			int n,i = 0,j = 0;
			String game;
			
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			int[] andrea = new int[n];
			System.out.println(n);

			while(i<n)
			andrea[i++] = sc.nextInt();
			n = sc.nextInt();
			System.out.println(n);
			int[] maria = new int[n];
			while(j<n)	
			maria[j++] = sc.nextInt();
			game = sc.next();
			System.out.println(game);
			sc.close();
			System.out.println(winner(andrea,maria,game));
		}
}

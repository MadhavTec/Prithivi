package puzzles;

import java.io.IOException;
import java.util.Scanner;

public class BuyingShowTickets {
	static long waitingTime(int[] tickets, int p) {
		int ticketsLeft=tickets[p];
		long time=0;
		if(tickets[p]==1) {
			return p+1;
		}
		else {
			while(ticketsLeft!=0) {
				for(int i =0;i<tickets.length;i++) {
					if(tickets[i]!=0 && i!=p ) {
						--tickets[i];
						++time;
					}
					else if(tickets[i]!=0 && i==p) {
						ticketsLeft = --tickets[i];
						++time;
					}
				}
			}
		}
	return time;	
	}
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		int jessePosition;
		int index=0;
		int size = sc.nextInt();
		int queue[] = new int [size];
		while(index < size)
		queue[index++] = sc.nextInt();
		jessePosition = sc.nextInt();
		sc.close();
		System.out.println(waitingTime(queue, jessePosition));
		
	}
}

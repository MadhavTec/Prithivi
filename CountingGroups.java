package puzzles;

import java.util.Arrays;

public class CountingGroups {static int[] countGroups(int [][] m,int [] t) {
	int allX[]= new int [m.length*m.length];
	int allY[] = new int [m.length*m.length];
	int q[]=new int[m.length*m.length];
	Arrays.fill(q, 0);
	int count=0;
	for(int i =0;i<m.length;i++) {
		for(int j = 0;j<m.length;j++) {
			if(m[i][j]==1) {
				allX[count]=i;
				allY[count]=j;
				count++;
			}
		}
	}
	int newAllX[]=Arrays.copyOf(allX, count);
	int newAllY[]=Arrays.copyOf(allY, count);
	for(int i=0;i<newAllX.length-1;i++) {
		for(int j=i+1;j<newAllX.length;j++) {
			int group= Math.abs(newAllX[i]-newAllX[j])+Math.abs(newAllY[i]-newAllY[j]);
			q[group]++;
		}
	}
	for(int i=0;i<t.length;i++) {
		
	}
	return q;
}}

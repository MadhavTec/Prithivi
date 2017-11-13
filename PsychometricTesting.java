package puzzles;

import java.util.Arrays;

public class PsychometricTesting {
	static int[] jobOffers(int[] scores,int[] lowerLimits,int[] upperLimits){
		int[] jobOffers= new int[lowerLimits.length];
		Arrays.fill(jobOffers, 0);
	for(int i=0;i<scores.length;i++) {
		for(int j=0;j<lowerLimits.length;j++) {
			if(lowerLimits[j] <= scores[i] && upperLimits[j]>=scores[i]) {
				jobOffers[j]++;
			}
		}
	}
		return jobOffers;	
	}
}

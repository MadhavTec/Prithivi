package puzzles;

public class LargestSubsetSum {
	static long[] maxSubsetSum(int[]k) {
		
		long subsetSum[] = new long [k.length];
		for(int i=0;i<=k.length-1;i++) {
			long sum=0;
			for(int j=1;j<=k[i]/2;j++) {
				if(k[i] % j == 0) {
					sum=sum+j;
				}
			}
			sum+=k[i];
			subsetSum[i] = sum;
		}
		return subsetSum;
		
	}
	
}

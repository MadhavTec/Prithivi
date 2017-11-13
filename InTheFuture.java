package puzzles;

public class InTheFuture {
	static int minNum(int A,int K,int P) {
		int diff;
		if(K > A)
			diff = K - A;
		else
			return -1;
		int quotient = P / diff;
		return quotient + 1;
	}
}

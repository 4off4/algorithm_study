package algorithmStudy;

/* 피보나치 수열 */
public class code05 {

	public static void main(String[] args) {
		int result = fibonacci(6);
		System.out.println(result);
	}
	
	public static int fibonacci(int n) {
		if(n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);																											
	}

}

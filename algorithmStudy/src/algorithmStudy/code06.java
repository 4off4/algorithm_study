package algorithmStudy;

/* 최대 공약수 */
public class code06 {

	public static void main(String[] args) {
		double result = gcd(3,1);
		System.out.println(result);
	}
	
	public static double gcd(int m, int n) {
		if(m<n) {
			int tmp=m; m=n; n=tmp; 
		}
		
		if(m%n==0)
			return n;
		else
			return gcd(n, m%n);
	}

}

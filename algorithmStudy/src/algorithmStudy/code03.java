package algorithmStudy;

/* 2022/12/22 Recursion(재귀함수)의 기초 1~n까지의 합 구하 */
public class code03 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	
	public static int func(int n) {
		if(n==0)
			return 0;
		else {
			System.out.println(n);
			return n + func(n-1);
		}
	}
}


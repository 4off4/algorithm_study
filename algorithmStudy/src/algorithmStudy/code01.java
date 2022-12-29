package algorithmStudy;

/* 2022/12/22 Recursion(재귀함수)의 기초 */
public class code01 {

	public static void main(String[] args) {
		func(4);
	}
	
	public static void func(int n) {
		if(n<=0)
			return;
		else {
			System.out.println("func 실행!");
			System.out.println(n);
			func(n-1);
		}
	}
	

}

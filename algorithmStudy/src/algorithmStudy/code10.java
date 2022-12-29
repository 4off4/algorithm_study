package algorithmStudy;
/*배열의 합 구하기*/
public class code10 {

	public static void main(String[] args) {
		int arr [] = new int[] {1,2,3,4};
		int r = sum(3, arr);
		System.out.println(r);
	}
	
	public static int sum(int n, int [] data) {
		// if문을 보면, 언젠가 n값이 0에 도달하기 때문에 무한루프에 빠지지 않습니다. 
		if(n<=0)
			return 0;
		else 
			System.out.println(sum(n-1, data));
			return sum(n-1, data) + data[n-1];
	}
}

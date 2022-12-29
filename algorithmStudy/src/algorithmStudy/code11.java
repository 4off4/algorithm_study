package algorithmStudy;

import java.util.Scanner;

/* 데이터파일로 부터 n개의 정수 읽어오기 */
// 사실 이런식의 코드는 쓸 일이 없다 
public class code11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {1,2,3};
		readFrom(3,arr,sc);
	}
	
	public static void readFrom(int n, int[] data, Scanner in) {
		if(n==0)
			return ;
		else {
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
		}
	}

}

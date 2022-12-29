package algorithmStudy;

/* 2022/12/26 문자열 계산하기 */
public class code07 {

	public static void main(String[] args) {
		int r = length("abcd");
		System.out.println(r);
	}
	
	public static int length(String str) {
		if(str.equals(""))
			return 0;
		else {
			System.out.println(str.substring(1));
			return 1+length(str.substring(1));
		}
			
		
	}
	
}

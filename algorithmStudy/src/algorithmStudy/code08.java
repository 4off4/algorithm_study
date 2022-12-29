package algorithmStudy;

/* 문자열 프린트 */
public class code08 {

	public static void main(String[] args) {
		printChars("abc");
	}
	
	public static void printChars(String str) {
		if(str.length()==0)
			return ;
		else {
			// charAt(0)은 첫글자를 리턴해주는 메소드
			System.out.println(str.charAt(0));
			printChars(str.substring(1));
		}
	}
}

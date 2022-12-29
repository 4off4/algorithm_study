package algorithmStudy;

/*문자열 뒤집기 리턴*/
public class code09 {

	public static void main(String[] args) {
		printCharsReverse("abcde");
	}
	
	public static void printCharsReverse(String str) {
		if(str.length()==0)
			return ;
		else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
}

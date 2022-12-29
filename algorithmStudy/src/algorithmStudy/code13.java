package algorithmStudy;
/* 매개변수의 명시화: 최대값 찾기 */
public class code13 {

	public static void main(String[] args) {
		int [] data = new int[] {3, 2, 5, 8, 10, 13, 22};
		int r ;
		
		r = findMax(data, 0, 5); //10
		System.out.println(r);
	}
	
	public static int findMax(int [] data, int begin, int end) {
		if(begin>end)
			return -1;
		else if(begin==end)
			return data[begin-1];
		else
			// begin 값과 비교하여 최대값이면 return 
			return Math.max(data[begin], findMax(data, begin+1, end));
	}

}

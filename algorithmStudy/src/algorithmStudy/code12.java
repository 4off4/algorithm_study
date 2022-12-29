package algorithmStudy;

/* 기본 순차 탐색, 매개변수의 명시화 순차탐색 */
public class code12 {

	public static void main(String[] args) {
		int [] data = new int [] {2,6,3,9,5,100};
		int r;
		
		// 함수 호출 
		//r = search(data, data.length, 100);
		//System.out.println(r); 	// 해당하는 자리를 리턴 
		
		// 매개변수 명시화 함수 호출 
		//r = searchA(data, 0, 3, 100);
		//System.out.println(r); 		// -1 리턴 
		
		// 매개변수 명시화 middle 추가 함수 호출
		r = searchC(data, 0, 4, 100);
		System.out.println(r);
	}
	
	/* 기본 순차 탐색 */
	// data는 배열, n은 배열의 크기, target은 탐색하는 정수
	public static int search(int [] data, int n, int target) {
		for(int i = 0; i < n; i++) {
			if(data[i]==target) 
				return i;
		}
		return -1;
	}
	
	/* 매개변수 명시화 순차탐색 */
	public static int searchA(int [] data, int begin, int end, int target) {
		if(begin > end)
			return -1;
		else if(target == data[begin])
			return begin;
		else
			// 해당하지 않으면 begin의 다음으로 넘어간다. 
			return searchA(data, begin+1, end, target);
	}
	/* 매개변수 명시화 순차탐색 : 그외 middle 추가 */
	public static int searchC(int [] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		}else {
			int middle = (begin+end)/2; // 시작과 끝의 중간을 대략 2로 나눠서 명시
			if(data[middle]==target)
				return middle;
			
			int index = searchC(data, begin, middle-1,target);
			if(index != -1) 
				return index;
			else
				return searchC(data, middle+1, end, target);
		}
	}
}

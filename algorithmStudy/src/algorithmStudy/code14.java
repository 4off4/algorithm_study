package algorithmStudy;
/* 이진검색(Binary Search) */
// 이진검색은 배열이 순차적으로 정렬 후 저장되어 있을 시, 적용이 가능한 탐색 방법이다.
public class code14 {

	public static void main(String[] args) {
		String [] items = new String[] {"ㄱ","ㄴ","ㄷ","ㄹ","ㅇ"};
		int r = binarySearch(items, "ㄹ", 0, items.length);
		System.out.println(r);
	}

	public static int binarySearch(String[] items, String target, int begin, int end) {
		if(begin>end)
			return -1;
		else {
			int middle = (begin+end)/2;
			// compareTo 메서드는 string 두개를 비교할 때 사용 
			// target이 items보다 작을 때는 -1, 같으면 0, 크면 1을 리턴 
			int compResult = target.compareTo(items[middle]);
			
			if(compResult==0)
				return middle;
			else if(compResult<0)
				return binarySearch(items, target, begin, middle-1);
			else
				return binarySearch(items, target, middle+1, end);
		}
	}
}

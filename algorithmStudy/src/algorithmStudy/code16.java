package algorithmStudy;
//2023/01/15 
/* 2-2강, Recursion의 응용 :Count Cells in a Blob 
 픽셀을 만들고 서로 연결된 img pixel들의 집합을 blob이라고 부름 
 상하좌우 및 대각방향으로도 연결된 것으로 간주 
*/
public class code16 {

	public static void main(String[] args) {
		printGrid();
	    int count = countCells(0, 0);
	    System.out.println("count : " + count);
	}
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;	
	
	private static int N = 8;
	private static int [][] grid = {
			{1,0,0,0,0,0,0,1},
			{0,1,1,0,0,1,0,0},
			{1,1,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{1,0,0,0,1,0,0,1},
			{0,1,1,0,0,1,1,1}
	};
	
	public static int countCells(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= N) // 유효범위에 해당하지 않는 경우 
			return 0;						// 여기로 오게되면 x,y를 다시 호출이라 초기화!
		else if(grid[x][y] != IMAGE_COLOR)
			return 0;						// 여기로 오게되면 x,y를 다시 호출이라 초기화!
		else {
			grid[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x-1, y+1) + countCells(x, y+1)
				+ countCells(x+1, y+1) + countCells(x-1, y)
				+ countCells(x+1 ,y) + countCells(x-1, y-1)
				+ countCells(x, y-1) + countCells(x+1, y-1);
		}
	}
	
  private static void printGrid() {
    for (int x = 0; x < N; x++) {
      System.out.print("[");
      for (int y = 0; y < N; y++) {
    	  if(y == N-1) {
    		  System.out.print(grid[x][y]);  
    	  }else {
    		  System.out.print(grid[x][y] + ", "); 
    	  }
      }
      System.out.println("]");
    }
  }

}

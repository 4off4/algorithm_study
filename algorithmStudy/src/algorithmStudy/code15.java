package algorithmStudy;
// 2023/01/15 
/* 2-1강, Recursion의 응용 : 미로찾기 

 현재 위치에서 출구까지 가는 경로가 있으려면 
 1)현재 위치가 출구이거나 혹은 
 2)이웃한 셀들 중 하나에서 현재 위치를 지나지 않고 출구까지 가는 경로가 있거나
 참고 블로그 : https://jihyehwang09.github.io/2019/01/20/recursion-maze/
-> 해당 미로찾기는 매우 어려웠다; 아직도 이해가 잘 안된다 
 */
public class code15 {
	
	// 답이 yes or no VER. 
	public static void main(String[] args) {
		//printMaze();
		//findMazePath(0,1);
		//printMaze();
		boolean r = findMazePath(0,0);
		System.out.println(r);
	}
	
	private static int N=8;
	private static int [][] maze = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
	};
	
	private static final int PATHWAY_COLOUR = 0;	// white
	private static final int WALL_COLOUR = 1;		// blue
	private static final int BLOCKED_COLOUR = 2;	// red 
	private static final int PATH_COLOUR = 3;		// green
	
	/* PATH_COLOUR : visited이며 아직 출구로 가는 경로가 될 가능성이 있는 cell 
	   BLOCKED_COLOUR : visited이며 출구까지의 경로상에 있지 않음이 밝혀진 cell */
	
	public static boolean findMazePath(int x, int y) {
		if(x<0 || y<0 || x>=N || y>=N)			// 유효한 범위인지 확인
			return false;
		else if(maze[x][y] != PATHWAY_COLOUR) {
			printMaze();
			return false;
		}
		else if(x==N-1 && y==N-1) {
			maze[x][y] = PATH_COLOUR;
			printMaze();
			return true;
		}else {
			maze[x][y] = PATH_COLOUR;
			printMaze();
			if(findMazePath(x-1,y) || findMazePath(x,y+1) 
					|| findMazePath(x+1,y) || findMazePath(x,y-1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOUR;	// dead end
			return false;
		}
	}
	
	public static void printMaze() {
		// 2차원 배열 출력 메서드
		for(int i=0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				System.out.println(maze[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}

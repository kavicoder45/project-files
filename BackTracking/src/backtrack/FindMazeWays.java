package backtrack;
import java.util.*;

public class FindMazeWays {
	public static void main(String[] args) {
//	  System.out.println(addDiagonalPaths("",3,3));
		boolean maze[][] = {
		{true,true,true},
		{true,true,true},
		{true,true,true}
	};
	  allPaths("",0,0,maze);
	}
	static int howManyWays(int row,int col) {
		if(row == 1 || col == 1) {
			return 1;
		}
		int left = howManyWays(row-1,col);
		int right = howManyWays(row,col-1);
		
		return left + right;
	}
	static void findingPaths(String p,int row ,int col) {
		if(row==1 && col == 1) {
			System.out.println(p);
			return;
		}
		
		if(row > 1) {
			findingPaths(p+'D',row-1,col);
		}
		if(col > 1) {
			findingPaths(p+'R',row,col-1);
		}
	}
	
	static List<String> ListfindingPaths(String p,int row ,int col) {
		if(row==1 && col==1) {
			List<String> result = new ArrayList<>();
			result.add(p);
			return result;
		}
		List<String> list = new ArrayList<>();
		
		if(row > 1) {
			list.addAll(ListfindingPaths(p+'D',row-1,col));
		}
		if(col > 1) {
			list.addAll(ListfindingPaths(p+'R',row,col-1));
		}
		return list;
	}
//	lets add the diagonals : 
	static List<String> addDiagonalPaths(String p,int row ,int col) {
		if(row==1 && col==1) {
			List<String> result = new ArrayList<>();
			result.add(p);
			return result;
		}
		List<String> list = new ArrayList<>();
		if(row > 1 && col > 1) {
			list.addAll(addDiagonalPaths(p+'D',row-1,col-1));
		}
		if(row > 1) {
			list.addAll(addDiagonalPaths(p+'V',row-1,col));
		}
		if(col > 1) {
			list.addAll(addDiagonalPaths(p+'H',row,col-1));
		}
		return list;
	}
	static void mazeWithObstacles(String paths,int r,int c,boolean[][] maze)
	{
		if(r==maze.length-1 && c == maze[0].length-1) {
			System.out.println(paths);
			return;
		}
		
		if(!maze[r][c])
			return;
		
		if(r < maze.length-1) {
			mazeWithObstacles(paths+'D',r+1,c,maze);
		}
		
		if(c < maze[0].length-1)
		{
			mazeWithObstacles(paths+'R',r,c+1,maze);
		}
	}
	static void allPaths(String paths,int r,int c,boolean[][] maze)
	{
		if(r==maze.length-1 && c == maze[0].length-1) {
			System.out.println(paths);
			return;
		}
		
		if(!maze[r][c])
			return;
		
		maze[r][c] = false;
		
		if(r < maze.length-1) {
			allPaths(paths+'D',r+1,c,maze);
		}
		
		if(c < maze[0].length-1)
		{
			allPaths(paths+'R',r,c+1,maze);
		}
		if(r > 0) {
			allPaths(paths+'U',r-1,c,maze);
		}
		if(c > 0) {
			allPaths(paths+'L',r,c -1,maze);
		}
		
		maze[r][c] = true;
	}
//	
}

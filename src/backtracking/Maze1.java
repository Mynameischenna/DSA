package backtracking;

public class Maze1 {
    public static void main(String[] args) {
        int[][] maze = {{0,1,1},{0,0,0},{0,0,0}};
        helperAll(maze,0,0,"");
    }
    // option is either right or down
    static void helper(int[][] maze,int row,int col,String path){
        if(row == maze.length-1 && col == maze.length-1){
            System.out.println(path);
            return;
        }
        // right
        if(col < maze.length-1 && maze[row][col+1] == 0){
            maze[row][col] = 1;
            helper(maze,row,col+1,path+'R');
            maze[row][col] = 0;
        }
        // down
        if(row < maze.length -1 && maze[row+1][col] ==0){
            maze[row][col] = 1;
            helper(maze,row+1,col,path+'D');
            maze[row][col] = 0;
        }
    }
    static void helperAll(int[][] maze,int row,int col,String path){
        if(row == maze.length-1 && col == maze.length-1){
            System.out.println(path);
            return;
        }
        // right
        if(col < maze.length-1 && maze[row][col+1] == 0){
            maze[row][col] = 1;
            helperAll(maze,row,col+1,path+'R');
            maze[row][col] = 0;
        }
        // down
        if(row < maze.length -1 && maze[row+1][col] ==0){
            maze[row][col] = 1;
            helperAll(maze,row+1,col,path+'D');
            maze[row][col] = 0;
        }
        // left
        if(col > 0 && maze[row][col-1] ==0){
            maze[row][col] = 1;
            helperAll(maze,row,col-1,path+'L');
            maze[row][col] = 0;
        }
        // up
        if(row > 0 && maze[row-1][col] ==0){
            maze[row][col] = 1;
            helperAll(maze,row-1,col,path+'U');
            maze[row][col] = 0;
        }
    }
}

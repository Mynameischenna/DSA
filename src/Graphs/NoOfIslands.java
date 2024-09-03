package Graphs;

import java.util.Stack;

public class NoOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '0'}};
        System.out.println("no of islands "+numIslands(grid));
    }

    static boolean[][] visited;
    public static  int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        visited = new boolean[n][m];
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    // System.out.println(i +" "+j);
                    dfsRecursion(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfsRecursion(char[][] grid,int i,int j){

        if(i <0 || i>=grid.length || j< 0 || j>=grid[0].length || visited[i][j] || grid[i][j] == '0'){
            return;
        }
        visited[i][j] = true;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        for(int[] neighbor: directions){
            int nx = i + neighbor[0];
            int ny = j + neighbor[1];
            dfsRecursion(grid,nx,ny);
        }
    }
    public static void dfs(char[][] grid, int i, int j){
        Stack<int[]> stack = new Stack(); // to store elements

        stack.push(new int[]{i,j});
        visited[i][j] = true;
        int[][] directions = {{1,0},{-1,0}, {0,1}, {0,-1}};
        while(!stack.isEmpty()){

            int curr[] = stack.pop();
            int cx = curr[0];
            int cy = curr[1];
            // explore
            for(int[] neighbor : directions){
                int x = cx + neighbor[0];
                int y = cy + neighbor[1];

                if(x >= 0 && x < grid.length && y >=0 && y< grid[0].length && !visited[x][y] && grid[x][y] == '1'){// land and not visited
                    stack.push(new int[]{x,y});
                    visited[x][y] = true;
                }
            }

        }

    }
}

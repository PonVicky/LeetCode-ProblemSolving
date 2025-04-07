class Node{
    int row;
    int col;
    int distance;
    Node(int row, int col, int distance){
        this.row = row;
        this.col = col;
        this.distance = distance;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
            int n = grid.length;
            if(grid[0][0] != 0 || grid[n-1][n-1] != 0) return -1;

            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(0,0,1));

            int[][] directions = {{1,0},{0,1},{-1,0},{0,-1},
            {1,1},{1,-1},{-1,1},{-1,-1}};
            boolean[][] visited = new boolean[n][n];

            while(!queue.isEmpty()){
                Node node = queue.poll();
                if(node.row == n-1 && node.col== n-1){
                    return node.distance;
                }
                for(int[] dir : directions){
                    int row = dir[0] + node.row;
                    int col = dir[1] + node.col;

                    if(row >=0 && row < n && col >=0 && col < n &&
                    grid[row][col]==0 && !visited[row][col]){
                        visited[row][col] = true;
                        queue.add(new Node(row,col,node.distance+1));
                    }
                }
            }

            return -1;
    }
}
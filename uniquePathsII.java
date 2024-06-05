public class uniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] memo = new int[m][n];

        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (i == m-1 && j == n-1) memo[i][j] = 1;
                else {
                    int downx = i+1, downy = j;
                    if (downx >= 0 && downx < m && obstacleGrid[downx][downy] == 0) {
                        memo[i][j] += memo[downx][downy];
                    }
                    int rightx = i, righty = j+1;
                    if (righty >= 0 && righty < n && obstacleGrid[rightx][righty] == 0) {
                        memo[i][j] += memo[rightx][righty];
                    }
                }
            }
        }
        return memo[0][0];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(new uniquePathsII().uniquePathsWithObstacles(obstacleGrid));
    }
}

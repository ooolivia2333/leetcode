public class GameOfLife {
    // 289. Game of Life
    int[][] directions = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1},
    {1, -1}, {1, 0}, {1, 1}};
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbor = 0;
                for (int[] dir: directions) {
                    int newi = i+dir[0], newj = j+dir[1];
                    if (newi >= 0 && newi < m && newj >= 0 && newj < n && Math.abs(board[newi][newj]) == 1) {
                        liveNeighbor++;
                    }
                }
                if (board[i][j] == 1) {
                    if (liveNeighbor < 2 || liveNeighbor > 3) board[i][j] = -1;
                } else {
                    if (liveNeighbor == 3) board[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) board[i][j] = 0;
                else if (board[i][j] == 2) board[i][j] = 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(board[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.gameOfLife(board);
    }
}

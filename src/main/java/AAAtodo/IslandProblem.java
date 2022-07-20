package AAAtodo;

public class IslandProblem {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}};
        int i = numOfIslands(grid);
        System.out.println(i);
    }

    public static int numOfIslands(char[][] grid) {
        int rows = grid.length;
        int column = grid[0].length;
        System.out.println(rows);
        System.out.println("columns " + column);
        int no_of_islands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    markCurrentIsland(grid, i, j, rows, column);
                    no_of_islands += 1;
                }
            }
        }
        return no_of_islands;
    }

    public static void markCurrentIsland(char[][] grid, int i, int j, int row, int col) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != '1') return;
        grid[i][j] = 'o';
        markCurrentIsland(grid, i + 1, j, row, col);
        markCurrentIsland(grid, i, j + 1, row, col);
        markCurrentIsland(grid, i, j - 1, row, col);
        markCurrentIsland(grid, i - 1, j, row, col);
    }
}

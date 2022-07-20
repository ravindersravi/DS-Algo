package AAAtodo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        N_Queens n_queens = new N_Queens();
        List<List<String>> lists = n_queens.solveQueens(4);
        lists.stream().forEach(a -> a.stream().forEach(System.out::println));
    }

    public List<List<String>> solveQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }

    public void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if (colIndex == board.length) {
            System.out.println("-----");
            res.add(construct(board));
        }
        for (int i = 0; i < board.length; i++) {
            if (validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                System.out.println(board[i][colIndex]);
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';
            }
        }
    }

    private boolean validate(char[][] board, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < y; j++) {
                if (board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i))
                    return false;
            }
        }
        return true;
    }


    public List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}

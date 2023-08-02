import java.util.*;

class Pair {
    int r;
    int c;
    int step;

    Pair(int r, int c, int step) {
        this.r = r;
        this.c = c;
        this.step = step;
    }
}

public class ShortestDistance {
    public static void main(String[] args) {
        int A[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 1 } };
        int N = A.length;
        int M = A[0].length;
        int X = 2;
        int Y = 3;
        ShortestDistance ob = new ShortestDistance();
        int ans = ob.shortestDistance(N, M, A, X, Y);
        System.out.println(ans);
    }

    int shortestDistance(int N, int M, int A[][], int X, int Y) {

        // bfs approach to solve a problem

        if (A[0][0] == 0)
            return -1;
        if (X == 0 && Y == 0 && A[X][Y] == 1)
            return 0;
        int[][] vis = new int[N][M];
        int step = -1;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0, 0));
        vis[0][0] = 1;
        int[] delrow = { -1, 0, 1, 0 };
        int[] delcol = { 0, 1, 0, -1 };
        int n = A.length, m = A[0].length;
        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            if (pair.r == X && pair.c == Y) {
                step = pair.step;
                return step;
            }
            for (int i = 0; i < 4; i++) {
                int nrow = delrow[i] + pair.r;
                int ncol = delcol[i] + pair.c;
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && A[nrow][ncol] == 1 && vis[nrow][ncol] == 0) {
                    queue.add(new Pair(nrow, ncol, pair.step + 1));
                    vis[nrow][ncol] = 1;
                }
            }
        }

        return step;

    }
}
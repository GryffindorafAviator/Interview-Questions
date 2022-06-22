// Alice Board | ONLINE ASSESMENT | SDE1

// QUESTION:
// Alice is playing a board game. 
// In this game, 
// Alice has been given an array A of size N, 
// containing integer coordinate points (xi and yi) and in order to win this game, 
// Alice has to cover all the given points on the board. 
// In one step,
// Alice can move his player either up, 
// down, 
// right, 
// or left by any distance 
// (i.e if there are points on (1, 1) and (1, 4), 
// Alice can move her player from (1, 1) to (1, 4) in one step).
// Alice noticed that using this way it is impossible for her to cover all the points, 
// therefore he decided to add some extra points on the board.

// Help Alice cover all points given by adding a minimum number of extra points.

// Example:
// Given,
// N = 2
// A = [[1, 2], [2, 1]]
  
// Approach
// As Alice can not move from points (1, 2) to (2, 1) according to the given constraints.
// Alice can add a point (1, 1)
// So now, Alice will move from (1, 2) -> (1, 1) -> (2, 1) covering all the given points.
// Thus the answer is 1.

// Example:
// Given,
// N = 2
// A = [[2, 1], [4, 1]]
  
// Approach
// Alice can easily move from (2, 1 -> 4, 1)just by moving right, 
// without adding any extra point.
// Thus, 
// the answer is 0.
  
// Solution
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class alice {
    static class UF {
        int[] root;
        int size;

        public UF(int n) {
            root = new int[n];
            size = 0;

            for (int i = 0; i < n; i++) {
                root[i] = i;
            }
        }

        public int find(int i) {
            while (i != root[i]) {
                i = root[i];
            }

            return i;
        }

        public void union(int i, int j) {
            if (find(i) == find(j)) {
                return;
            }

            root[find(i)] = find(j);

            return;
        }

        public int findSize() {
            Set<Integer> set = new HashSet<>();

            for (int num : root) {
                set.add(find(num));
            }

            return set.size();
        }
    }
  
    public static int alice(int n, int[][] A) {
        UF uf = new UF(n);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][0] == A[j][0]) {
                    uf.union(i, j);
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][1] == A[j][1]) {
                    uf.union(i, j);
                }
            }
        }

        int ans = uf.findSize() - 1;

        return ans;
    }
   
    public static void main(String args[]) {
        System.out.println(alice(2, new int[][]{{1,2},{2,1}}));
        System.out.println(alice(2, new int[][]{{2,1},{4,1}}));
        System.out.println(alice(4, new int[][]{{0,2},{1,4},{0,0},{3,1}}));
    }
}
// TC: O(n^2); SC: O(n)

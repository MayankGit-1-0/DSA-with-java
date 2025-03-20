import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {
    static class Pair {
        int i, j, level;
        Pair(int i, int j, int level) {
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int ans=orangesRotting(grid);
        System.out.println(ans);
        sc.close();
    }

    public static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int freshCount = 0;

        // Add all rotten oranges to the queue and count the fresh ones
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));  // Add rotten oranges to the queue with level 0
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        if (freshCount == 0) return 0; // No fresh oranges to rot, return 0

        int minTime = 0;
        // Directions array for traversing up, down, left, right
        int[] dirX = { -1, 1, 0, 0 };
        int[] dirY = { 0, 0, -1, 1 };

        // Perform BFS
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            for (int d = 0; d < 4; d++) {
                int newX = curr.i + dirX[d];
                int newY = curr.j + dirY[d];

                // Check if the new position is within bounds and if it's a fresh orange
                if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == 1) {
                    grid[newX][newY] = 2; // Rot the fresh orange
                    freshCount--; // Decrease the count of fresh oranges
                    q.add(new Pair(newX, newY, curr.level + 1)); // Add the new rotten orange to the queue
                    minTime = curr.level + 1; // Track the time it takes for the last orange to rot
                }
            }
        }

        // If there are still fresh oranges left, return -1
        if (freshCount > 0) {
            return -1;
        }

        return minTime;
    }
}

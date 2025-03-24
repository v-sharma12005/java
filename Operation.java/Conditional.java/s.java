import java.util.*;

public class s {
    // Directions for moving the sofa (Right, Down, Left, Up)
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    // Check if a position is valid within the grid
    private static boolean isValid(int x, int y, int M, int N) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }

    // BFS to find the minimum steps
    private static String bfs(int M, int N, char[][] grid, int[] start1, int[] start2, List<int[]> end) {
        Set<String> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        
        // Initialize the BFS with the starting position and step count
        queue.offer(new int[]{start1[0], start1[1], start2[0], start2[1], 0});
        visited.add(start1[0] + "," + start1[1] + "," + start2[0] + "," + start2[1]);

        while (!queue.isEmpty()) {
            int[] state = queue.poll();
            int x1 = state[0], y1 = state[1], x2 = state[2], y2 = state[3], steps = state[4];

            // Check if both parts of the sofa are at the destination
            if ((x1 == end.get(0)[0] && y1 == end.get(0)[1] && x2 == end.get(1)[0] && y2 == end.get(1)[1]) ||
                (x1 == end.get(1)[0] && y1 == end.get(1)[1] && x2 == end.get(0)[0] && y2 == end.get(0)[1])) {
                return String.valueOf(steps);
            }

            // Move the sofa in all four directions
            for (int[] dir : DIRECTIONS) {
                int nx1 = x1 + dir[0], ny1 = y1 + dir[1];
                int nx2 = x2 + dir[0], ny2 = y2 + dir[1];
                if (isValid(nx1, ny1, M, N) && isValid(nx2, ny2, M, N) &&
                    grid[nx1][ny1] != 'H' && grid[nx2][ny2] != 'H') {
                    String nextState = nx1 + "," + ny1 + "," + nx2 + "," + ny2;
                    if (!visited.contains(nextState)) {
                        visited.add(nextState);
                        queue.offer(new int[]{nx1, ny1, nx2, ny2, steps + 1});
                    }
                }
            }

            // Rotate the sofa
            if (x1 == x2) { // Horizontal sofa
                if (isValid(x1 - 1, y1, M, N) && isValid(x2 - 1, y2, M, N) &&
                    grid[x1 - 1][y1] != 'H' && grid[x2 - 1][y2] != 'H') {
                    String nextState = (x1 - 1) + "," + y1 + "," + (x1) + "," + y1;
                    if (!visited.contains(nextState)) {
                        visited.add(nextState);
                        queue.offer(new int[]{x1 - 1, y1, x1, y1, steps + 1});
                    }
                }
            } else if (y1 == y2) { // Vertical sofa
                if (isValid(x1, y1 - 1, M, N) && isValid(x2, y2 - 1, M, N) &&
                    grid[x1][y1 - 1] != 'H' && grid[x2][y2 - 1] != 'H') {
                    String nextState = x1 + "," + (y1 - 1) + "," + x1 + "," + y1;
                    if (!visited.contains(nextState)) {
                        visited.add(nextState);
                        queue.offer(new int[]{x1, y1 - 1, x1, y1, steps + 1});
                    }
                }
            }
        }

        return "Impossible";
    }

    public static String solveSofaProblem(int M, int N, char[][] grid) {
        int[] start1 = null, start2 = null;
        List<int[]> end = new ArrayList<>();

        // Locate starting and ending positions of the sofa
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 's') {
                    if (start1 == null) {
                        start1 = new int[]{i, j};
                    } else {
                        start2 = new int[]{i, j};
                    }
                } else if (grid[i][j] == 'S') {
                    end.add(new int[]{i, j});
                }
            }
        }

        // If either start or end is incomplete
        if (start1 == null || start2 == null || end.size() != 2) {
            return "Impossible";
        }

        // Call BFS to find the minimum steps
        return bfs(M, N, grid, start1, start2, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        char[][] grid = new char[M][N];
        for (int i = 0; i < M; i++) {
            grid[i] = scanner.nextLine().replace(" ", "").toCharArray();
        }

        System.out.println(solveSofaProblem(M, N, grid));
        scanner.close();
    }
}
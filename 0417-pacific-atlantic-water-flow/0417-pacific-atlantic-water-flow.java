class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0) return result;

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // DFS from Pacific border (top row and left column)
        for (int i = 0; i < rows; i++) {
            dfs(heights, pacific, i, 0, heights[i][0]);
            dfs(heights, atlantic, i, cols - 1, heights[i][cols - 1]);
        }

        for (int j = 0; j < cols; j++) {
            dfs(heights, pacific, 0, j, heights[0][j]);
            dfs(heights, atlantic, rows - 1, j, heights[rows - 1][j]);
        }

        // Collect cells visited in both pacific and atlantic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    // DFS method
    private void dfs(int[][] heights, boolean[][] visited, int row, int col, int prevHeight) {
        int rows = heights.length;
        int cols = heights[0].length;

        // Boundary and increasing check
        if (row < 0 || col < 0 || row >= rows || col >= cols ||
            visited[row][col] || heights[row][col] < prevHeight) {
            return;
        }

        visited[row][col] = true;

        dfs(heights, visited, row + 1, col, heights[row][col]);
        dfs(heights, visited, row - 1, col, heights[row][col]);
        dfs(heights, visited, row, col + 1, heights[row][col]);
        dfs(heights, visited, row, col - 1, heights[row][col]);
    }
}

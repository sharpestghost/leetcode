class Solution {
    int currentMapper;
    int result = 0;
    public int numIslands(char[][] grid) {
        int[][] islandMapper = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                mapperCheck(islandMapper, grid, i, j);
            }
        }
        return result;
    }

    private void mapperCheck(int[][] islandMapper, char[][] grid, int i, int j) {
        if (grid[i][j] == '1' && islandMapper[i][j] == 0) {
            int width = islandMapper[0].length;
            currentMapper = islandMapper[i][j] = i * width + j + 1;
            if (i < grid.length - 1 && grid[i + 1][j] == '1' && islandMapper[i + 1][j] == 0) {
                checkNeighbours(islandMapper, grid, i + 1, j);
            }
            if (j < grid[0].length - 1 && grid[i][j + 1] == '1' && islandMapper[i][j + 1] == 0) {
                checkNeighbours(islandMapper, grid, i, j + 1);
            }
            result++;
        }
    }

    private void checkNeighbours(int[][] islandMapper, char[][] grid, int i, int j) {
        islandMapper[i][j] = currentMapper;
        if (i > 0 && grid[i - 1][j] == '1' && islandMapper[i - 1][j] == 0) {
            checkNeighbours(islandMapper, grid, i - 1, j);
        }
        if (j > 0 && grid[i][j - 1] == '1' && islandMapper[i][j - 1] == 0) {
            checkNeighbours(islandMapper, grid, i, j - 1);
        }
        if (i < grid.length - 1 && grid[i + 1][j] == '1' && islandMapper[i + 1][j] == 0) {
            checkNeighbours(islandMapper, grid, i + 1, j);
        }
        if (j < grid[0].length - 1 && grid[i][j + 1] == '1' && islandMapper[i][j + 1] == 0) {
            checkNeighbours(islandMapper, grid, i, j + 1);
        }
    }
}

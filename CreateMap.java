public class CreateMap {
    private int M = 11;
    private int N = 9;

    public int getM() {
        return M;
    }

    public int getN() {
        return N;
    }

    public int[][] wallsInMap() {
        int[][] map = new int[M][N];
        map[1][1] = -1;
        map[1][2] = -1;
        map[1][3] = -1;
        map[2][4] = -1;
        map[3][3] = -1;
        map[3][4] = -1;
        map[3][5] = -1;
        map[4][3] = -1;
        map[5][3] = -1;
        map[6][3] = -1;
        map[7][3] = -1;
        map[7][1] = -1;
        map[7][2] = -1;
        map[4][6] = -1;
        map[5][6] = -1;
        map[6][6] = -1;
        map[7][6] = -1;
        map[7][7] = -1;
        return map;
    }

    public void printMap(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                System.out.printf("%3d", map[i][j]);
            }
            System.out.println();
        }
    }
}

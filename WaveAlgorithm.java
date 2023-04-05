import java.util.LinkedList;
import java.util.Queue;

public class WaveAlgorithm extends CreateMap{
    int[][] map;

    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public int[][] wave(Point startPoint) {
        Queue<Point> queue = new LinkedList<>();
        map[startPoint.getX()][startPoint.getY()] = 1;
        queue.add(startPoint);
        while(!queue.isEmpty()) {
            Point cur = queue.remove();
            if(cur.getX() > 0 && map[cur.getX() - 1][cur.getY()] == 0) {
                queue.add(new Point(cur.getX() - 1, cur.getY()));
                map[cur.getX() - 1][cur.getY()] = map[cur.getX()][cur.getY()] + 1;
            }
            if(cur.getY() < 8 && map[cur.getX()][cur.getY() + 1] == 0) {
                queue.add(new Point(cur.getX(), cur.getY() + 1));
                map[cur.getX()][cur.getY() + 1] = map[cur.getX()][cur.getY()] + 1;
            }
            if(cur.getX() < 10 && map[cur.getX() + 1][cur.getY()] == 0) {
                queue.add(new Point(cur.getX() + 1, cur.getY()));
                map[cur.getX() + 1][cur.getY()] = map[cur.getX()][cur.getY()] + 1;
            }
            if(cur.getY() > 0 && map[cur.getX()][cur.getY() - 1] == 0) {
                queue.add(new Point(cur.getX(), cur.getY() - 1));
                map[cur.getX()][cur.getY() - 1] = map[cur.getX()][cur.getY()] + 1;
            }
        }
        return map;
    }
}

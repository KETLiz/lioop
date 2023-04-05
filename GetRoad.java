import java.util.ArrayList;

public class GetRoad {
    int[][] map;

    public GetRoad(int[][] map) {
        this.map = map;
    }
    public ArrayList<Point> way(Point exitPoint, Point starPoint) {
        ArrayList<Point> road = new ArrayList<>();
        road.add(exitPoint);
        while(exitPoint != starPoint) {
            if(exitPoint.getX() > 0 && map[exitPoint.getX() - 1][exitPoint.getY()] == map[exitPoint.getX()][exitPoint.getY()] - 1) {
                road.add(new Point(exitPoint.getX() - 1, exitPoint.getY()));
                exitPoint = new Point(exitPoint.getX() - 1, exitPoint.getY());
            } else if(exitPoint.getY() < 8 && map[exitPoint.getX()][exitPoint.getY() + 1] == map[exitPoint.getX()][exitPoint.getY()] - 1) {
                road.add(new Point(exitPoint.getX(), exitPoint.getY() + 1));
                exitPoint = new Point(exitPoint.getX(), exitPoint.getY() + 1);
            } else if(exitPoint.getX() < 10 && map[exitPoint.getX() + 1][exitPoint.getY()] == map[exitPoint.getX()][exitPoint.getY()] - 1) {
                road.add(new Point(exitPoint.getX() + 1, exitPoint.getY()));
                exitPoint = new Point(exitPoint.getX() + 1, exitPoint.getY());
            } else if(exitPoint.getY() > 0 && map[exitPoint.getX()][exitPoint.getY() - 1] == map[exitPoint.getX()][exitPoint.getY()] - 1) {
                road.add(new Point(exitPoint.getX(), exitPoint.getY() - 1));
                exitPoint = new Point(exitPoint.getX(), exitPoint.getY() - 1);
            } else {
                System.out.println("какая-то хрень");
            }
        }
        return road;
    }
}

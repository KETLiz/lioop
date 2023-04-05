public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[x: " + x + "; y: " + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        return this.x == p.x && this.y == p.y;
    }
}
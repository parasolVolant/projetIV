public class Point2D {

    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(Point2D point) {
        this.x+= point.x;
        this.y+= point.y;
    }

    public Point2D getAdded(Point2D point) {
        return new Point2D(x+=point.x, y+=point.y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

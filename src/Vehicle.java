public class Vehicle {

    private Vector2D direction;
    private int ID;
    private int vSize;
    private Point2D head;

    public Vehicle(int ID,Point2D head, Vector2D direction, int vSize) {
        this.ID = ID;
        this.direction = direction;
        this.head = head;
        this.vSize = vSize;
    }

    public void move(int distance) {
        head.setX(direction.getMultiplied(distance).getX());
        head.setY(direction.getMultiplied(distance).getY());
    }

    public boolean isCar() {
        if (vSize == 2) return true;
        return false;
    }

    public boolean isRed() {
        if (this.ID == 0) return true;
        return false;
    }

    public int getID() {
        return ID;
    }

    public Vector2D getDirection() {
        return direction;
    }

    public Point2D getHead() {
        return head;
    }

    public int getvSize() {
        return vSize;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < vSize; i++) {
            result+=""+this.ID;
        }
        return result;
    }
}

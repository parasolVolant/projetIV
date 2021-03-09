
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        int ID = 0;
        Vehicle hello = new Vehicle(0,new Point2D(0,1), new Vector2D(0,1), 3);
        //System.out.print(hello.toString());
        Vector2D bye = new Vector2D(1, 0);
        System.out.println(bye);
        bye = bye.getMultiplied(3);
        System.out.println(bye);
    }

}

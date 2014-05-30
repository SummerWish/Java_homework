public class TestShape {
    public static void main(String args[]) {
        Rectangle[] rectangles = {
            new Rectangle(0, 0, 10, 20),
            new Rectangle(-1, -1, 100, 200)
        };

        Circle[] circles = {
            new Circle(100, 100, 200),
            new Circle(0, 0, 20)
        };

        rectangles[0].display();
        rectangles[1].display();

        circles[0].display();
        circles[1].display();
    }
}
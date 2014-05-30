public class Rectangle {
    private double _x0, _y0, _w, _h;

    public Rectangle(double x0, double y0, double width, double height) {
        _x0 = x0;
        _y0 = y0;
        _w = width;
        _h = height;
    }

    public double getX0() {
        System.out.println("getX0()");
        return _x0;
    }

    public double getY0() {
        System.out.println("getY0()");
        return _y0;
    }

    public double getWidth() {
        System.out.println("getWidth()");
        return _w;
    }

    public double getHeight() {
        System.out.println("getHeight()");
        return _h;
    }

    public double findArea() {
        System.out.println("findArea()");
        return _w * _h;
    }

    public double findPerimeter() {
        System.out.println("findPerimeter()");
        return 2 * (_w + _h);
    }

    public void display() {
        System.out.println("[Rectangle: x0 = " + _x0 + ", y0 = " + _y0 + ", width = " + _w + ", height = " + _h + "]");
    }
}
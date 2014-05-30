public class Circle {
    private double _x0, _y0, _r;

    public Circle(double x0, double y0, double radius) {
        _x0 = x0;
        _y0 = y0;
        _r = radius;
    }

    public double getX0() {
        System.out.println("getX0()");
        return _x0;
    }

    public double getY0() {
        System.out.println("getY0()");
        return _y0;
    }

    public double getRadius() {
        System.out.println("getRadius()");
        return _r;
    }

    public double findArea() {
        System.out.println("findArea()");
        return Math.PI * _r * _r;
    }

    public double findPerimeter() {
        System.out.println("findPerimeter()");
        return Math.PI * 2 * _r;
    }

    public void display() {
        System.out.println("[Circle: x0 = " + _x0 + ", y0 = " + _y0 + ", radius = " + _r + "]");
    }
}
import java.io.*;

public class Cube {
    private int _side1, _side2, _side3;

    public Cube(int side1, int side2, int side3) {
        _side1 = side1;
        _side2 = side2;
        _side3 = side3;
    }

    public int getVolume() {
        return _side1 * _side2 * _side3;
    }

    public int getSurfaceArea() {
        return 2 * (_side1 * _side2 + _side2 * _side3 + _side1 * _side3);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in;
        int side1, side2, side3;

        in = reader.readLine();
        side1 = Integer.parseInt(in);

        in = reader.readLine();
        side2 = Integer.parseInt(in);
        
        in = reader.readLine();
        side3 = Integer.parseInt(in);
        
        Cube cube = new Cube(side1, side2, side3);
        System.out.println("Volume: " + cube.getVolume());
        System.out.println("Surface area: " + cube.getSurfaceArea());
    }
}
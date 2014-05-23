public class NumberCruncher {
    private int _data;

    public NumberCruncher(int data) {
        _data = data;
    }

    public int getData() {
        return _data;
    }

    public void doubleData() {
        _data *= 2;
    }

    public void tripleData() {
        _data *= 3;
    }

    public void squareData() {
        _data = _data * _data;
    }

    public void cubeData() {
        _data = _data * _data * _data;
    }

    public static void main(String[] args) {
        NumberCruncher nc = new NumberCruncher(1);
        System.out.println(nc.getData());
        nc.doubleData();System.out.println(nc.getData());
        nc.tripleData();System.out.println(nc.getData());
        nc.squareData();System.out.println(nc.getData());
        nc.cubeData();System.out.println(nc.getData());
    }
}
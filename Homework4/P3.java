public class P3 {

    // default value: 0
    public int[][] data = new int[52][7];

    public double calcAvgPerWeek() {
        double sum = 0;
        for (int i = 0; i < 52; ++i) {
            for (int j = 0; j < 7; ++j) {
                sum += data[i][j];
            }
        }
        return sum / 52;
    }

    public double calcAvgOfSunday() {
        double sum = 0;
        for (int i = 0; i < 52; ++i) {
            sum += data[i][6];
        }
        return sum / 52;
    }

}
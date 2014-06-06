public class P1 {

    public static void selectionSort(int[] x) {
        for (int i = 0; i < x.length - 1; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    int t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
            }
        }
    }

    public static void selectionSort(double[] x) {
        for (int i = 0; i < x.length - 1; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    double t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
            }
        }
    }

    public static void selectionSort(char[] x) {
        for (int i = 0; i < x.length - 1; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    char t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
            }
        }
    }

}
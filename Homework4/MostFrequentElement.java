import java.util.ArrayList; 

public class MostFrequentElement { 
    /** Given an array of ints, the program finds and prints the most frequently occurring element 
    and its number of occurrences. If there is more than one such element, any one of them 
    may be printed. Assume that the given array contains at least one element. 
    **/ 
    public static void main(String [] args) { 
        // in this example 1 is the most frequent element, it appears 7 times: 
        int[] elements = {1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4};

        ArrayList e = new ArrayList(), t = new ArrayList();

        for (int i = 0; i < elements.length; ++i) {
            int idx = e.indexOf(elements[i]);
            if (idx < 0) {
                e.add(elements[i]);
                t.add(1);
            } else {
                t.set(idx, (int)t.get(idx) + 1);
            }
        }

        int max_value = -1;

        for (Object n : t) {
            if ((int)n > max_value) {
                max_value = (int)n;
            }
        }

        for (int i = 0; i < t.size(); ++i) {
            if ((int)t.get(i) == max_value) {
                System.out.println("The most frequent element " + e.get(i) + " occurs " + t.get(i) + " times"); 
            }
        }
    } 
}
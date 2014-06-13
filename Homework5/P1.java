import java.util.HashMap;

public class P1 {
    
    private static HashMap<String, Integer> _cache = new HashMap<String, Integer>();

    public static int count(String s) {
        if (_cache.containsKey(s)) {
            return _cache.get(s);
        }

        int ret = 0;

        HashMap<Character, Boolean> hit = new HashMap<Character, Boolean>();
        for (char ch : s.toCharArray()) {
            if (!hit.containsKey(ch)) {
                ret++;
                hit.put(ch, true);
            }
        }

        _cache.put(s, ret);

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(count("Hello world"));
        System.out.println(count("the quick brown fox jumps over the lazy dog"));
        System.out.println(count("Hello world"));
    }
}
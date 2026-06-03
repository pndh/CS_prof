public class top_11 {
    static String flipHalve(String s) {
        if (s.length() == 0) {
            return s;
        }
        String s1 = s.substring((s.length() / 2) + (s.length() % 2));
        String s2 = s.substring(0, (s.length() / 2));
        char[] array = s.toCharArray();
        if (s.length() % 2 == 1) {
            return s1 + array[s.length() / 2] + s2;
        } else {
            return s1 + s2;
        }
    }
    public static void main(String[] unused) {
        System.out.println(flipHalve("testme"));
    }
}

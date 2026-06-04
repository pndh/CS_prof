public class top_17 {
    static String rotateRight(String s, int a) {
        if (!(s != null && s.length() > 0)) {
            return null;
        }
        int size = s.length();
        String snew = "";
        int shift = a % size;
        String s1 = s.substring(size - shift), s2 = s.substring(0, size - shift);
        snew = s1 + s2;
        return snew;
    }
    public static void main(String[] args) {
        System.out.println(rotateRight("", 1));
    }
}

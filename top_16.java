public class top_16 {
    static int arrayCountGreaterThan(int a[], int b) {
        assert(a != null);
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] unused) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(arrayCountGreaterThan(null, 2));
    }
}

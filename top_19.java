import java.time.Instant;
public class top_19 {
    static int compareDates(String first, String second){
        Instant time1 = Instant.parse(first);
        Instant time2 = Instant.parse(second);
        if (time1.isBefore(time2)) {
            return -1;
        } else if (time1.isAfter(time2)) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(compareDates("2021-09-15T00:00:00.000Z", "2021-08-15T00:00:00.000Z"));
    }
}

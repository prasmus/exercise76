/**
 * Created by Praktika on 7.12.2016.
 */
public class exercise76 {
    public static void main(String[] args) {
        double ans = gauss(1,18);
        System.out.println(ans);
    }
    public static double gauss(double x, int n) {
        double ansX = x * x;
        double ans = 0;
        double denom = 1;
        int sign = -1;
        int i = 2;
        while (i <= n) {
            sign = sign * -1;
            ansX = ansX * x * x;
            denom = denom * i;
            ans = ans + sign * ansX / denom;
            i = i + 1;
        }
        return (1 - x * x + ans);
    }

}

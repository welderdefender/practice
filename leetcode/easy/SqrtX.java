package easy;

public class SqrtX {
    public int mySqrt(int x) {
        double t;
        double sqrtRoot = x >> 1;
        if (x == 0 || x == 1) {
            return x;
        }
        do {
            t = sqrtRoot;
            sqrtRoot = (t + (x / t)) / 2;
        }
        while ((t - sqrtRoot) != 0);

        return (int) sqrtRoot;
    }
}
public class Ispower {
    boolean solution(int n) {
        if (n == 1) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            int k = n;
            while (k % i == 0) {
                k = k / i;
                if (k == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

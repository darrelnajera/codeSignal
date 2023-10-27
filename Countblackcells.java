public class Countblackcells {
    int solution(int n, int m) {
        return n + m + gcd(n,m) - 2;
    
    }
    int gcd(int n, int m){
        while (m>0) {
            int temp = n;
            n = m;
            m = temp%m;
        }
         
        return n;
    }
    
}

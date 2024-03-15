public class Issumofconsecutive {
    int solution(int n) {
        int sum = 0;
        int method = 0;
        int next = 0;
        for (int j = 1; j < n; j++) {
            for (int i = j; sum <= n; i ++) {
                sum = sum + i;
                System.out.println("sum :" + sum);
                if (sum == n) {
                    method++;
                    sum = 0;
                    break;
                } else if(sum > n) {
                    sum = 0;
                    break;
                }    
            }
        }
        
        return method;
    }
}

public class Appleboxes {
    int solution(int k) {
        int yellow=0;
        int red=0;
        for(int i = 1;i <= k; i++) {
            if(i%2==0) {
                red = red + (i*i);
            } else {
                yellow = yellow + (i*i);
            }
        }
        return red - yellow;
    
    }
    
}

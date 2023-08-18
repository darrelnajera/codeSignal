public class Mirrorbits {
    
    int solution(int a) {
        return Integer.valueOf(new StringBuilder(Integer.toBinaryString(a)).reverse().toString(), 2);
    }
}

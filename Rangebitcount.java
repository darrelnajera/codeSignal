public class Rangebitcount {
    
int solution(int a, int b) {
    int count = 0;
    for(int i=a; i<=b; i++) {
        count += Integer.bitCount(i);
    }
    return count;
}

}


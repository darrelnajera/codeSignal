public class Differentrightmostbit {
    //int m and m in class
int solution(int n, int m) {
    //return the bit in lowest order from n to the power of m
    return Integer.lowestOneBit(n^m) ;
  }
}

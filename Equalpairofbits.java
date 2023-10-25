public class Equalpairofbits {
    int solution(int n, int m) {
        //perfom logical negationsin each bit
        //return n and the position of the found pair
        return Integer.lowestOneBit(~(n^m));
      }
}

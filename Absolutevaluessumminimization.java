public class Absolutevaluessumminimization {
    int solution(int[] a) {
        //in this array of ints, the number closest to the rest is the one in the middle. 
        
        // we take the last number in the array and we subtract by 1 and divide by 2
        return a[(a.length - 1) / 2 ];
        }
        
}

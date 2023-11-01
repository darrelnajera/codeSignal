public class Issmooth {
    boolean solution(int[] arr) {
        if (arr[0]!=arr[arr.length-1]) return false;
        int i = arr.length/2;
        if (arr.length%2==0) {
          int sum = arr[i-1]+arr[i];
          return sum == arr[0];
        }
        return arr[0] == arr[i];
      }
      
}

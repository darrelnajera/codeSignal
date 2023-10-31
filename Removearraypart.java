public class Removearraypart {
    int[] solution(int[] inputArray, int l, int r) {

        int[] arr = new int[inputArray.length-(r-l+1)];
        int ctr = 0;
        for (int i = 0; i< l; i++){
          arr[ctr++] = inputArray[i];
        }
        for (int i = r+1; i<inputArray.length; i++) {
          arr[ctr++] = inputArray[i];
        }
        return arr;
      }
       
}

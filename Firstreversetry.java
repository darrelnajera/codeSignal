public class Firstreversetry {
    int[] solution(int[] arr) {
        if (arr.length == 0)
            return arr;
        
        int i = 0, j = arr.length - 1;
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return arr;
    }
    
}

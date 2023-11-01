public class Replacemiddle {
    int[] solution(int[] arr) {
        int temp = (arr.length/2)-1;
        if((arr.length%2)==0){
            int[]result = new int[arr.length-1];
            int j=0;
           for(int i=0;i<arr.length;i++){
               if(i==temp){
                   result[j]=arr[i]+arr[i+1];
               }
               else{
                   if(i==temp+1){
                       j++;
                   }else{
                   result[j]=arr[i];
                   j++;
                }
               }
           }
            return result;
        }
        
        return arr;    
    }
}

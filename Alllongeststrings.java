public class Alllongeststrings {
    String[] solution(String[] inputArray) {
        if(inputArray.length == 1) return inputArray;
        int max = 0;
        int count = 0;
        
        for (int word = 0; word < inputArray.length; word++ ) {
            int wordSize = inputArray[word].length();
            if(max == wordSize) {
                count++;
            } else if(max < wordSize){
                max = wordSize;
                count = 1;
                
            }
            
        }
        int index = 0;
        String[]answer = new String[count];
        for(int word = 0; word < inputArray.length; word++) {
            int wordSize = inputArray[word].length();
            if (max == wordSize){
                answer[index] = inputArray[word];
                index = index + 1;
            }
        }
        return answer;
    
    }
    
}

public class Alllongeststrings {
    String[] solution(String[] inputArray) {
        //If the array is just one letter return the array.
        if(inputArray.length == 1) return inputArray;
        //Store the variables for the biggest word 
        int max = 0;
        int count = 0;
        //For loops iterates through the length of the word
        for (int word = 0; word < inputArray.length; word++ ) {
            int wordSize = inputArray[word].length();
            //If one of the strings has the most letters(max) the count goes up(count++)
            if(max == wordSize) {
                count++;
            //If one of  the strings are shorter in word size than others(max) they do not count in the output
            } else if(max < wordSize){
                max = wordSize;
                count = 1;
                
            }
            
        }
        //maxOutput is the variable that stores the biggest integers
        int maxOutput = 0;
        //create new array of strings for the output will print the biggest wordSized strings
        String[]answer = new String[count];
        //for loops created to iterate through the new array of strings being outputted
        //wordSize stored to keep track of the length of the word
        for(int word = 0; word < inputArray.length; word++) {
            int wordSize = inputArray[word].length();
            //if string is biggest in word size, it will be included in String[]answer
            if (max == wordSize){
                answer[index] = inputArray[word];
                maxOutput = maxOutput + 1;
            }
        }
        return answer;
    
    }
    
}

public class Isbeautifulstring {
    boolean solution(String inputString) {
        //create an array to count how many occurencesof each letter from the alphabet in the string
        int[] counter = new int[26];
        //for each loop that iterates through each char in array
        //increase counter by 1 every time certain letter appears
        for (char c: inputString.toCharArray()) {
            counter[c - 'a'] ++;
        }
        //second for loop to compare letter in alphabet before
        for (int i = 1; i < counter.length; i++) {
            //if occurrence of letter before is less than next letter, return true
            if (counter[i] < counter[i+1]){
                return true;
            } else {
                return false;
             }
        
        }
    }
     
}

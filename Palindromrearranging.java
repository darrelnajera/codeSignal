public class Palindromrearranging {
    boolean solution(String inputString) {
    
        //palindromes = equal number of charecters EXCEPT FOR 1 character
        // i.e "abba" "abdba" respectively
        
        //implement hash map to keep track of charecters
        //  char       count
        Map<Character, Integer> count = new HashMap<>();
        for(char letter: inputString.toCharArray()) {
            
            //If letter is found more than once in hash map, counter equals value of key + 
            if(count.containsKey(letter)){
                count.put(letter, count.get(letter)+1);
            //If letter only is found once, count of "1" is assigned to this letter.
            } else {
                count.put(letter,1);
            }
            
        }
        //store variable for the letter that stands out
        int odd = 0;
        //reiterate through hash map again
        for(Character letter: count.keySet()) {
            //if count of letter divided by 2 doesnt equal 0 , the amount of that key appears is odd
            //
            if(count.get(letter) % 2 != 0 ) {
                odd++;
                //if more than one letter that only appears once in hash map appears, 
                //this is not a palindrome == FALSE
                if(odd > 1) return false;
            }
        }
        //else return true
        return true;
    
    }
    
    
}

public class Longestword {
    String solution(String text) { //replace any foreign charecters in the text with spaces 

        text = text.replaceAll("[^a-zA-Z]+"," "); //create an array of strings separated by spaces 
        String[] spaced = text.split(" "); 
        //store the string for the longest one 
        String longest = spaced[0]; //itearate through each word using using for each loop 
        for(String word:spaced) { //if one word has the greatest length, assign it to string longest 
        if(word.length() > longest.length()) { 
            word = longest; 
        } 
        return longest;
        } 
        }
    
}

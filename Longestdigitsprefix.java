public class Longestdigitsprefix {
    String solution(String inputString) {
        //store empty string for later output
        String prefix = "";
        //iterate through length of the string
        for(int i = 0; i < inputString.length(); i++) {
            //if i is a digit add i to prefix
            if(Character.isDigit(inputString.charAt(i))) {
                prefix = prefix + inputString.charAt(i);
                //if no digits print empty space
            } else {
                return prefix;
            }
        }
        //result
        return prefix;
    
    
    }
    
}

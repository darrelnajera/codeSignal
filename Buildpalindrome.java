public class Buildpalindrome {
    String solution(String string) {
        //return string if it already equals a palindrome
        if(string.equals(new StringBuilder(string).reverse().toString())) 
                    return string;
            
            String atIndex = "";
            for (int i = 0;i<string.length();i++) {
                //add characters to String atIndex
                atIndex+= string.charAt(i);
                //reverse character/characters at index i to add them to original word
                //string + reversed characters
                String reverse = string + new StringBuilder(atIndex).reverse().toString();
                //if it equals a palindrome, return
                if (reverse.equals(new StringBuilder(reverse).reverse().toString())){
                    return reverse;
                }
            }
            //return new string
            return "";
    }
    
    
}

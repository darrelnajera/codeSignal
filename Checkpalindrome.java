public class Checkpalindrome{

    boolean checkPalindrome(String inputString) {
    //Since stringbuilders are mutable and strings cant be changed, we have to use a Stringbuilder to check if the inputString is a palindrome//
    StringBuilder palindrome = new StringBuilder(inputString);
    //using the stringbuilder, we use reverse to reverse the string and toString to return the string format of .reverse.
    return inputString.equals(palindrome.reverse().toString());
    //If the string is reversed, boolean checkPalindrome will print true, if not it will print false
    }
}  

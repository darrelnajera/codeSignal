public class Firstdigit {
    char solution(String inputString) {
        //replace all the digits in the string with just the digit 0 to return the first letter.
         return inputString.replaceAll("[^0-9]", "").charAt(0);
        }
    
}

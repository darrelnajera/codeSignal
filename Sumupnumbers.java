public class Sumupnumbers {
    int solution(String inputString) {
        //store variables for the total sum of digits and the string we will print out at the end
        int sum = 0;
        String temporary = "0";
        //iterate through string
        //if one of the characters in the string is a digit, add them together and assign it to string temporary
        for(int i = 0; i < inputString.length(); i++) {
            if(Character.isDigit(inputString.charAt(i))) {
                temporary = temporary + inputString.charAt(i);
            //if there are no digits, temporary stays 0
            //we use parseInt to return the integer value of the string    
            } else {
                temporary = "0";
                sum = Integer.parseInt(temporary);
            }
        }
        //return integer value of string
        sum = sum + Integer.parseInt(temporary);
        //return result
        System.out.println(sum);
        return sum;
    
    }
    
    
}

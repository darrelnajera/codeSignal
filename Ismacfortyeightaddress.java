public class Ismacfortyeightaddress {
    boolean solution(String inputString) {
        //use regex to return from numbers 0-9 and letters a-f separated by {5 hyphens}
        return inputString.matches("^([0-9A-F][0-9A-F]-){5}[0-9A-F][0-9A-F]$");
    
    }
    
    
}

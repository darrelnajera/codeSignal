public class Findemaildomain {
    String solution(String address) {
        //store integer for at sign
        int at = 0;
        //iterate through email
        for(int i = 0; i < address.length(); i++) {
            //if a character is an at sign, asign it to at integer
            if(address.charAt(i) == '@') {
                at = i;
            }
        }
        //use substring method to return the part of the string after at sign
        return address.substring(at + 1);
    
    }
    
    
}

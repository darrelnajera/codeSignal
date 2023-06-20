public class Isipaddress {
    boolean solution(String inputString) {
        //split the array with periods
        String[]ipAddress = inputString.split("\\.");
        //if there are more than 4 sets of integers return false
        if(ipAddress.length != 4) return false;
        //for each loop to iterate though ip adress
        for(String ip : ipAddress) {
            //try catch to return any faults that would cancel the possibility of being ip adresss
            try {
                //parse string ip to return the integer from string
                int i = Integer.parseInt(ip);
                //if i is less than 0 OR i is more than 25 return false
                if(i < 0 || i > 255) {
                    return false;
                }
                //catch to return false for all other problems
            } catch(NumberFormatException e) {
                return false;
                
            }
            //else this is an ip adress. thumbs up
        }
        return true;
    
    }
    
}

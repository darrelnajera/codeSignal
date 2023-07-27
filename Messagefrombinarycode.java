public class Messagefrombinarycode {
    String solution(String code) {
        //store string values for the binary message and the letters
        String message = "";
        String letter = "";
        //for each loop that converts the String to a character array(for binary message)
        for(char a : code.toCharArray()){
            //add each character to array
            letter+=a;
            //if the amount of characters = 8, that is what we will use for binary message
            if(letter.length()==8){
                //convert the letter to a base 2 number and using parse int
                //finally, use (char) to print out the message of characters
                message += (char) Integer.parseInt(letter,2);
                letter = "";
            }
        }
        //print out the message of characters
        return message;
    }
    
}

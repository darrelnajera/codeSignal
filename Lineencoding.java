public class Lineencoding {
    String solution(String string) {
        //store variables for the letter before the current, keep count of certain letter, and the end string result
        char previousLetter = string.charAt(0);
           
            int letterCount=1;
            String result="";
            
            //iterate through the whole string starting from 1
            for(int i=1; i<string.length(); i++)
            {
                //if conscutive letters are the same increase that count by 1 starting from 1
                if(string.charAt(i)== previousLetter)
                    letterCount++;
                else
                {
                    //letters that occur more than once
                    //add to string number if letters plus that number
                    if(letterCount>1)
                        result+=letterCount;
                    result+=string.charAt(i-1);
                    //repeat the process again with the letter count starting from 1 again
                    previousLetter=string.charAt(i);
                    letterCount=1;
                }	
            }
            //add the letter count to end string result
            if(letterCount>1)
                result+=letterCount;
                //return string from beginning to end (-1)
            result+=string.charAt(string.length()-1);
            
            return result;
        }
}

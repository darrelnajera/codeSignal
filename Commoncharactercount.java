public class Commoncharactercount {
    int solution(String s1, String s2) {
        //assign first string length 
        int before = s1.length();
        //iterate through string 2
        for(int i = 0; i <s2.length(); i++) {
            //replace the first substring that matches regex of string 2
            s1 = s1.replaceFirst(s2.substring(i,i+1), "");
            
        }
        // result
        int after = s1.length();
        //subtract length of before and after to get common shcaracters
        return before - after;
    
    }
    
}

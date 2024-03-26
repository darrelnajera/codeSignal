public class Issubstitutioncipher {
    boolean solution(String string1, String string2) {
        for(int i = 0;i<string1.length();i++){
            char temp1 = string1.charAt(i);
            char temp2 = string2.charAt(i);
            for(int j = 0;j<string1.length();j++){
                if(((string1.charAt(j)==temp1)&&(string2.charAt(j)!=temp2))||((string1.charAt(j)!=temp1)&&(string2.charAt(j)==temp2)))return false;
            }
        }
        return true;
    }
    
    
}

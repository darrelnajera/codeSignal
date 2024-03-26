public class Createanagram {
    int solution(String s, String t) {
        for (char c : s.toCharArray()) 
            t = t.replaceFirst(c + "", "");
        
        return t.length();
    }
    
}

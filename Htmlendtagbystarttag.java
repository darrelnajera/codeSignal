public class Htmlendtagbystarttag {
    String solution(String startTag) {
        String [] arr = startTag.split(" ");
        if (arr.length==1)
        {
            return "</" + arr[0].substring(1);
        }
        else
            return "</" + arr[0].substring(1) + ">";
    }
    
}

public class Findemaildomainn {
    String solution(String address) {
        int t = address.lastIndexOf('@');
        return address.substring(t + 1);
        
    }
    
}

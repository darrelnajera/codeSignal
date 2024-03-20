public class Iscasesensitivepalindrome {
    boolean solution(String inputString) {
        String test = inputString.toLowerCase();
        String anders = new StringBuilder(test).reverse().toString();
        if(anders.equals(test)) {
            return true;
        } else {
            return false;
        }
    }
}

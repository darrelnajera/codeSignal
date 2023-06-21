public class Differentsymbolisnaive {
    int solution(String s) {
        //create arraylist to store all possible characters from string s
        ArrayList<Character> differentCharececters = new ArrayList<>();
        //iterate through each character in the letter
        //add character to arraylist once it is found in the string S
        for(int i = 0; i < s.length(); i++) {
            if(!differentCharececters.contains(s.charAt(i))) {
                differentCharececters.add(s.charAt(i));
            }
        }
        //return how many different characters found via size of arraylist
        return differentCharececters.size();
    
    }
    
}

public class Reverseinparenthesis {
    String solution(String inputString) {
        //returns position of first parens for nested substring
        int firstParens = inputString.lastIndexOf("(");
        //returns position of second parens of nested substring
        int lastParens = inputString.indexOf(")", firstParens);
        //while loop that assures first parens doesnt step out of bounds into string left
        while(firstParens != -1) {
            //string left = characters between the beginning of substring(0) and first parens
            String left = inputString.substring(0, firstParens);
            //use stringbuilder to reverse the string
            //indices of reverse nested start from parens +1 to the last parens
            String reverseNested = new StringBuilder(inputString.substring(firstParens+1, lastParens)).reverse().toString();
            //indices of string to the right start after the last parens 
            String right = inputString.substring(lastParens+1);
            //add together 3 strings
            inputString = left+reverseNested+right;
            firstParens = inputString.lastIndexOf("(");
            lastParens = inputString.indexOf(")", firstParens);
        }
        //return the new string
        return inputString;
    
    }
     
    
}

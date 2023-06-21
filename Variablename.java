public class Variablename {
    boolean solution(String name) {
        //.matches to check if it matches the expression below
        //1st bracket used before to start string with a letter. Include all lowercase and uper case letters 
        //2nd bracket - \\w used to also include digits in between
    return name.matches("[a-zA-Z_]+[\\w]*");
    }
    
    
}

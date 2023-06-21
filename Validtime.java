public class Validtime {
    boolean solution(String time) { //use regex to provide necessary parameters for the time to be correct represenation //hours can only range from 0-23 and minutes can only range from 0-59 
        return time.matches("2[0-3]|1[0-9]|0[0-9]):[0-5][0-9]"); 
        }
}

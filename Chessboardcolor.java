public class Chessboardcolor {
    boolean solution(String cell1, String cell2) {
        //the same axis' difference of cell's letters and numbers HAVE TO BE BOTH even numbers or BOTH odd numbers
        //h3 - c1 = e2 therefore false because e = 5.
        //b2 - a1 = a1 therefore true because a and 1 are both odd
    
        //first cell
        char cellOneAcross = cell1.charAt(0);;
        char cellOneVertical = cell1.charAt(1);
        //second cell
        char cellTwoAcross = cell2.charAt(0);
        char cellTwoVertical= cell2.charAt(1);
        
        //return absolute value of both difference and check if they are divisible by two
        //set both cells equal to eachother in case the differences are both odd 
        return (Math.abs(cellTwoAcross - cellOneAcross) %2 == Math.abs(cellTwoVertical - cellOneVertical) %2);
            
        }
    
}

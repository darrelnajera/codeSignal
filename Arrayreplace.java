public class Arrayreplace {
    int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        //iterate through ALL values in array
        for(int i = 0; i < inputArray.length; i++){
            //replace elemToreplace with substitutionElem
            //by if statement
            if(inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    
    }
    
}

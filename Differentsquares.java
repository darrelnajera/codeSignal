public class Differentsquares {
    int solution(int[][] matrix) {
        ArrayList<String> test = new ArrayList<String>();
        //use two for loops for the x axis and the y axis of the 3d array.
        //start from 1 in order to only include numbers
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++) {
                //Here we assign a two times two box to string twoTimesTwo using 3d array coordinates
                String twoTimesTwo = "" + matrix[i-1][j-1] + matrix[i-1][j] + matrix[i][j-1] + matrix[i][j];
                //if the arraylist notes the presence of String twoTimesTwo, add it to arrayList
                if(!test.contains(twoTimesTwo)) {
                    test.add(twoTimesTwo);
                }
            }
        }
        //return how many boxes we found in the 3d array
        return test.size();
        }
        
}

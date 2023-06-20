public class Aresimilar {
    boolean solution(int[] a, int[] b) {
        //store to see how many intergers at the same index in each array are unequal
        int unequalCounter = 0;
            //array 1 and array 2
            Set arrayOne = new HashSet();
            Set arrayTwo = new HashSet();
        
        //itereate through first array
        for(int i = 0; i < a.length; i ++) {
            if(a[i] != b[i]) {
                //if integers in same indices are unequal increase the counter by 1 to keep track
                unequalCounter++;
                //add integers to each array
                arrayOne.add(a[i]);
                arrayTwo.add(b[i]);
            }
        }
        //if two arrays are 100 percent idenctical return true
        if(unequalCounter == 0) {
            return true;
        }
        // if numbers are only out of order return true
        else if(unequalCounter == 2 && arrayOne.equals(arrayTwo) ){
            return true;
        }
        //else false
        else {
            return false;
        }
    
    }
    
    
}

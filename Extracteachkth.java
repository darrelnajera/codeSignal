public class Extracteachkth {
    int[] solution(int[] inputArray, int k) {  
        //answer will be array with the resulting length after k is removed 
        int[] array = new int[inputArray.length-inputArray.length/k];
    //counter to keep track of kth elements we will remove    
    int counter = 0;
    //iterate through array
    //if integer in array + 1 is divisible by k, continue 
    //remove every kth element
    for(int i = 0; i < inputArray.length; i++) {
        if((i + 1) % k == 0) continue;
        
        array[counter++] = inputArray[i];
    }
    
    return array;
}

     
}

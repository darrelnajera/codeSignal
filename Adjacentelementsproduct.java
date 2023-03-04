public class Adjacentelementsproduct {
    int solution(int[] inputArray) {
        int maxProduct = inputArray[0] * inputArray[1];
        for (int pos = 1; pos < inputArray.length - 1; pos ++) {
        if (maxProduct < inputArray[pos] * inputArray[pos+1]) {
            maxProduct = inputArray[pos] * inputArray[pos+1];
          }
         }
        return maxProduct;
        }
        //Step 1. Declare variable that takes the two adjacent integers in the array that create the greatest product.[0] and [1] will take the integers nearest to eachother.
        //Step 2. Create for loop that alters the array length to avoid using the wrong or all numbers in the array and to only use the adjacent ones.
        //Step 3. Create if statement that declares if the two adjacent pairs in their positions return the highest product, then it gets stored in the maxProduct variable we made in Step 1.
        //Step 4. Return the maxProduct
        
        
    
}

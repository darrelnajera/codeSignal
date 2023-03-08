public class Adjacentelementsproduct {
    int solution(int[] inputArray) {
        int maxProduct = inputArray[0] * inputArray[1];
        for (int position = 1; position < inputArray.length - 1; position ++) {
        if (maxProduct < inputArray[position] * inputArray[position+1]) {
            maxProduct = inputArray[position] * inputArray[position+1];
          }
         }
        return maxProduct;
        }
        //Step 1. Declare variable that takes the two adjacent integers in the array that create the greatest product.[0] and [1] will take the integers next to eachother.
        //Step 2. Create for loop iterating through the array all the way to the end of the array(.length - 1).
        //Step 3. Create if statement that declares if the two adjacent pairs([position + 1]) in their positions return the highest product, then it gets stored in the maxProduct variable we made in Step 1.
        //Step 4. Return the maxProduct
        
        
    
}

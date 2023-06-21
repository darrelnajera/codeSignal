   public class Alphabeticshift {
String solution(String inputString) {
    //convert the string into an array of characters
    char[] array = inputString.toCharArray();
    //iterate through each letter
    for(int letter = 0; letter < array.length; letter++) {
        //for each charecter in array, convert it to the next letter in alphabet
        if(array[letter] == 'z')
            array[letter] = 'a';
        //increment letter by 1    
        else array[letter]++;
        
    }
    //return the altered string
    return new String(array);

}

    
}

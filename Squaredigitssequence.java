public class Squaredigitssequence {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    int number = a0;
    int count = 1;
    while (!nums.contains(number)) {
        nums.add(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        number = sum;
        count++;
    }
    
    return count;
    
}

}

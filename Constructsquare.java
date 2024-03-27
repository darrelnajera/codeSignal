public class Constructsquare {
    int solution(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;
        Arrays.sort(freq);
        int min = (int)Math.pow(10, s.length()-1);
        int lowerBound = (int)Math.sqrt(min);
        int upperBound = min*10;
        int res = -1;
        for (int i = lowerBound; i*i < upperBound; i++){
            int square = i*i;
            int[] count = new int[26];
            while (square > 0){
                count[square % 10]++;
                square /=10;
            }
            Arrays.sort(count);
            if(Arrays.equals(freq, count)) res = i * i;
        }
        return res;
}
}

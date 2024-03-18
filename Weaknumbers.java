public class Weaknumbers {
    int[] solution(int n) {
        int[] erg = new int[2];
        int[] weakness = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= (i+1); j++){
                if(((i+1) % j) == 0){
                    weakness[i] ++;
                }
            }
            int count = 0;
            for(int j = 0; j < i; j++){
                if(weakness[j] > weakness[i]){
                    count ++;
                }
            }
            if(count == erg[0]){
                erg[1]++;
            }
            if(count > erg[0]){
                erg[1] = 1;
                erg[0] = count;
            }
        }
        return erg;
    } 
}

int solution(int min1, int min2_10, int min11, int s) {
    int minutes = 1;
    while(s >= 0){
        if(minutes == 1){
            s -= min1;
        } else if (minutes <= 10){
            s -= min2_10;
        } else {
            s -= min11;
        }
        minutes++;
    }
    
    return minutes-2;
}

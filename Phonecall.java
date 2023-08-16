int solution(int min1, int min2_10, int min11, int s) {
    //minutes start from number 1
    //while loop goes on until money runs out
    int minutes = 1;
    while(s >= 0){
        //if minutes = 1, subtract from cents
        if(minutes == 1){
            s -= min1;
            //if minutes is less than 10 subtract min2_10 from cents
        } else if (minutes <= 10){
            s -= min2_10;
            //else subtract min11 from call
        } else {
            s -= min11;
        }
        //minutes goes on as call continues
        minutes++;
    }
    //return minutes excluding before 2
    return minutes-2;
}

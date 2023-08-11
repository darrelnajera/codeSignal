int solution(int number) {
    //we must get the time first
    //divide number by 60
    int hours = number / 60;
    //minutes equals number modulus 60
    int minutes = number % 60;
    //Add up each number since the soultion will equal the digit sum of time
    return (hours / 10) + (hours % 10) + (minutes / 10) + (minutes % 10);
}

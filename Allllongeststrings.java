public class Allllongeststrings {
    String[] solution(String[] inputArray) 
{
    List<String> laenge = new ArrayList<>(); 
    int ergebniss = 0;
    for(String k: inputArray)
    {
        if(k.length() > ergebniss) {
            laenge = new ArrayList<>(); 
            ergebniss = k.length();
            
        } 
        if(k.length() == ergebniss) 
        {
            laenge.add(k);
            System.out.println(k);
        }
    }
    String[] lang = new String[laenge.size()];
    lang = laenge.toArray(lang);
    return lang;
}

}

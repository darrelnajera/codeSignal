public class Practicejavasolutionthirty {
    String firstPlanet = "Earth";
    String secondPlanet = "Mars";
    int earthMoons = 1;
    int marsMoons = 1;
    //use stringbuilder method
    StringBuilder sb = new StringBuilder();
    //use append method to input ints and strings into our message with outher output
    sb.append(firstPlanet).append(" and ").append(secondPlanet);
    sb.append(" have a total of ").append(earthMoons + marsMoons);
    
    // Convert concatenated message to string
    System.out.println(sb.toString());
    
}
}
}

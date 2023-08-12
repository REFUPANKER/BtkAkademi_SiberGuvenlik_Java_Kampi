package JavaOOP.NestedStructure.F1Race;

public class Driver {
    private String name;
    private static int victories;
    private static int loses;

    public Driver(String name, int victories, int loses) {
        this.name = name;
        this.victories = victories;
        this.loses = loses;
    }

    public String Celebration() {
        return "Victory!";
    }

    public String getName(){
        return name;
    }
    public int getVictories(){
        return victories;
    }
    public int getLoses(){
        return loses;
    }
}

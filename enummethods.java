enum Level {
    LOW, MEDIUM, HIGH
}
public class enummethods {
    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println("Current level: " + level);
        System.out.println("Name: " + level.name());
        System.out.println("Position: " + level.ordinal());
        System.out.println("\nAll levels:");
        for (Level l : Level.values()) {
            System.out.println(l);
        }
    }
}
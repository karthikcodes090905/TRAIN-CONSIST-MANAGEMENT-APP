import java.util.LinkedHashSet;

public class TrainAppUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation: " + train);
        System.out.println("the end");
    }
}
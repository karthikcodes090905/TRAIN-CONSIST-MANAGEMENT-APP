import java.util.ArrayList;
import java.util.List;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainAppUC10 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        // Aggregate total capacity using stream
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, (sum, cap) -> sum + cap);

        // Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}
import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

// Functional Interface
interface BogieRule {
    boolean apply(Bogie b);
}

public class TrainAppUC12 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        // Lambda rule: capacity > 50
        BogieRule highCapacityRule = b -> b.capacity > 50;

        // Apply rule
        System.out.println("Bogies with capacity > 50:");
        for (Bogie b : bogies) {
            if (highCapacityRule.apply(b)) {
                System.out.println(b);
            }
        }
    }
}
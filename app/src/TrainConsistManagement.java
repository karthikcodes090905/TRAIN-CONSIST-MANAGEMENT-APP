import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainAppUC11 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Regex patterns
        String trainPattern = "TR\\d{3}";     // Example: TR123
        String cargoPattern = "CG-[A-Z]{2}\\d{2}"; // Example: CG-AB12

        // Validation
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // Output
        if (isTrainValid) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID Format");
        }

        if (isCargoValid) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code Format");
        }
    }
}
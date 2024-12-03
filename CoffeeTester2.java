// Carleigh Thayer
import java.util.Scanner;

public class CoffeeTester2 {

    public static void main(String[] args) {
        // Create the first Coffee object
        Coffee c1 = new Coffee("Double Triple Loca Mocha Latte Venti Grande", 100);
        System.out.println("The first coffee object has values:\n" + c1.toString());
        System.out.println("Maximum safe cups for the first coffee: " + c1.calculateRiskyAmount());

        // Create the second Coffee object
        Coffee c2 = new Coffee("Iced white mocha latte Venti", 200);
        System.out.println("The second coffee object has values:\n" + c2.toString());
        System.out.println("Maximum safe cups for the second coffee: " + c2.calculateRiskyAmount());

        // Check if the two coffee objects are the same
        System.out.println("Are these 2 coffees the same? \n" + c1.equals(c2));

        // Ask user if they want to create additional Coffee objects
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDo you want to create additional coffee objects? (yes or no): ");
        String response = scanner.nextLine().toLowerCase();

        // Ask the user if they would like to create more coffee objects 
        if (response.equals("yes")) {
            System.out.println("\n--- Creating Additional Coffee Objects ---");
            Coffee.createCoffeeObjects();
        } else {
            System.out.println("No additional coffee objects will be created.");
        }

        scanner.close();
    }
}




//Carleigh Thayer
    	import java.util.Scanner;

public class Coffee {

    // Instance variables
    private String name;
    private double caffeine;

    // Default constructor
    public Coffee() {
        this.name = "none";
        this.caffeine = 50;
    }

    // Parameterized constructor
    public Coffee(String xName, double xCaffeine) {
        this.setName(xName);
        this.setCaffeine(xCaffeine);
    }

    // Accessors
    public String getName() {
        return this.name;
    }

    public double getCaffeine() {
        return this.caffeine;
    }

    // Mutators
    public void setName(String xName) 
    {
            this.name = xName;
    }

    public void setCaffeine(double xCaffeine) {
        if (xCaffeine >= 50 && xCaffeine <= 300) {
            this.caffeine = xCaffeine;
        } else {
            System.out.println("Invalid caffeine amount entered!");
        }
    }

    // Calculate the maximum safe number of coffee cups based on caffeine content
    public int calculateRiskyAmount() {
        return (int) (180.0 / ((this.caffeine / 100.0) * 6.0));
    }

    // Equals method 
    public boolean equals(Coffee otherCoffee) {
        return this.name.equals(otherCoffee.getName()) &&
               this.caffeine == otherCoffee.getCaffeine();
    }

    // toString method
    public String toString() {
        return "Name: " + this.name + "\nCaffeine Amount: " + this.caffeine + " mg";
    }
    
    public static void createCoffeeObjects() {
    	Scanner scanner = new Scanner(System.in);
        String response;

        do {
            // Prompt user for coffee details
            System.out.print("Enter the name of the coffee: ");
            String name = scanner.nextLine();

            System.out.print("Enter the caffeine content in mg: ");
            double caffeine = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Create a Coffee object with the provided details
            Coffee coffee = new Coffee(name, caffeine);
            System.out.println("The coffee object has values:\n" + coffee.toString());
            System.out.println("Maximum safe cups for this coffee: " + coffee.calculateRiskyAmount());

            // Check if the user wants to create another coffee object
            System.out.print("Do you want to create another coffee object? (yes or no): ");
            response = scanner.nextLine().toLowerCase();

        } while (response.equals("yes"));

        System.out.println("Thank you! Exiting the program.");
        scanner.close();
    }
}

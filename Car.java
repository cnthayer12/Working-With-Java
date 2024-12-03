//Carleigh Thayer
public class Car extends Vehicle {
    // Attributes specific to Car
    private double gasMileage; 
    private int numberOfPassengers; 

    // Default Constructor
    public Car() 
    {
        super(); // Calls the Vehicle's default constructor
        this.gasMileage = 0.0; 
        this.numberOfPassengers = 0; 
    }

    // Parameterized Constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName,
               double gasMileage, int numberOfPassengers) 
    {
        super(manufacturerName, numberOfCylinders, ownerName); // Calls the Vehicle's parameterized constructor
        setGasMileage(gasMileage); 
        setNumberOfPassengers(numberOfPassengers); 
    }

    // Accessors 
    public double getGasMileage() 
    {
        return gasMileage;
    }

    public int getNumberOfPassengers() 
    {
        return numberOfPassengers;
    }

    // Mutators 
    public void setGasMileage(double gasMileage) 
    {
        if (gasMileage < 0) 
        {
            throw new IllegalArgumentException("Gas mileage must be a non-negative value.");
        }
        this.gasMileage = gasMileage;
    }

    public void setNumberOfPassengers(int numberOfPassengers) 
    {
        if (numberOfPassengers < 0) 
        {
            throw new IllegalArgumentException("Number of passengers must be a non-negative value.");
        }
        this.numberOfPassengers = numberOfPassengers;
    }

    // equals Method
    public boolean equals(Object obj) 
    {
        if (!super.equals(obj)) return false; // Check Vehicle's attributes first
        
        if (obj == null || getClass() != obj.getClass()) return false;

        Car other = (Car) obj;
        return Double.compare(gasMileage, other.gasMileage) == 0 &&
               numberOfPassengers == other.numberOfPassengers;
    }

    // toString Method
    public String toString() 
    {
        return super.toString() + // Calls Vehicle's toString method
               ", Gas Mileage: " + gasMileage + " gallons" +
               ", Number of Passengers: " + numberOfPassengers;
    }
}


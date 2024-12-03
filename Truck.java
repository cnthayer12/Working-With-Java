//Carleigh Thayer
public class Truck extends Vehicle {
    // Attributes specific to Truck
    private double loadCapacity; 
    private double towingCapacity; 

    // Default Constructor
    public Truck() 
    {
        super(); // Calls the Vehicle's default constructor
        this.loadCapacity = 0.0; 
        this.towingCapacity = 0.0; 
    }

    // Parameterized Constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName,
                 double loadCapacity, double towingCapacity) 
    {
        super(manufacturerName, numberOfCylinders, ownerName); // Calls the Vehicle's parameterized constructor
        setLoadCapacity(loadCapacity); 
        setTowingCapacity(towingCapacity); 
    }

    // Accessors 
    public double getLoadCapacity() 
    {
        return loadCapacity;
    }

    public double getTowingCapacity() 
    {
        return towingCapacity;
    }

    // Mutators 
    public void setLoadCapacity(double loadCapacity) 
    {
        if (loadCapacity < 0) 
        {
            throw new IllegalArgumentException("Load capacity must be a non-negative value.");
        }
        this.loadCapacity = loadCapacity;
    }

    public void setTowingCapacity(double towingCapacity) 
    {
        if (towingCapacity < 0) 
        {
            throw new IllegalArgumentException("Towing capacity must be a non-negative value.");
        }
        this.towingCapacity = towingCapacity;
    }

    // equals Method
    public boolean equals(Object obj) 
    {
        if (!super.equals(obj)) return false; 
        
        if (obj == null || getClass() != obj.getClass()) return false;

        Truck other = (Truck) obj;
        return Double.compare(loadCapacity, other.loadCapacity) == 0 &&
               Double.compare(towingCapacity, other.towingCapacity) == 0;
    }

    // toString Method
    public String toString() 
    {
        return super.toString() + 
               ", Load Capacity: " + loadCapacity + " tons" +
               ", Towing Capacity: " + towingCapacity + " tons";
    }
}


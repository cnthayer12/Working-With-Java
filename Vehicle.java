//Carleigh Thayer
public class Vehicle {
    // Attributes
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default Constructor
    public Vehicle() 
    {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 1; 
        this.ownerName = "Unknown";
    }

    // Parameterized Constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) 
    {
        setManufacturerName(manufacturerName);
        setNumberOfCylinders(numberOfCylinders);
        setOwnerName(ownerName);
    }

    // Accessors 
    public String getManufacturerName() 
    {
        return manufacturerName;
    }

    public int getNumberOfCylinders() 
    {
        return numberOfCylinders;
    }

    public String getOwnerName() 
    {
        return ownerName;
    }

    // Mutators (Setters) with validation
    public void setManufacturerName(String manufacturerName) 
    {
        if (manufacturerName == null || manufacturerName.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Manufacturer name cannot be null or empty.");
        }
        this.manufacturerName = manufacturerName;
    }

    public void setNumberOfCylinders(int numberOfCylinders) 
    {
        if (numberOfCylinders <= 0) 
        {
            throw new IllegalArgumentException("Number of cylinders must be greater than 0.");
        }
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setOwnerName(String ownerName) 
    {
        if (ownerName == null || ownerName.trim().isEmpty()) 
        {
            throw new IllegalArgumentException("Owner name cannot be null or empty.");
        }
        this.ownerName = ownerName;
    }

    // equals Method
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        
        if (obj == null || getClass() != obj.getClass()) return false;

        Vehicle other = (Vehicle) obj;
        return manufacturerName.equals(other.manufacturerName) &&
               numberOfCylinders == other.numberOfCylinders &&
               ownerName.equals(other.ownerName);
    }

    // toString Method
    public String toString() 
    {
        return "Vehicle [Manufacturer: " + manufacturerName +
               ", Cylinders: " + numberOfCylinders +
               ", Owner: " + ownerName + "]";
    }
}


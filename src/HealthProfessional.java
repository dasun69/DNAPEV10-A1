public class HealthProfessional {
    protected int id;
    protected String name;
    protected String clinicName;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.clinicName = "Unknown Clinic";
    }

    // Constructor with parameters
    public HealthProfessional(int id, String name, String clinicName) {
        this.id = id;
        this.name = name;
        this.clinicName = clinicName;
    }

    // Method create print all instance variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Clinic Name: " + clinicName);
    }
}


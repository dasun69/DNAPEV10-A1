public class Physiotherapist extends HealthProfessional {
    private String therapyType;

    // Default constructor
    public Physiotherapist() {
        super();
        this.therapyType = "Physical Therapy";
    }

    // Constructor with parameters
    public Physiotherapist(int id, String name, String clinicName, String therapyType) {
        super(id, name, clinicName);
        this.therapyType = therapyType;
    }

    // Print method
    public void printDetails() {
        System.out.println("Health Professional Type: Physiotherapist");
        super.printDetails();
        System.out.println("Therapy Type: " + therapyType);
    }
}

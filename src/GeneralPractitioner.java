public class GeneralPractitioner extends HealthProfessional {
    private String specialization;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.specialization = "General Health";
    }

    // Constructor with parameters
    public GeneralPractitioner(int id, String name, String clinicName, String specialization) {
        super(id, name, clinicName);
        this.specialization = specialization;
    }

    // Print method
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

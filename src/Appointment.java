public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    // Constructor with parameters
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        if (doctor != null) {
            doctor.printDetails();
        }
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
}

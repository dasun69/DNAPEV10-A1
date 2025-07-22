import java.util.ArrayList;

public class AssignmentOne {

    // Part 5 – Collection of appointments
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Health First Clinic", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Lee", "BetterCare Clinic", "Community Health");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Jones", "Northside Clinic", "Women's Health");

        Physiotherapist pt1 = new Physiotherapist(201, "Mr. Clark", "Physio World", "Sports Therapy");
        Physiotherapist pt2 = new Physiotherapist(202, "Ms. Davis", "Rehab Centre", "Rehabilitation");

        // Print details of each health professional
        gp1.printDetails();
        System.out.println();
        gp2.printDetails();
        System.out.println();
        gp3.printDetails();
        System.out.println();
        pt1.printDetails();
        System.out.println();
        pt2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        createAppointment("Alice", "0400111222", "08:00", gp1);
        createAppointment("Bob", "0400333444", "09:30", gp2);
        createAppointment("Charlie", "0400555666", "11:00", pt1);
        createAppointment("Diana", "0400777888", "14:30", pt2);

        printExistingAppointments();
        cancelBooking("0400333444"); // Bob's appointment
        System.out.println("------------------------------");
        printExistingAppointments();
        System.out.println("------------------------------");
    }

    public static void createAppointment(String name, String phone, String time, HealthProfessional doc) {
        if (name == null || phone == null || time == null || doc == null) {
            System.out.println("Error: Missing appointment details.");
            return;
        }
        appointments.add(new Appointment(name, phone, time, doc));
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appt : appointments) {
                appt.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(String mobilePhone) {
        boolean removed = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled for mobile number: " + mobilePhone);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("No appointment found with mobile number: " + mobilePhone);
        }
    }
}
public class AssignmentOne {

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

    }
}

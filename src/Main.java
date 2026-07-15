public class Main {
    public static void main(String[] args) {
        int currentYear = 2026;

        // Test with the new requirements example
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "O", "123-456-7890");

        System.out.println(patient.getDetails(currentYear));
        System.out.printf("Patient BMI: %.2f%n", patient.getBMI());

        System.out.println("-----------------------------");

        // Testing the chained constructor fallback
        Patient fallbackPt = new Patient(1002, "Joe Dohn", 1990, 160.0, 65.0);
        System.out.println(fallbackPt.getDetails(currentYear));
        System.out.printf("Patient BMI: %.2f%n", fallbackPt.getBMI());
    }
}
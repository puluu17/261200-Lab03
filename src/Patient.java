public class Patient {
    private int id;
    private String name;
    private int birthYear; // patient's year of birth (CE)
    private double height; // patient's height in centimeters
    private double weight; // patient's weight in kilograms
    private String bloodGroup;
    private String phoneNumber;

    // Adding constructor with all fields and validations
    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = (name != null && !name.isEmpty()) ? name : "Unknown";
        this.birthYear = (birthYear >= 1900 && birthYear <= 2026) ? birthYear : 1900;
        this.height = (height >= 30 && height <= 300) ? height : 0.0;
        this.weight = (weight >= 0.5 && weight <= 500) ? weight : 0.0;
        this.bloodGroup = (bloodGroup != null && !bloodGroup.isEmpty()) ? bloodGroup : "Unknown";
        this.phoneNumber = (phoneNumber != null && !phoneNumber.isEmpty()) ? phoneNumber : "N/A";
    }

    // Constructor chaining
    public Patient(int id, String name, int birthYear, double height, double weight) {
        this(id, name, birthYear, height, weight, "Unknown", "N/A");
    }

    // Getters
    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public int getBirthYear() { return this.birthYear; }
    public double getHeight() { return this.height; }
    public double getWeight() { return this.weight; }
    public String getBloodGroup() { return this.bloodGroup; }
    public String getPhoneNumber() { return this.phoneNumber; }

    // Method to calculate BMI
    public double getBMI() {
        if (this.height <= 0) {
            return 0.0; // Avoid division by zero if height validation failed
        }
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }

    // Check current years
    public int getAge(int currentYear) {
        return (currentYear < birthYear) ? -1 : currentYear - birthYear;
    }

    // Return output
    public String getDetails(int currentYear) {
        return "Patient Name: " + name + "\n" +
                "Patient Age: " + getAge(currentYear) + "\n" +
                "Patient Height (cm): " + height + "\n" +
                "Patient Weight (kg): " + weight + "\n" +
                "Blood Group: " + bloodGroup + "\n" +
                "Phone Number: " + phoneNumber;
    }
}
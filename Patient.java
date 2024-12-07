public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber ){
        this.id = id;
        this.name = name;

        if(birthYear <= 0){
//            throw new IllegalArgumentException("BirthYear cannot be negative");
            System.out.println("!!invalid BirthYear!!");
        }else{
        this.birthYear = birthYear;
        }

        if(height <= 0){
//            throw new IllegalArgumentException("Height cannot be negative");
            System.out.println("!!invalid Height!!");
        }else{
            this.height = height;
        }

        if(weight <= 0){
//            throw new IllegalArgumentException("Weight cannot be negative");
            System.out.println("!!invalid Weight!!");
        }else{
            this.weight = weight;
        }

        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWeight(){
        return this.weight;
    }

    public String getBloodGroup(){
        return this.bloodGroup;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    public int getAge(int currentYear){
        return  currentYear - this.birthYear;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.printf("BMI: %.2f%n", getBMI());
    }

    public double getBMI() {
        if (this.height > 0 && this.weight > 0) {
            return this.weight / ((this.height / 100.0) * (this.height / 100.0));
        } else {
            return 0.0;
        }
    }


}

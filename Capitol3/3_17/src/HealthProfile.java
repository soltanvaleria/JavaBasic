public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private double height;
    private double weight;
    HealthProfile(String firstName, String lastName, String gender, Date birthDate, double height, double weight)
    {
       this.firstName=firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.birthDate = birthDate;
       this.height = height;
       this.weight = weight;
    }
    public String getLastName() { return lastName;}

    public String getFirstName() { return firstName;}

    public String getGender() {return gender;}

    public String getBirthDate() {
        return birthDate.displayDate();
    }

    public double getHeight() {return height;}

    public double getWeight() {return weight;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) { this.gender = gender; }

    public void setBirthDate(Date birth) {
        this.birthDate = birth;
    }

    public void setHeight(int height) {this.height = height;}

    public void setWeight(int weight) {this.weight = weight;}

    public int calculateAge()
    {
        int age;
        if(birthDate.month<=5 & birthDate.date<=30)
        {
            age = 2022-birthDate.year;
        }
        else age = 2022- birthDate.year-1;
        return age;
    }

    public int calculateMaxHeartRate()
    {
        int maxHeartRate;
        int age = calculateAge();
        maxHeartRate = 220-age;
        return maxHeartRate;
    }
    public String calculateTargetHeartRate()
    {
        int targetHeartRate1;
        int targetHeartRate2;
        int max = calculateMaxHeartRate();
        targetHeartRate1 = max*50/100;
        targetHeartRate2 = max*85/100;
        String message = String.format("%d between %d", targetHeartRate1, targetHeartRate2);
        return message;
    }
    public double calculateBMI()
    {
        double bmi;
        bmi = bmi = weight/(height*height);
        return bmi;
    }
    public void displayBMI()
    {
        double bmi = calculateBMI();
        System.out.printf("BMI = %.2f, ", bmi);
        if(bmi<18.5) System.out.println("Underweight");
        if(bmi>=18.5 & bmi< 25) System.out.println("Normal");
        if(bmi>=25 & bmi <30) System.out.println("Overweight");
        if(bmi>=30) System.out.println("Underweight");
    }
}

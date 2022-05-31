

public class HeartRates {
    private String firstName;
    private String lastName;
    private Date birth;
    HeartRates( String firstName, String lastName, Date birth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirth() {
        return birth.displayDate();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int calculateAge()
    {
        int age;
        if(birth.month<=5 & birth.date<=30)
        {
            age = 2022-birth.year;
        }
        else age = 2022- birth.year-1;
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
}

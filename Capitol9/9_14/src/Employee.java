public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //get methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n",
                "Employee", firstName, lastName,
                "Social security number", socialSecurityNumber);
    }
}

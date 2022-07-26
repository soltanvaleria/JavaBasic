public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String securitySocialNumber;

   public Employee(String firstName, String lastName, String securitySocialNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securitySocialNumber = securitySocialNumber;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecuritySocialNumber() {
        return securitySocialNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%s:%s %s;%n%s: %s;%n", "Employee", getFirstName(), getLastName(),
                "Social security number", getSecuritySocialNumber());
    }

    public abstract double earnings();
}

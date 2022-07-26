public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObject = new Payable[6];
        payableObject[0] = new Invoice("01234", "seat", 2, 375.0);
        payableObject[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObject[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObject[3] = new HourlyEmployee("Lisa", "Barnes", "888-88-8888", 10, 40);
        payableObject[4] = new CommissionEmployee("Elena", "Johnson", "111-12-1333", 800.0, 0.1);
        payableObject[5] = new BasePlusCommissionEmployee("Lera", "Soltan", "1234-12-1234", 4000, 0.2, 400);
        for(Payable currentPayable : payableObject)
        {
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }
    }
}

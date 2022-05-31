public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    Invoice(String number, String description, int quantity, double price)
    {
        this.number = number;
        this.description = description;
             if(quantity<0)
                 this.quantity = 0;
              else
                  this.quantity = quantity;
              if(price<0) this.price = 0.0;
              else
                  this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrice(double price) {
        if(price>=0)
        this.price = price;
        else this.price = 0.0;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0)
        this.quantity = quantity;
        else this.quantity = 0;
    }
    public double getInvoiceAmount ()
    {
        double invoiceAmount = quantity*price;
        return invoiceAmount;
    }
}

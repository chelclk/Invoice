
/**
 * 3.13 Java pg100
 */

public class Invoice {

private int quantity;
private double price;
private double invoiceAmount;

    //constructor
    public Invoice() {
        
        invoiceAmount = 0;
    }

    public double getInvoiceAmount(int quantity, double price) {
        invoiceAmount = price * quantity;
        return invoiceAmount;
    }
}

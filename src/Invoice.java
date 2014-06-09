
/**
 * 3.13 Java pg100
 */

public class Invoice {

    private double invoiceAmount;
    private String partDesc;
    private String partNum;
    private int quantity;
    private double price;

    //constructor
    public Invoice(double initialBalance) {
        if (initialBalance >= 0.0) {
            invoiceAmount = initialBalance;
        } else {
            invoiceAmount = 0;
        }
    }
    public String setPartNum(){
        partNum = 
    }

    public double getInvoiceAmount() {
        invoiceAmount = price * quantity;
        return invoiceAmount;
    }
}

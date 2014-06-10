/** @author q797557*/


/** @author q797557*/
import java.util.Scanner;

public class InvoiceTest 
{
    public static void main( String[] args )
    { 
      
        Invoice invoice1 = new Invoice();
        
        Scanner input = new Scanner (System.in);
        
        
        System.out.println( "Please enter part number: ");
                String part = input.next();
                
        System.out.println( "Please enter a part description: ");
                String partDesc = input.next();
        
        System.out.println( "Please enter price: ");
                double price = input.nextDouble();
                
        System.out.println( "Please enter quantity: ");
                int quantity = input.nextInt();
                
        invoice1.setPartNum(part);
        
        System.out.println(quantity + "  " + part + "  " + partDesc + "  " + "$"+price);
        
        System.out.printf("Invoice total is: $%.2f\n", 
                invoice1.getInvoiceAmount(quantity, price));
    }
}

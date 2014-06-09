/** @author q797557*/


/** @author q797557*/
import java.util.Scanner;

public class InvoiceTest 
{
    public static void main( String[] args )
    { 
        Invoice invoice1 = new Invoice;
        
        Scanner input = new Scanner (System.in);
        
        String partNum = input.nextLine();
        System.out.println( "Please enter part number: %s\n",
                invoice1.setPartNum( partNum ) );
        System.out.println( "Please enter a part description: %s\n",
                invoice1.setPartDesc( partDesc) );
        
        
        System.out.printf("Balance is: $%.2f\n", 
                account1.getBalance());
    }
}

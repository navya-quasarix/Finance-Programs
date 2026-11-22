import java.util.Scanner;

public class GstSplit {
	
	public void calculateGst(double amount, double gstRate, String sellerState, String buyerState) {
		
        double tax = (amount * gstRate) / 100;
        
        System.out.println("\nTax Breakdown");
        System.out.println("Taxable Amount: " + amount);
        
        if (sellerState.trim().equalsIgnoreCase(buyerState.trim())) {
        	
            double halfTax = tax / 2;
            
            System.out.println("Sale Type: Intrastate");
            System.out.println("CGST (" + (gstRate / 2) + "%): " + halfTax);
            System.out.println("SGST (" + (gstRate / 2) + "%): " + halfTax);
            
        } else {
            System.out.println("Sale Type: Interstate");
            System.out.println("IGST (" + gstRate + "%): " + tax);
        }
        System.out.println("Grand Total: " + (amount + tax));
    }
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        GstSplit gst = new GstSplit();
        
        System.out.print("Enter Taxable Amount : ");
        double amount = sc.nextDouble();
        
        System.out.print("Enter GST Rate : ");
        double rate = sc.nextDouble();
         
        System.out.print("Enter Seller State: ");
        String seller = sc.nextLine();
        
        System.out.print("Enter Buyer State: ");
        String buyer = sc.nextLine();
        
        gst.calculateGst(amount, rate, seller, buyer);
        
        sc.close();
    }
	

}

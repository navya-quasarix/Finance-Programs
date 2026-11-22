import java.util.Scanner;

public class BillDiscount {
	public double calculateDiscount(double bill, double discountP) {
		
        if (bill < 0 || discountP < 0 || discountP > 100) {
            throw new IllegalArgumentException("Invalid bill or discount percentage");
        }
        return (bill * discountP) / 100;
    }
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        BillDiscount bd = new BillDiscount();
        
        System.out.print("Enter Bill Amount (₹): ");
        double bill = sc.nextDouble();
        
        System.out.print("Enter Discount Percentage (%): ");
        double discountP = sc.nextDouble();
        
        double discount = bd.calculateDiscount(bill, discountP);
        double payable = bill - discount;
        
        System.out.println("Discount Amount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + payable);
        
        sc.close();
    }

}

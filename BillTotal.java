import java.util.Scanner;

public class BillTotal {
	
	public double calculateTotal(double[] prices) {
        if (prices == null || prices.length == 0) {
            return 0.0;
        }
        
        double sum = 0;
        
        for (double price : prices) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative: " + price);
            }
            sum += price;
        }
        
        return sum;
    }
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        BillTotal bt = new BillTotal();
        
        System.out.print("How many items on the bill? ");
        int count = sc.nextInt();
        
        double[] prices = new double[count];
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter price for item " + (i + 1) + " (₹): ");
            prices[i] = sc.nextDouble();
        }
        
        double total = bt.calculateTotal(prices);
        
        System.out.println("Total Bill Amount: " + total);
        
        sc.close();
    }

}

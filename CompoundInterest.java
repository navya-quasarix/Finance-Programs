import java.util.Scanner;

public class CompoundInterest {
	public double calculateTotal(double p, double r, double t, int n) {
        if (p < 0 || r < 0 || t < 0 || n <= 0) {
            throw new IllegalArgumentException("Invalid input values");
        }
        double rateDecimal = r / 100;
        return p * Math.pow(1 + (rateDecimal / n), n * t);
    }
	
	 public static void main(String[] args) {
		 
		 
	        Scanner sc = new Scanner(System.in);
	        CompoundInterest ci = new CompoundInterest();
	        
	        System.out.print("Enter Principal : ");
	        double p = sc.nextDouble();
	        
	        System.out.print("Enter Annual Rate: ");
	        double r = sc.nextDouble();
	        
	        System.out.print("Enter Time (years): ");
	        double t = sc.nextDouble();
	        
	        System.out.print("Compounding frequency per year (1=yearly, 4=quarterly, 12=monthly): ");
	        int n = sc.nextInt();
	        
	        double totalAmount = ci.calculateTotal(p, r, t, n);
	        double interest = totalAmount - p;
	        
	        System.out.println("Compound Interest: ₹" + interest);
	        System.out.println("Total Maturity Amount: ₹" + totalAmount);
	        
	        sc.close();
     }

}

import java.util.Scanner;

public class SimpleInterest {
	
	public double calculate(double p, double r, double t) {
		if (p < 0 || r < 0 || t < 0) {
			throw new IllegalArgumentException("Values cannot be negative");
			
		}
		return (p * r * t)/100;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleInterest si = new SimpleInterest();
		
		System.out.print("Enter Principal : ");
        double p = sc.nextDouble();
        
        System.out.print("Enter Rate of Interest (per year): ");
        double r = sc.nextDouble();
        
        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();
        
        double interest = si.calculate(p, r, t);
        double total = p + interest;
        
        System.out.println("Simple Interest: ₹" + interest);
        System.out.println("Total Amount: ₹" + total);
        
        sc.close();
		
	}

}

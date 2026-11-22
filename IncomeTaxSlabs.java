import java.util.Scanner;


public class IncomeTaxSlabs {
	public double calculateTax(double income) {
		
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative");
        }
        
        double tax = 0;
        double remaining = income;
        
        
        if (remaining > 1200000) {
            tax += (remaining - 1200000) * 0.20;
            remaining = 1200000;
        }
        
        if (remaining > 900000) {
            tax += (remaining - 900000) * 0.15;
            remaining = 900000;
        }
        
        if (remaining > 600000) {
            tax += (remaining - 600000) * 0.10;
            remaining = 600000;
        }
        
        if (remaining > 300000) {
            tax += (remaining - 300000) * 0.05;
        }
        return tax;
    }
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        IncomeTaxSlabs taxCalc = new IncomeTaxSlabs();
        
        System.out.print("Enter Annual Income : ");
        double income = sc.nextDouble();
        
        double tax = taxCalc.calculateTax(income);
        
        System.out.println("Total Income Tax: " + tax);
        System.out.println("Take-Home Income: " + (income - tax));
        
        sc.close();
    }

}

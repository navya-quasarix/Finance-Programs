import java.util.Scanner;

public class LoanEmi {
	public double calculateEmi(double p, double annualRate, int years) {
		
        if (p <= 0 || years <= 0) {
            throw new IllegalArgumentException("Principal and years must be positive");
        }
        
        int months = years * 12;
        
        if (annualRate == 0) {
            return p / months;
        }
        
        double r = annualRate / (12 * 100); // monthly interest rate
        double power = Math.pow(1 + r, months);
        
        return (p * r * power) / (power - 1);
    }
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        LoanEmi emiCalc = new LoanEmi();
        
        System.out.print("Enter Loan Amount: ");
        double p = sc.nextDouble();
        
        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Tenure (years): ");
        int years = sc.nextInt();
        
        double emi = emiCalc.calculateEmi(p, rate, years);
        double totalRepayment = emi * (years * 12);
        
        System.out.println("Monthly EMI: ₹" + emi);
        System.out.println("Total Repayment: ₹" + totalRepayment);
        System.out.println("Total Interest Paid: ₹" + (totalRepayment - p));
        
        sc.close();
    }

}

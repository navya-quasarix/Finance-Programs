import java.util.Scanner;

public class ProfitPercentage {
	
	public double calculate(double cp, double sp) {
		
        if (cp <= 0) {
            throw new IllegalArgumentException("Cost Price must be greater than 0");
        }
        
        double profit = sp - cp;
        return (profit / cp) * 100;
        
    }
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        ProfitPercentage pp = new ProfitPercentage();
        
        System.out.print("Enter Cost Price : ");
        double cp = sc.nextDouble();
        
        System.out.print("Enter Selling Price : ");
        double sp = sc.nextDouble();
        
        double profit = sp - cp;
        double profitPct = pp.calculate(cp, sp);
        
        System.out.println("Profit: " + profit);
        System.out.printf("Profit Percentage: %.2f%%%n", profitPct);
        sc.close();
    }

}

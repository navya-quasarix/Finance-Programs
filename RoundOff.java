import java.util.Scanner;

public class RoundOff {
	
	public long roundToRupee(double amount) {
        return Math.round(amount);
    }
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        RoundOff ro = new RoundOff();
        
        System.out.print("Enter Bill Amount : ");
        double amount = sc.nextDouble();
        
        long rounded = ro.roundToRupee(amount);
        
        System.out.println("Original Amount: " + amount);
        System.out.println("Rounded to Nearest Rupee: " + rounded);
        
        sc.close();
    }

}

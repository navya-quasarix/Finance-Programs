import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class IndianCurrencyFormat {
	public String format(double amount) {
		
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indiaLocale);
        
        return formatter.format(amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IndianCurrencyFormat icf = new IndianCurrencyFormat();
        System.out.print("Enter Amount to format: ");
        double amount = sc.nextDouble();
        String formatted = icf.format(amount);
        System.out.println("Indian Currency Format: " + formatted);
        sc.close();
    }

}

package DebtCollect;
import java.util.Scanner;

public class DebtPayback {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Debt Value");
		double db = sc.nextDouble();
		System.out.println("Enter Interest Rate");
		double intrst = sc.nextDouble();
		System.out.println("Enter Duration in months");
		int dbdur = sc.nextInt();
		System.out.println("Debt: "+db);
		System.out.println("Interest rate: "+intrst);
		System.out.println("Duration: "+dbdur);
		
		  double monthlyRate = calculateMonthlyRate(db, intrst, dbdur);
	        int numberOfRates = dbdur;
	        double overallDebt = calculateOverallDebt(db, monthlyRate, numberOfRates);

	        // Display the results
	        System.out.println("\nLoan Details:");
	        System.out.println("Monthly Rate: " + monthlyRate + " euros");
	        System.out.println("Number of Rates: " + numberOfRates);
	        System.out.println("Overall Debt: " + overallDebt + " euros");

		sc.close();// comment
		
		// add 
		

	}
	public static double calculateMonthlyintrst(double intrst) {
        return intrst / (12 * 100);
    }

    // Function to calculate the monthly rate
    public static double calculateMonthlyRate(double db, double intrst, int dbdur) {
        double monthlyintrst = calculateMonthlyintrst(intrst);
        return (db * monthlyintrst) / (1 - Math.pow(1 + monthlyintrst, - dbdur));
    }

    // Function to calculate the overall debt
    public static double calculateOverallDebt(double db, double monthlyRate, int numberOfRates) {
        return db + (monthlyRate * numberOfRates);
    }

}

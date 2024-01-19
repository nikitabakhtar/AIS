package DebtCollect;
import java.util.Scanner;

public class DebtPaybackCal {

	
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
	
		sc.close();

	       
		
		double monthlyRate = calculateMonthlyRate(db, intrst, dbdur);
        double overallDebt = calculateOverallDebt(db, intrst, dbdur);

        // Display the results
        System.out.println("\nLoan Details:");
        System.out.println("Monthly Payback Rate: " + monthlyRate + " euros");
        System.out.println("Number of Rates: " + dbdur);
        System.out.println("Overall Debt: " + overallDebt + " euros");
        
		
			

	}
	public static double calculateMonthlyintrst(double intrst) {
		if (intrst <= 0) {
            return 0.0;
        }
        return (intrst / 12 ) *  100;
    }

    // Function to calculate the monthly rate
    public static double calculateMonthlyRate(double db, double intrst, int dbdur) {
    	 if (db <= 0 || intrst <= 0 || dbdur <= 0) {
             return 0.0;
         }
        double monthlyintrst = calculateMonthlyintrst(intrst);
        return (db / dbdur) + monthlyintrst;
    }

    // Function to calculate the overall debt
    public static double calculateOverallDebt(double db, double intrst, int numberOfRates) {
    	 if (db <= 0 || intrst <= 0 || numberOfRates <= 0) {
             return 0.0;
         }
    	 double monthly = calculateMonthlyRate( db,  intrst, numberOfRates);
    	return  (monthly * numberOfRates);
    }

}

import java.util.Scanner;
public class RiskyBank {
	public static void main(String[] args) {                    //Create main class
		Scanner input = new Scanner(System.in);                 //Input scanner to read input from users
		int n = input.nextInt();                                //Get number of banks 
		double limit = input.nextDouble();						//Get number the limits 									
		double[] bankBalances = new double[n];                  //create a 1st dimensional array to store the balance of each bank
		double bankBalance = input.nextDouble();				//Get bank balances from the users
		for (int i = 0; i < bankBalances.length; i++) { 
			bankBalances[i] = input.nextDouble();				//Read the input to the next line
		}														//Read next line
		int loanTo = input.nextInt();							//The number of banks that each bank loan to
		double[][] borrowers = new double[n][2];					//create a 2 dimensional array to store the amount that are loan to each bank and which bank it is
		double bankLoan = input.nextDouble();					//Get the loan amount and get which bank each bank loan to
		for (int i = 0; i < borrowers.length; i++) {					//Read the input to the next line
			for (int j = 0; j < borrowers[i].length; j++) {
				borrowers[i][j] = input.nextDouble();
			}
		}
		String unsafe = "";										//Create an empty String unsafe to store bank that is unsafe as a string
		for (int i = 0; i < borrowers.length; i++) {
			for (int j = 0; j < borrowers[i].length; j++) {
			if (borrowers[i][1] < limit) {								//Compare each bank balance to the limit to see if it is safe
				 unsafe +=  borrowers[j];								//If it is under the limit we add it that bank to unsafe and store it as a string
			}
		}
		}
		System.out.println("Unsafe bank " + unsafe  +  unsafe(borrowers)); 			//Print the result
		
		}
		public static String unsafe(double[][]loans) {						//Create a method to find unsafe banks by find the sum of their balance and final assets
			
		}
	
	
	}




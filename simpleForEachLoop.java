import java.util.Scanner;

public class simpleForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = new int[10];
		int sum = 0, i = 0;
		String choice = new String("Yes");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Summation Calculator: " + '\n');
		
		for(i = 0; i < 10; i++) {
			
			System.out.print("Please enter a number: ");
			number[i] = scanner.nextInt();
			
			System.out.println("Would you like to add a number? Enter 'Yes' or 'No'.");
			choice = scanner.next();
			
			if (choice.equals("Yes")) {
				System.out.println();
			} else if (choice.equals("No")) {
				System.out.println();
				break;
			} else {
				System.out.println("Kindly enter a valid option.");
			}
			
		}
		
		for(int holder: number){
			sum = sum + holder;
		}
		System.out.println("The Sum of all numbers entered is: " + sum);
		
	}

}

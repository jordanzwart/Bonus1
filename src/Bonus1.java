import java.util.Scanner;


public class Bonus1 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numGrade;
		char letterGrade;
		String student;
		char decision;
		decision = 'Y';
		//enters students name		
		System.out.println("Welcome to the Letter Grade COnverter!");
		System.out.println("Enter Student Name: ");
		student = scan.next();
		//staring of a loop that if the decision to enter grades is y or Y, the user will enter the grade by number first
		while ((decision == 'Y') || (decision == 'y')){
			System.out.println("Enter a numerical grade: ");
			numGrade = scan.nextInt();
		//if the grade is lower than 0 or higher than 100 as entered it will reply "Invalid Score"
			if ((numGrade < 0) || (numGrade > 100)) {
				System.out.println("Invalid score");
			}
		//if the grade is between 0-100 it will loop to pick the correct grade assigned
			else {
				while (numGrade <= 100) {
					if ((numGrade >= 97) && (numGrade <= 100)){
						System.out.println("Letter Grade: A+");
					}
					if ((numGrade >= 88) && (numGrade <= 96)){
						System.out.println("Letter Grade: A");
					}
					if ((numGrade >= 87) && (numGrade <= 84)) {
						System.out.println("Letter Grade: B+");
					}
					if ((numGrade >= 80) && (numGrade <= 86)){
						System.out.println("Letter Grade: B");
					}
					if ((numGrade <= 79) && (numGrade >= 72)){
						System.out.println("Letter Grade: C+");
					}
					if ((numGrade >= 67) && (numGrade <= 71)){
						System.out.println("Letter Grade: C");
					}
					if ((numGrade >= 63) && (numGrade <= 66)){
						System.out.println("Letter Grade: D+");
					}
					if ((numGrade <= 62) && (numGrade >= 60)){
						System.out.println("Letter Grade: D");
					}
					if ((numGrade <= 59) && (numGrade >= 0)){
						System.out.println("Letter Grade: F");
					}
					break;
				}
			}
			//asks user if they want to continue and enter another grade. if y then it will reloop to enter another grade, if n it will close
			System.out.println("Continue? (Y/N)");
			decision = scan.next().charAt(0);
		}
		System.out.println("Thank you, Goodbye!");
		
						
}
}


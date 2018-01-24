import java.util.Scanner;


public class Bonus1 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numGrade;
		char letterGrade;
		String student;
		char decision;
		decision = 'y';
				
		System.out.println("Welcome to the Letter Grade COnverter!");
		System.out.println("Enter Student Name: ");
		student = scan.next();
		
		while (decision == 'y'){
			System.out.println("Enter a numerical grade: ");
			numGrade = scan.nextInt();
			
			if ((numGrade < 0) || (numGrade > 100)) {
				System.out.println("Invalid score");
			}
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
			System.out.println("Continue? (y/n)");
			decision = scan.next().charAt(0);
		}
		System.out.println("Thank you, Goodbye!");
		
						
}
}


import java.util.Random;
import java.util.Scanner;
public class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
			
		firstName=firstName;
		lastName=lastName;
		
	}
	void display() {
		System.out.println("Dear "+firstName+" your generated credentials are as follows-");
	}
	void generateEmailAddress(String department) {
		System.out.println(firstName+lastName+"@"+department+".company.com");
	}
	public char[] generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];
	      
	      password[3] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[0] = numbers.charAt(random.nextInt(numbers.length()));
	      password[4] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      
	      for(int i = 5; i< length ; i++) {
	          password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	       }
	       return password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("1.Technical/n2.Admin/n3.Human Resource/n4.Legal");
//		System.out.println("Enter your Choice: ");
//		int choice = myObj.nextInt();
		
		System.out.println("Enter your First Name: ");
		String firstName = myObj.nextLine();
		
		System.out.println("Enter your Last Name: ");
		String lastName = myObj.nextLine();
		
		Employee emp = new Employee(firstName, lastName);
		emp.display();
		emp.generateEmailAddress(choice);
		emp.generatePassword(8);

	}

}

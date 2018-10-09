import java.util.*;



public class Decision {
	
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		String name;
		String playAgain;
		
		do {
		
		System.out.println("What's your name?");
		name = scanner.nextLine();
		
		System.out.println(name + " Enter a number between 1 & 100");
		
		num1 = scanner.nextInt();
		scanner.nextLine();
		if(num1 % 2 != 0 && num1 > 60) {  //Check if number has remainder to determine if odd & > 60
			System.out.println(num1 + " is odd and over 60."); 
		}
		else if(num1 % 2 == 0 && num1 >= 26 && num1 <= 60) { //Check if num is even and between 26 and 60
			System.out.println("Even");
		}
		
		else if(num1 % 2 == 0 && num1 >= 2 && num1 <= 25) { //Check if num is even and between 2 and 25
			System.out.println(num1 + " is even and less than 25.");
		
	}
	
		else if(num1 % 2 == 0 && num1 > 60) { //Check if num is even and > 60
			System.out.println(num1 + " is even");

	}
		
		else if(num1 % 2 != 0) {
			System.out.println(num1 + " is odd.");
		}
		
		System.out.println("Play again? Y/N");
		playAgain = scanner.nextLine();
	 }
		while(playAgain.equalsIgnoreCase("Y"));
	}
	
		
}
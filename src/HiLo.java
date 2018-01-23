import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		//Scan for the user input
		Scanner in = new Scanner(System.in);
		//create string object playAgain - to be overloaded later
		String playAgain = "";
		do {
			//Generate a random number 
			//Math.random creates a number between 0 and 1
			//multiply by 100 and add 1 to make the number between 1 and 100
			//use type casting to convert the Math.random decimal into an integer
			int theNumber = (int)(Math.random() * 100 + 1);
			//declare and initiate numberOfGuesses
			int numberOfGuesses = 0;
			//declare and initiate guess variable with value 0
			int myGuess = 0;
			//use while loop for as long as the guess is incorrect
			while (myGuess != theNumber) {
				//prompt user for input (guess)
				System.out.println("Guess a number between 1 and 100:");
				//accept the user input using scanner
				myGuess = in.nextInt();
				//increment the number of tries
				numberOfGuesses++;
				//use an if loop to compare guess against number
				if (myGuess < theNumber) {
					System.out.println(myGuess + " is too low. Try again!");
				} else if (myGuess >theNumber) {
					System.out.println(myGuess + " is too high. Try again!");
				} else {
					System.out.println(myGuess + " is correct. You win!");
					System.out.println("It only took you " + numberOfGuesses + "tries! Good job!");
				}
			} //end of guessing loop
			//OUTSIDE of guessing loop, ask to play again
			System.out.println("Would you like to play again (y/n)?");
			//accept user input, write over (overload) playAgain variable
			playAgain = in.next();
		}
		//compare user input against value y or Y
		//if user input is y or Y, start from do {
		while (playAgain.equalsIgnoreCase("y"));
		//if they enter anything other than y, print goodbye and close
		System.out.println("Thank you for playing! Goodbye.");
		//close the window
		in.close(); 
	}

}

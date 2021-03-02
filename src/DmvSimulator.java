import javax.swing.text.ChangedCharSetException;

public class DmvSimulator {
	public static void main(String[] args) {
		System.out.println("Welcome to the DMV!");
		int personNumber = (int) (Math.random() * 200);
		System.out.println("Please wait for your number to be called. Your number is " + personNumber + ".");
		for (int i = personNumber + 1; i != personNumber; i = (i % 200) + 1) {
			System.out.println("Now helping: " + i);
		}
		System.out.println("Now helping: " + personNumber);
		int percent = (int) (Math.random() * 100);
		if(percent != 0) {
			System.out.println("You do not have all your papers, loser.");
		}
		else {
			System.out.println("Perfect! You have all the required papers!");
		}
	}
}


public class DmvSimulator {
	public static void main(String[] args) {
		System.out.println("Welcome to the DMV!");
		int personNumber = (int) (Math.random() * 200);
		System.out.println("Please wait for your number to be called. Your number is " + personNumber + ".");
		for (int i = personNumber + 1; i != personNumber; i = (i % 200) + 1) {
			System.out.println("Now helping: " + i);
		}
		System.out.println("Now helping: " + personNumber);
		System.out.println("Sorry, you do not have what we need to help you at this time.");

	}
}

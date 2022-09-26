/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card cardOne = new Card("Ace" , "Spades" , 10);
		Card cardTwo = new Card("Two" , "Spades" , 2);
		System.out.println(cardOne.rank());
		System.out.println(cardOne.suit());
		System.out.println(cardOne.pointValue());
		System.out.println(cardTwo.rank());
		System.out.println(cardTwo.suit());
		System.out.println(cardTwo.pointValue());
	}
}

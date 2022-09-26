/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String [] ranks = { "1", "2","3","4","5","6","7","8","10", "jack","queen","king"};
		String [] suits = { "spades", "hearts", "diamonds", "clubs"};
		int[] values = { 2,3,4,5,6,7,8,9,10,10,10,10,1};
		Deck test = new Deck (ranks, suits, values );
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.isEmpty());
	}
}

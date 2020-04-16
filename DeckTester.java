/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
		System.out.println("**** Shuffle Cards ****");
		
		String[] ranks1 = new String[52];
		String[] suits1 = new String[52];
		int[] pointValues1 =new int[52];

		for (int s = 0; s<52; s++) {
			String ranks2 ="";
			String suits2 ="";
			if ((s+1)% 13 == 11) {
				ranks2 = "jack";
			}else if ((s+1)% 13 == 12) {
				ranks2 = "queen";
			} else if ((s+1)% 13 == 0) {
				ranks2 = "king";
			}
			else if  ((s+1)% 13 == 1) {
				ranks2 = "ase";
			} else {
				ranks2 =  Integer.toString((s+1)% 13);
			}

			if (s<13) {
				suits2 = "clubs";
			}else if (s<26) {
				suits2 = "spades";
			} else if (s< 39) {
				suits2 = "hearts";
			} else {
				suits2 = "clubs";
			}
			ranks1 [s]= ranks2;
			suits1 [s]= suits2;
		    pointValues1[s] =((s+1)% 13);
			
		}
		
		Deck c = new Deck(ranks1, suits1, pointValues1);
		System.out.println(c);

	}
}

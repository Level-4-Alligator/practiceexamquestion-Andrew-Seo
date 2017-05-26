import java.util.ArrayList;

/**********************************
 * Texas Hold-em! Your task is to determine if the cards in the list makes up a
 * straight (five cards of sequential rank) or not. The cards will always have
 * values ranging from 2-14, where 14 is the ace.
 * 
 * Be aware that the ace (14) also should count as value 1!
 * 
 * The number of cards will vary, but will never be more than 7 (the board (5) +
 * player hand (2))
 * 
 * Examples:
 * 
 * straight: 9-10-11-12-13
 * 
 * straight: 14-2-3-4-5
 * 
 * straight: 2-7-8-5-10-9-11
 * 
 * not straight: 7-8-12-13-14
 *
 ***********************/
public final class PokerHand {
	public static boolean IsStraight(ArrayList<Integer> cards) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i) == cards.get(0) + 1 || cards.get(i) == cards.get(0) + 2 || cards.get(i) == cards.get(0) + 3
					|| cards.get(i) == cards.get(0) + 4 || cards.get(i) == cards.get(0) + 5
					|| cards.get(i) == cards.get(0) - 1 || cards.get(i) == cards.get(0) - 2
					|| cards.get(i) == cards.get(0) - 3 || cards.get(i) == cards.get(0) - 4
					|| cards.get(i) == cards.get(0) - 5) {
				result.add(i);
			}

			if (result.size() == 5) {
				while (result.get(0) + 1 == result.get(1) && result.get(1) + 1 == result.get(2)
						&& result.get(2) + 1 == result.get(3) && result.get(3) + 1 == result.get(4)
						&& result.get(4) + 1 == result.get(5)) {
					for (int j = 0; j < result.size(); j++) {
						if (result.get(0) < result.get(1)) {
							int x = result.get(0);
							int y = result.get(1);
							result.set(1, x);
							result.set(0, y);
						}
						if (result.get(1) < result.get(2)) {
							int x = result.get(0);
							int y = result.get(1);
							result.set(1, x);
							result.set(0, y);
						}
						if (result.get(3) < result.get(4)) {
							int x = result.get(0);
							int y = result.get(1);
							result.set(1, x);
							result.set(0, y);
						}
						if (result.get(4) < result.get(5)) {
							int x = result.get(0);
							int y = result.get(1);
							result.set(1, x);
							result.set(0, y);
						}
					}
				}
				if (result.get(0) + 1 == result.get(1) && result.get(1) + 1 == result.get(2)
						&& result.get(2) + 1 == result.get(3) && result.get(3) + 1 == result.get(4)
						&& result.get(4) + 1 == result.get(5)) {
					return true;
				}
			}
		}
		return false;
	}
}
/**
 * @author Michal Brewczak
 */
public class ScoreBuilder {
	public static void main(String[] args) {
		int negativeScore = -5;
		int positiveScore = 10;

		if (positiveScore < 0) {
			System.out.println("Score: " + positiveScore + "pts");
		} else {
			System.out.println("Score: +" + positiveScore + "pts");
		}


	}
}

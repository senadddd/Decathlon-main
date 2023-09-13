package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class HeptHightJump {

	private int score;
	private double A = 1.84523;
	private double B = 75;
	private double C = 1.348;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in metres.
	public void calculateResult(double distance) {

		while (active) {

			try {
				// Acceptable values.
				if (distance < 150) {
					System.out.println("Value too low");
					distance = inputResult.enterResult();
				} else if (distance > 350) {

					System.out.println("Value too high");
					distance = inputResult.enterResult();

				} else {

					score = calc.calculateField(A, B, C, distance);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is: " + score);
	}

}

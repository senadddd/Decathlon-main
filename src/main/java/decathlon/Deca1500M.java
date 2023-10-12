package decathlon;

import common.*;

public class Deca1500M {

	private int score;
	private double A = 0.03768;
	private double B = 480;
	private double C = 1.85;
	boolean active = true;

	CalcTrackAndField calc = new CalcTrackAndField();
	InputLongResult inputLongResult = new InputLongResult();

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 164.8) {
					System.out.println("Value too low");
					runningTime = inputLongResult.enterResult();
				} else if (runningTime > 474.11) {
					System.out.println("Value too high");
					runningTime = inputLongResult.enterResult();
				} else {

					score = calc.calculateTrack(A, B, C, runningTime);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is: " + score);

	}

}

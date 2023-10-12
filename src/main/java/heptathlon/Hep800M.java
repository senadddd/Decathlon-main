package heptathlon;

import common.*;

public class Hep800M {

	String classname = "Hepthathlon 800m";
	private int score;
	private double A = 0.11193;
	private double B = 254;
	private double C = 1.88;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputLongResult inputLongResult = new InputLongResult();

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 70) {
					System.out.println("Value too low");
					runningTime = inputLongResult.enterResult(classname);
				} else if (runningTime > 250.79) {
					// competitor gets 1 point in 250.79 sec
					System.out.println("Value too high");
					runningTime = inputLongResult.enterResult(classname);
				} else {
					score = calc.calculateTrack(A, B, C, runningTime);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is " + score);

	}

}

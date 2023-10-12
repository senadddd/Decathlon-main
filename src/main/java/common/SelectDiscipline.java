package common;

import java.util.Scanner;

import decathlon.Deca100M;
import decathlon.Deca1500M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import decathlon.DecaDiscusThrow;
import decathlon.DecaHighJump;
import decathlon.DecaJavelinThrow;
import decathlon.DecaLongJump;
import decathlon.DecaShotPut;
import decathlon.DecaPoleVault;

import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHightJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;

public class SelectDiscipline {

	int disciplineSelected;
	InputLongResult inputLongResult = new InputLongResult();
	InputResult inputResult = new InputResult();
	Scanner sc = new Scanner(System.in);
	Deca100M deca100M = new Deca100M();
	Deca400M deca400M = new Deca400M();
	Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
	Deca1500M deca1500M = new Deca1500M();
	DecaLongJump decaLongJump = new DecaLongJump();
	DecaHighJump highJump = new DecaHighJump();
	DecaDiscusThrow discusThrow = new DecaDiscusThrow();
	DecaShotPut decaShotPut = new DecaShotPut();
	DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
	DecaPoleVault poleVault = new DecaPoleVault();

	Hep200M hep200M = new Hep200M();
	Hep800M hep800M = new Hep800M();
	Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
	HeptHightJump hepHighJump = new HeptHightJump();
	HeptLongJump hepLongJump = new HeptLongJump();
	HeptShotPut hepShotPut = new HeptShotPut();
	HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();
	
	//Receive input	of selection of discipline.

	public void inputSelection() {
		System.out.println("Select discipline.");
		printDisciplines();

		try {

			disciplineSelected = Integer.parseInt(sc.nextLine());
			makeSelection();

		} catch (Exception e) {
			System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
		}

	}

	// Check input of discipline.
	public void makeSelection() {
		switch (disciplineSelected) {
		case 1:
			System.out.println("Decathlon 100m selected.");
			deca100M.calculateResult(inputResult.enterResult("Decathlon 100m"));
			break;
		case 2:
			System.out.println("Decathlon 400m selected.");
			deca400M.calculateResult(inputResult.enterResult("Decathlon 400m"));
			break;
		case 3:
			System.out.println("Decathlon 110m Hurdles selected.");
			deca110MHurdles.calculateResult(inputResult.enterResult("Decathlon 110m Hurdles"));
			break;
		case 4:
			System.out.println("Decathlon 1500m selected.");
			deca1500M.calculateResult(inputLongResult.enterResult("Decathlon 1500m"));
			break;
		case 5:
			System.out.println("Decathlon Long Jump selected.");
			decaLongJump.calculateResult(inputResult.enterResult("Decathlon Long Jump"));
			break;
		case 6:
			System.out.println("Decathlon High Jump selected.");
			highJump.calculateResult(inputResult.enterResult("Decathlon High Jump"));
			break;
		case 7:
			System.out.println("Decathlon Pole Vault selected.");
			poleVault.calculateResult(inputResult.enterResult("Decathlon Pole Vault"));
			break;
		case 8:
			System.out.println("Decathlon Discus Throw selected.");
			discusThrow.calculateResult(inputResult.enterResult("Decathlon Discus Throw"));
			break;
		case 9:
			System.out.println("Decathlon Javelin Throw selected.");
			decaJavelinThrow.calculateResult(inputResult.enterResult("Decathlon Javelin Throw"));
			break;
		case 10:
			System.out.println("Decathlon Shot Put selected.");
			decaShotPut.calculateResult(inputResult.enterResult("Decathlon Shot Put"));
			break;
		case 11:
			System.out.println("Heptathlon 200m selected.");
			hep200M.calculateResult(inputResult.enterResult("Heptathlon 200m"));
			break;
		case 12:
			System.out.println("Heptathlon 800m selected.");
			hep800M.calculateResult(inputLongResult.enterResult("Heptathlon 800m"));
			break;
		case 13:
			System.out.println("Heptathlon 100m Hurdles selected.");
			hep100MHurdles.calculateResult(inputResult.enterResult("Heptathlon 100m"));
			break;
		case 14:
			System.out.println("Heptathlon High Jump selected.");
			hepHighJump.calculateResult(inputResult.enterResult("Heptathlon High Jump"));
			break;
		case 15:
			System.out.println("Heptathlon Long Jump selected.");
			hepLongJump.calculateResult(inputResult.enterResult("Heptathlon Long Jump"));
			break;
		case 16:
			System.out.println("Heptathlon Shot Put selected.");
			hepShotPut.calculateResult(inputResult.enterResult("Heptathlon Shot Put"));
			break;
		case 17:
			System.out.println("Heptathlon Javelin Throw selected.");
			hepJavelinThrow.calculateResult(inputResult.enterResult("Heptathlon Javelin Throw"));
			break;
		default:
			System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
			break;
		}
	}

	// Needs more stuff.
	public void printDisciplines() {
		System.out.println("1. Decathlon 100 meters. (Measured in seconds)");
		System.out.println("2. Decathlon 400 meters. (Measured in seconds)");
		System.out.println("3. Decathlon 110 meters hurdles. (Measured in seconds)");
		System.out.println("4. Decathlon 1500 meters. (Measured in minutes:seconds)");
		System.out.println("5. Decathlon Long Jump. (Measured in centimeters)");
		System.out.println("6. Decathlon High Jump. (Measured in centimeters)");
		System.out.println("7. Decathlon Pole Vault. (Measured in centimeters)");
		System.out.println("8. Decathlon Discus Throw. (Measured in meters)");
		System.out.println("9. Decathlon Javelin Throw. (Measured in meters)");
		System.out.println("10. Decathlon Shot Put. (Measured in meters)");
		System.out.println("11. Heptathlon 200 meters. (Measured in seconds)");
		System.out.println("12. Heptathlon 800 meters. (Measured in minutes:seconds)");
		System.out.println("13. Heptathlon 100 meters hurdles. (Measured in seconds)");
		System.out.println("14. Heptathlon High Jump. (Measured in centimeters)");
		System.out.println("15. Heptathlon Long Jump. (Measured in centimeters)");
		System.out.println("16. Heptathlon Shot Put. (Measured in meters)");
		System.out.println("17. Heptathlon Javelin Throw. (Measured in meters)");
	}

}
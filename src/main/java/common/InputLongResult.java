package common;

import java.util.Scanner;

public class InputLongResult {
    double inputResult = 0;

    public double enterResult(String strInput) {
        Scanner sc = new Scanner(System.in);
        boolean active = true;
        while (active) {
            System.out.println("Please enter the result for " + strInput + ":");
            try {
                String[] input = sc.nextLine().split(":");
                inputResult = (Double.parseDouble(input[0]) * 60) + Double.parseDouble(input[1]);
                active = false;
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");

            }

        }
        return inputResult;
    }

    public double returnResult() {
        return inputResult;
    }
}

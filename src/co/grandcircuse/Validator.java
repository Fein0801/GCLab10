package co.grandcircuse;

import java.util.Scanner;

public class Validator {

    public static double getDouble(Scanner sc, String prompt) {
	double d = 0;
	boolean isValid = false;
	while (isValid == false) {
	    System.out.print(prompt);
	    if (sc.hasNextDouble()) {
		d = sc.nextDouble();
		isValid = true;
	    } else {
		System.out.println("Error! Invalid decimal value. Try again.");
	    }
	    sc.nextLine(); // discard any other data entered on the line
	}
	return d;
    }

}

package co.grandcircuse;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to the circle tester!");
	boolean run = true;
	while (run) {
	    double radius = Validator.getDouble(scan, "Enter a radius: ");
	    Circle circle = new Circle(radius);
	    System.out.println("The circumference is: " + circle.getFormattedCircumference());
	    System.out.println("The area is: " + circle.getFormattedArea());

	    System.out.println();
	    System.out.println("Would you like to continue? (yes/no)");
	    String input = scan.next();
	    while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
		scan.nextLine();
		System.out.println("Would you like to continue? (yes/no)");
		input = scan.next();
	    }

	    if (input.equalsIgnoreCase("no")) {
		run = false;
	    }
	}

	System.out.println("Goodbye.");
	scan.close();
    }

}

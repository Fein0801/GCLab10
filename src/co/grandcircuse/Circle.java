package co.grandcircuse;

public class Circle {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
	setRadius(radius);
    }

    public void setRadius(double radius) {
	if (radius < 0) {
	    System.out.println("Radius must be greater than or equal to 0");
	    return;
	}
	this.radius = radius;
    }

    public double getRadius() {
	return this.radius;
    }

    public double getCircumference() {
	return 2 * Math.PI * radius;
    }

    public double getArea() {
	return Math.PI * radius * radius;
    }

    public String getFormattedCircumference() {
	double circumference = this.getCircumference();
	return formatNumber(circumference);
    }

    public String getFormattedArea() {
	double area = this.getArea();
	return formatNumber(area);
    }

    private static String formatNumber(double x) {
	return String.format("%.2f", x);
    }
}

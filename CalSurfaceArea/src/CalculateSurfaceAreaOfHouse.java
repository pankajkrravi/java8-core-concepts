import java.util.Scanner;

public class CalculateSurfaceAreaOfHouse {

	public static void main(String[] args) {
		double length, width, height;
		double numOfWindow, windowWidth, windowHeight;
		double noOfDoors, doorWidth, doorHeight;
		double surfaceArea;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length , width, and height  of House :");
		length = scanner.nextDouble();
		width = scanner.nextDouble();
		height = scanner.nextDouble();
		System.out.println("please entyer noof window, width and height :");
		numOfWindow = scanner.nextDouble();
		windowWidth = scanner.nextDouble();
		windowHeight = scanner.nextDouble();
		System.out.println("Pleasw enter no of door, width, and height :");
		noOfDoors = scanner.nextDouble();
		doorWidth = scanner.nextDouble();
		doorHeight = scanner.nextDouble();
		surfaceArea = (length * width * 2 + 1 * length * height * 2)
				- (numOfWindow * windowWidth * windowHeight + noOfDoors * doorWidth * doorHeight);
		System.out.println("The total Paintable surface srea : " + surfaceArea);
	}
}

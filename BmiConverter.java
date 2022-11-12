// Hocian Wade Sep 27, 2022 COSC 1046 N - Assignment 1
import java.util.Scanner;

public class BmiConverter{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter weight(lb.) : ");
	    int weightLBS = input.nextInt();
	    System.out.println("Enter height(in.) : ");
	    int heightInch = input.nextInt();
	    
	    double weightKg = weightLBS * 0.45359237; //turns pounds to kliograms
	    double heightMeters = heightInch * 0.0254; // turns inches to meters
	    
	    double bmi = weightKg / (heightMeters * heightMeters);
	    System.out.println("Your BMI is : " + (int)bmi); // Converted to an integer for readability
		input.close();
	}
}
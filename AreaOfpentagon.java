import java.util.Scanner;

public class AreaOfpentagon
{
    public static double area(double side){
        double area = ( (5 * (Math.pow(side, 2) ) ) / ( 4 * (Math.tan((Math.PI) / 5)) ));
        
        return area;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
	    System.out.println("Enter one side of a pentagon -:");
        double pentLength = input.nextDouble();
	    System.out.println("\n");
		System.out.println ("The area of the pentagon is -: " + area(pentLength));
	input.close();
    }
}
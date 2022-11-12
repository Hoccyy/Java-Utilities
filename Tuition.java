public class Tuition
{
	public static void main(String[] args) {
		int tuitionCost = 10000; final double PERCENTAGE = 0.06;
		
		for (int i = 1; i < 11 ; i++){
		    tuitionCost += tuitionCost * PERCENTAGE;
		    System.out.println("Year " + i + " Costs -: $" + tuitionCost + "\n");
		}
		System.out.println("\nUniversity would cost $" + (tuitionCost*4) + " over four years, in a decade.");
	}
}
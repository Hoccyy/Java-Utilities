import java.util.Scanner;
import java.text.DecimalFormat;

public class FutureInvestment {
    public static void InvestmentResults(float a, float b, int c){
        DecimalFormat format = new DecimalFormat("##.00");
        double[] resultYears = new double [6];
        System.out.println("\nYears  " + "FutureValue");
        for (int x = 1; x < (6); x++){
            resultYears[x] = (a * (Math.pow( (1 + (0.1/12)) , (12*x))));
            System.out.println("  " + x + "     " + format.format (resultYears[x]) );
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the investment amount :");
        float principal = input.nextFloat();
        System.out.println("Input the rate of interest :");
        float rate = input.nextFloat();
        System.out.println("Input number of years :");
        int years = input.nextInt();
        //
        InvestmentResults(principal, rate, years);
        input.close();
    }
}
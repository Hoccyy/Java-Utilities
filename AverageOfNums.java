import java.util.Scanner;
import java.text.DecimalFormat;

class Average{
    float averg(float x, float y, float z){
        return ((x+y+z)/3);
    }
}

public class AverageOfNums {
    public static void main(String[] args){
        DecimalFormat format = new DecimalFormat("##.00"); // Change to view more numbers
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        float num1 = input.nextInt();
        System.out.println("Enter a number :");
        float num2 = input.nextInt();
        System.out.println("Enter a number :");
        float num3 = input.nextInt();
        //
        Average avg = new Average();
        System.out.println( format.format(avg.averg(num1, num2, num3)));

        input.close();
    }
}
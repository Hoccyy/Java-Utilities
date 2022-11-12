import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        long factorial = 1;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        for(int x = 1; x <= num; ++x){
            factorial *= x;
        }

        System.out.printf("The Factorial of %d is %d", num, factorial);
    }
}
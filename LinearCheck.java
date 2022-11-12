import java.util.Scanner;

public class LinearCheck{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbersList = new int[11];

        System.out.println("Enter 11 Integers :");
        for (int x = 0; x < 11 ; x++){
            numbersList[x] = input.nextInt();
        }
        for (int y = 0; y < 11 ; y++){
            if (numbersList[y] > numbersList[10]){
                System.out.println("Greater");
            }
            if (numbersList[y] < numbersList[10]){
                System.out.println("Smaller");
            }else{
                System.out.println("Equal");
            }
        }

        input.close();
    }
}
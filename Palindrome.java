import java.util.Scanner;

public class Palindrome {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string or number : ");
        String textVal = input.nextLine(); textVal = textVal.toLowerCase();
        String reversedString = "";

        int a = (textVal.length())-1;

        for (int i = 0; i < textVal.length() ; i++){
            reversedString += textVal.charAt(a);
            a--;
        }
        boolean mode = (textVal.equals(reversedString)); //System.out.println(mode + textVal + " " + reversedString);
        if (mode){
            System.out.println(textVal + " is a palindrome.");
        }else{
            System.out.println(textVal + " is not a palindrome.");
        }
        input.close();
    }

}

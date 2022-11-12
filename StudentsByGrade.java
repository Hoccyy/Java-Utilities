import java.util.Scanner;

public class StudentsByGrade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of students :"); int numOStuds = input.nextInt();
        String[] names = new String[numOStuds];
        int[] grades = new int[numOStuds];
        
        for (int x = 0; x < numOStuds ; x++){
            System.out.println("Enter a Name :");
            names[x] = input.next();
            System.out.println("Enter the grade :");
            grades[x] = input.nextInt();
        }
        for (int y = 0; y < numOStuds; y++){
            for (int z = 0; z < numOStuds-y-1 ; z++){
                if (grades[z] < grades[z+1]){
                    int temp = grades[z];
                    String temp2 = names[z];
                    
                    grades[z] = grades[z+1];
                    names[z] = names[z+1];
                    
                    names[z+1] = temp2;
                    grades[z+1] = temp;
                }
            }
        }
        
        System.out.println("\nNames descending by grade :");
        for (int z = 0; z < numOStuds; z++){
            System.out.println(names[z]);
        }
        input.close();
    }
}
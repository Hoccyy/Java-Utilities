import java.util.Scanner;

class Students{
    String name; int score;
    void getInfo(String nam, int scor){
        name = nam;
        score = scor;
    }
}

public class StudentScores
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("How many students? -:");
		int studCount = input.nextInt();
		
		int students[] = new int[studCount]; int tempCount = studCount;
		String studentsName[] = new String[studCount];
		
		int i = 0;
		while (studCount != 0){
		    studCount--;
		    System.out.println("Enter a name-: "); String n = input.next();
		    System.out.println("Enter score -:"); int s = input.nextInt();
            Students stud = new Students();
            
            stud.getInfo(n, s);
            students[i] = stud.score;
            studentsName[(i)] = stud.name;
            i++;
		}
		
		int highestGrade = students[0];

        for (int y: students) {
            if(highestGrade < y)
                highestGrade = y;
        }
        
        
        for (int d = 0; d < tempCount ; d++){
            if ((students[d]) == highestGrade){
                System.out.println(studentsName[d] + " got the highest score of " + students[d] + ".");
            }
        }
		
	input.close();
	}
	
}

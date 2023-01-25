import java.util.Scanner;

class Timer{
    private int hours; private int minutes; private int seconds; //Private integers
    
    Timer(){ //Default constructor
        hours = 0; minutes = 0; seconds = 0;
    }
    Timer(int h, int m, int s){ //Constructor with parameters
        if(h >= 0){
            hours = h;
        }else{ hours = 0; }
        
        if(m >= 0) {
            minutes = m;
        }else{ minutes = 0; }
        
        if(s >= 0){
        seconds = s;
        }else{ seconds = 0; }
    }
    //Methods to set private integers
    public void setHours(int hrs){
        if(hrs >= 0){
            hours = hrs;
        }else{hours = 0;}
    }
    public void setMins(int mins){
        if (mins >= 0){
            minutes = mins;
        }else{minutes = 0;}
    }
    public void setSecs(int secs){
        if(secs >=0){
            seconds = secs;
        }else{seconds = 0;}
    }
    //Getter methods to get the integers
    public int getHours(){
        return this.hours;
    }
    public int getMins(){
        return this.minutes;
    }
    public int getSecs(){
        return this.seconds;
    }
}

public class Main{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in); String temp; //Creates a scanner object and temporary input holder
        Timer testTimer1 = new Timer(); Timer testTimer2 = new Timer(); Timer testTimer3 = new Timer(); //Instantiates the 3 test objects
       

        //Collects input from the user to set the variables in each object
        System.out.println("Enter the first Timer object: "); temp = input.nextLine();
        testTimer1.setHours( Integer.parseInt(temp.split(" ")[0] )); testTimer1.setMins( Integer.parseInt(temp.split(" ")[1] )); testTimer1.setSecs( Integer.parseInt(temp.split(" ")[2] ));
       
        System.out.println("Enter the second Timer object: "); temp = input.nextLine();
        testTimer2.setHours( Integer.parseInt(temp.split(" ")[0] )); testTimer2.setMins( Integer.parseInt(temp.split(" ")[1] )); testTimer2.setSecs( Integer.parseInt(temp.split(" ")[2] ));
       
        System.out.println("Enter the third Timer object: "); temp = input.nextLine();
        testTimer3.setHours( Integer.parseInt(temp.split(" ")[0] )); testTimer3.setMins( Integer.parseInt(temp.split(" ")[1] )); testTimer3.setSecs( Integer.parseInt(temp.split(" ")[2] ));


        System.out.println("The total number of hours is " + (testTimer1.getHours() + testTimer2.getHours() + testTimer3.getHours()));
        System.out.println("The total number of minutes is " + (testTimer1.getMins() + testTimer2.getMins() + testTimer3.getMins()));
        System.out.println("The total number of seconds is " + (testTimer1.getSecs() + testTimer2.getSecs() + testTimer3.getSecs()));
        input.close(); //Closes the scanner could be moved to line 66 if necessary for efficiency
    }
}
public class Fibonacci{
    public static void main (String args[]){
        int num = 7;
        int a = 0; int b = 1; int sum = 0;
        
        String sequence = "";

        for (int x = 0; x < num ; x++){
            sequence += sum + ", ";
            a = b;
            b = sum;
            sum = a + b;
        }
        System.out.println("Fibonacci Sequence : " + sequence);
    }
}
//By Hoccyy

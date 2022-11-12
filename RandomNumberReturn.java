public class RandomNumberReturn {
    public static int getRandom(int... numbers){
        int randIndex = (int)Math.floor(Math.random() * 5); System.out.println("Index: " + randIndex);
        
        return ( numbers[randIndex] );
    }

    public static void main (String[] args){
        int[] numbers = {33, 96, 33, 45, 21};

        System.out.println("Number: " + getRandom(numbers));
    }
}
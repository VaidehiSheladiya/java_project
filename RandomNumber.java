import java.util.Random;
import java.util.Scanner;
 //  ******   Task 2: NUMBER GUESSING GAME  COMPLETE  *******

public class  RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name?");
        String Name = sc.nextLine();
        System.out.println(" well," + Name + ", I am thinking of a number 1 to 20");
        int myNumber= getRandomNumber(1,21);
        for( int i=0; i<6; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Take a guess.");
            int yourGuess= scan2.nextInt();
            if(yourGuess==myNumber){
                System.out.println("your guessed correctly!");
                break;}
            else if (yourGuess<myNumber) {
                System.out.println("your guess to low!");
            }
            else if (yourGuess>myNumber){
                System.out.println("your guess to high!");
            }
            if(i>=5){
                System.out.println();
                System.out.println("Nope. The Number I was thinking of was " + myNumber + "!");
            }
        }

    }
    public static int getRandomNumber(int min, int max){
        Random random= new Random();
        return  random.ints(min,max).findFirst().getAsInt();
    }
}

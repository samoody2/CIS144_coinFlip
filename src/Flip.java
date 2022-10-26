import java.util.Scanner;
import java.util.Random;
public class Flip {
    static int heads;
    static int tails;

    public Flip() {
        heads = 0;
        tails = 0;
    }

    public static void main(String[] args) {
        int headsNumber = heads;
        int tailsNumber = tails;
        coinFlipper(headsNumber, tailsNumber);
    }

    public static void coinFlipper(int headsNumber, int tailsNumber){
        System.out.println("How many coin flips would you like to do?");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 0; i < input; i++) {
            Random rand = new Random();
            int coinFlip = rand.nextInt(2);
            if (coinFlip == 1) {
                tailsNumber++;
            } else {
                headsNumber++;
            }
        }
        System.out.println("Total Heads: "+headsNumber +" Total Tails: "+tailsNumber);
        if(tailsNumber > headsNumber)
        {
            System.out.println("Tails won!");
        } else
        {
            if (tailsNumber == headsNumber) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Heads won!");
            }
        }
    }
}
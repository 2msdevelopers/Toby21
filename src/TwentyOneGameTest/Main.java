package TwentyOneGameTest;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

// Obtain a number between [0 - 52].
        int n = rand.nextInt(11);

// Add 1 to the result to get a number from the required range
// (i.e., [1 - 50]).
        n += 1;

        Random rand2 = new Random();

// Obtain a number between [0 - 52].
        int n2 = rand2.nextInt(11);

// Add 1 to the result to get a number from the required range
// (i.e., [1 - 50]).
        n2 += 1;

        Random rand3 = new Random();

// Obtain a number between [0 - 52].
        int n3 = rand.nextInt(11);

// Add 1 to the result to get a number from the required range
// (i.e., [1 - 50]).
        n3 += 1;

        System.out.println("Your First Card = " + n);
        System.out.println("Your Second Card = " + n2);
        System.out.println("Total = " + (n + n2));

        if (n + n2 < 21)
            System.out.println("Your Third Card = " + n3);
            System.out.println("New Total = " + (n + n2 + n3));


        if (n + n2 == 21)
        System.out.println("You Win");
        else
            System.out.println("You Lose");

        //if total = 21
           // System.out.println("You Win");

    }
}

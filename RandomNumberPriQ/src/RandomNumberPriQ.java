
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

import ch09.priorityQueues.HeapPriQ;
import ch09.priorityQueues.PriQueueInterface;

/**
 * Program By: Kurtis Yoder
 * This program is used to generate random numbers
 * from a specific range then output those numbers
 * in both ascending and descending order.
 * The program uses a heap to store the random numbers.
 *
 */

public class RandomNumberPriQ {

    private static int number, max, minimum, randInt, i;
    private static int arrayHold[];
    private static boolean accepted;
    private static Scanner key;

    public static void main(String[] args) {

        System.out.println(
                "This program is used to generate random numbers" 
               + " from a range of numbers given by the user.");
        System.out.println("Please enter an integer that specifies how many" 
               + " numbers you would"
               + " like to randomly generate: ");

        while (!accepted) {
            try {
                key = new Scanner(System.in);
                number = key.nextInt();
                if (number <= 0) {
                    System.out.println("Your number must be" 
                            + " atleast equal to or greater than"
                            + " 0 in order for the program" 
                            + " to produce any random numbers");
                    System.out.print("Please re-enter an integer: ");
                } else
                    accepted = true;

            } catch (NumberFormatException e) {
                System.out.print("You did not enter an integer." 
                        + " Please enter an integer: ");
            } catch (InputMismatchException e) {
                System.out.print("You did not enter an integer." 
                        + " Please enter an integer:");
            }
        }

        System.out.println("Enter an integer for the minimum range: ");

        accepted = false;
        while (!accepted) {
            try {
                key = new Scanner(System.in);
                minimum = key.nextInt();
                accepted = true;
            } catch (NumberFormatException e) {
                System.out.println("You did not enter an integer." 
                        + " Please enter an integer: ");
            } catch (InputMismatchException e) {
                System.out.println("You did not enter an integer." 
                        + " Please enter an integer: ");
            }
        }

        System.out.println("Enter an integer for the maximum range: ");

        accepted = false;
        while (!accepted) {
            try {
                key = new Scanner(System.in);
                max = key.nextInt();
                if (max < minimum) {
                    System.out.println("Your maximum number must be" 
                            + " atleast equal to or greater than"
                            + " the minimum number specified previously");
                    System.out.println("Please re-enter an integer: ");
                } else
                    accepted = true;
            } catch (NumberFormatException e) {
                System.out.println("You did not enter an integer." 
                        + " Please enter an integer.");
            } catch (InputMismatchException e) {
                System.out.println("You did not enter an integer." 
                        + " Please enter an integer.");
            }
        }

        PriQueueInterface<Integer> randHeap = new HeapPriQ<Integer>(number);
        arrayHold = new int[number];

        for (i = 0; i < number; i++) {
            Random randNums = new Random();
            randInt = randNums.nextInt((max + 1) - minimum) + minimum;
            randHeap.enqueue(randInt);
        }

        for (i = 0; i < number; i++) {
            arrayHold[i] = randHeap.dequeue();
            System.out.format("%8d", arrayHold[i]);
            if (i % 5 == 4)
                System.out.println();
        }
        
        if(number<5)
            System.out.println();
        
        System.out.println();

        int count = 0;
        for (i = (number - 1); i >= 0; i--) {
            System.out.format("%8d", arrayHold[i]);
            if (count % 5 == 4)
                System.out.println();

            count++;
        }

    }

}

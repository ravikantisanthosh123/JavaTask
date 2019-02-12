package com.stackroute.unittest;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 100: ");
        int number = sc.nextInt();
        int guessNumber;
        boolean guessed = false;
        while(!guessed)
        {
            System.out.println("Enter Your Guess: ");
            guessNumber = sc.nextInt();
            if(guessNumber>number)
                System.out.println("Number guessed is more than original number\n");
            else if(guessNumber<number)
                System.out.println("Number guessed is less than original number\n");
            else if(guessNumber == number)
            {
                System.out.println("Congratulations! Number guessed is same as original number");
                guessed = true;
            }
        }
    }
}
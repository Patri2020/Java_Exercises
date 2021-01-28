package com.tts;

import java.util.Scanner;

public class AndOrExercise {
    public static void main(String[] args) {

        Scanner pcInput = new Scanner(System.in);
        int chosenNumber = 69;

        System.out.println("Guess what number I've chosen between 1 and 100?");

        int theirNumber = Integer.parseInt(pcInput.nextLine());

        if (theirNumber == chosenNumber)
        {
            System.out.printf("WOW! Yes, you guessed right! Great Job on the 1st try!\n");
            System.exit(0);
        }
            else
                if ((theirNumber != chosenNumber) && (theirNumber-chosenNumber>0) && (theirNumber-chosenNumber<=5))
                {
                System.out.printf("Pretty Close!");
                }
            else {
                System.out.printf("Nope!\n");
                }
    }
}

package com.tts;

import java.util.Scanner;

public class IfElseActivities {
    public static void main(String[] args) {

        Scanner pcInput = new Scanner(System.in);
        int chosenNumber = 8;

        System.out.println("Guess what number I've chosen between 1 and 10?");

        int theirNumber = Integer.parseInt(pcInput.nextLine());

        if (theirNumber == chosenNumber) {
            System.out.printf("WOW! Yes, you guessed right! Great Job on the 1st try!\n");
            System.exit(0);
        } else {
            System.out.printf("Nope! Guess Again? I'll give you 2 more chances, sike!\n");
        }
    }
}
//            System.out.println("Guess what number I've chosen between 1 and 10?");
//            String inputNumber = pcInput.nextLine();
//
//                if (theirNumber == chosenNumber) {
//                    System.out.printf("WOW! Yes, you guessed right! Good job on the 2nd try!\n");
//                    System.exit(0);
//                } else
//                    {
//                    System.out.printf("Nope! Final chance.\n");
//                    System.out.println("Guess what number I've chosen between 1 and 10?");
//                    String pcNumber = pcInput.nextLine();
//
//                        if (theirNumber == chosenNumber) {
//                            System.out.printf("WOW! Yes, you guessed right! Nicely done on your final try!\n");
//                            System.exit(0);
//                        } else {
//                            System.out.printf("Nope! Looks like today is not your lucky day.\n");
//                    }
//                }
//            }
//        }
//}
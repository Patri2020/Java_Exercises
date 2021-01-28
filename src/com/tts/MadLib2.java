package com.tts;

import java.util.Scanner;

public class MadLib2 {
    public static void main(String[] args){

        Scanner ageInput = new Scanner(System.in);
        int ageLimit = 18;

        System.out.println("How old are you?");

        int age = Integer.parseInt(ageInput.nextLine());


        if (age < ageLimit){
            System.out.printf("You are too young! Sorry!\n");
            System.exit(0);
        } else {

            Scanner otherInput = new Scanner(System.in);
            System.out.println("Enter a name: ");
            String name = otherInput.nextLine();
            System.out.println("Give me an adjective: ");
            String adjective = otherInput.nextLine();
            System.out.println("Give me a verb: ");
            String verbOne = otherInput.nextLine();
            System.out.println("Give me another verb: ");
            String verbTwo = otherInput.nextLine();
            System.out.println("Give me a number: ");
            String number = otherInput.nextLine();
            System.out.println("Give me your name: ");
            String yourName = otherInput.nextLine();

            System.out.printf("Here is your story: \n");
            System.out.printf("\n Dear %s,", name);
            System.out.printf("\n You are extremely %s and I want to %s you!", adjective, verbOne);
            System.out.printf("\n I want to %s you %s times.", verbTwo, number);
            System.out.printf("\n Sincerely, %s \n", yourName);

        }
    }

}

package com.tts;

import java.util.*;

public class StringsExercise_Animals {
    public static void main(String[] args) {
//        String frog = "ribbit, ribbit";
//        String dog = "woof, woof, woof";
//        String cat = "mmmeeeaaaoooww";
//        String cow = "mmmmooooooo";
//        String bird = "chirp, chirp, chirp";
//        String duck = "quack, quack";
//        String owl = "wwwhhhooo, wwwhhhooo";
//        String monkey = "woah, woah, woah";
//        String lion = "rrroooaaarrr";
//        String tiger = "rrroooaaarrr";

        Scanner animalInput = new Scanner(System.in);

        System.out.println("Tell me the first animal that comes to your mind, and I'll tell you their sound.");
        String animal = animalInput.nextLine();

        if (animal.contains("frog")) {
            System.out.println("ribbit, ribbit");}
            else if (animal.contains("dog")) {
                    System.out.println("woof, woof, woof");}
                    else if (animal.contains("cat")) {
                        System.out.println("mmmeeeaaaoooww");}
                        else if (animal.contains("cow")) {
                            System.out.println("mmmmooooooo");}
                            else if (animal.contains("duck")) {
                                System.out.println("quack, quack");}
                                else if (animal.contains("owl")) {
                                    System.out.println("wwwhhhooo, wwwhhhooo");}
                                    else if (animal.contains("lion")) {
                                        System.out.println("rrroooaaarrr");}
            else {
                System.out.println("Not sure on that one, you tell me, what sound does that animal make.");
            }
    }
}

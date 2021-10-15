package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is MaxoBot.\nI was created in 2021.\nPlease, remind me your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = input.nextInt();
        int remainder5 = input.nextInt();
        int remainder7 = input.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num1 = input.nextInt();
        for (int i = 0; i < num1 + 1; i++) {
            System.out.println(i + " !");
        }
        System.out.println("\nTEST");
        int test = 0;
        while (test != 2) {
            System.out.println("\nWhat year did Java appear?");
            System.out.println("1. 1994\n2. 1995\n3. 1996\n4. 1997");
            do {
                test = input.nextInt();
                if ((test < 1) || (test > 4)) {
                    System.out.println("\nEnter from 1 to 4.");
                }
            } while (test < 1 || test > 4);
            if (test != 2) {
                System.out.println("Please, try again.");
            }
        }
        System.out.println("Great, you right!");
    }
}

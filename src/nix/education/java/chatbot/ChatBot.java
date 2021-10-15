package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
    System.out.println("Hello! My name is MaxoBot.\nI was created in 2021.\nPlease, remind me your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}

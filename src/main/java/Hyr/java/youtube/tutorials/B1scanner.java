package Hyr.java.youtube.tutorials;

import java.util.Scanner;

//Reading User Input from Console
//Reading Data from Files
//Reading Data from Strings
//Tokenizing Input:
//nextLine(): Reads a line of text.
class B1scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Hey %s, How are you?\n", name);
        String status = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("Thank you for the information.");

        scanner.close();
    }
}
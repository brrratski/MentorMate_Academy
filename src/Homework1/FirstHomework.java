package Homework1;

import java.util.Scanner;

public class FirstHomework {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter your middle name:");
        String middleName = scan.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        System.out.printf("Hello %s %s %s!", firstName, middleName, lastName);
    }
}

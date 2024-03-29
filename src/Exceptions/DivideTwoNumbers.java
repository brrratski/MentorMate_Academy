package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1,b = 1;
        try{
            System.out.println("Enter number one:");
            a = scan.nextInt();
            System.out.println("Enter number two:");
            b = scan.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("Not a integer number!");
            throw new InputMismatchException();
        }

        try{
            System.out.println("Final result is: " + a/b);
        }catch (ArithmeticException ae){
            System.out.println("Divide by zero is forbidden!");
        }
    }
}
package Homework1;



import java.util.Scanner;

public class FirstHomeworkTask5 {

    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner scan = new Scanner(System.in);

        double square = scan.nextDouble();
        double squareRoot = Math.sqrt(square);

        System.out.printf("The square root is: %.2f" ,squareRoot);


    }
}
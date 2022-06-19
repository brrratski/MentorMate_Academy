package Methods;

import java.util.Scanner;

public class MiddleChar {


    static void displayMiddleCharOdd(){

    }
    static void displayMiddleCharEven(){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        if(text.length() % 2 == 0){
            //even
            displayMiddleCharEven();
        }else{
            //odd
            displayMiddleCharOdd();
        }
    }

}
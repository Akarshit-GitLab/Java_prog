package Challange;

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number  = ");
        int a = input.nextInt();
        if(a<0){
            System.out.println(" Number is negative");
        } else if (a>0) {
            System.out.println("number is positive");

        } else if (a == 0) {
            System.out.println(" Number is Zero ");
        } else {
            System.out.println(" Error please re-enter ");
        }


    }
}

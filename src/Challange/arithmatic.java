package Challange;

import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a = ");
        double a = input.nextDouble();
        System.out.print("enter b = ");
        double b = input.nextDouble();
        System.out.println("Addition of a and b = " +(a+b));
        System.out.println("substraction of a and b = "+(a-b));
        System.out.println("Multiplication of a and b = " +(a*b));
        System.out.println("division of a and b = "+(a/b) );

    }
}

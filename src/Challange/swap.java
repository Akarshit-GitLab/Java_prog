package Challange;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = input.nextInt();
        System.out.print("enter b = ");

        int b = input.nextInt();
         System.out.println("Before swap a = " +a+" b = " + b);
          int tempo =a;
         a = b;
         b = tempo;
        System.out.println("After  swap a = " +a+" b = " + b);
    }
}

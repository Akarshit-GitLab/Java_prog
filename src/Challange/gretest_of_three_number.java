package Challange;

import java.util.Scanner;

public class gretest_of_three_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = input.nextInt();
        System.out.print("enter b = ");
        int b = input.nextInt();
        System.out.print("enter c = ");
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater ");
        } else if (b>a && b>c) {
            System.out.println("B is greater");

        }
        else if (c>a && c>b) {
            System.out.println("C is greater");

        }
    }
}

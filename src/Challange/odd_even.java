package Challange;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number  = ");
        int a = input.nextInt();
        if(a%2 == 0){
            System.out.println("it is even");
        } else if (a%2 != 0) {
            System.out.println("it is odd");
        }

        else{
            System.out.println("error");
        }
    }
}

package Challange;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter year = ");
        int year = input.nextInt();
        if(year%4 ==0 || year%400 ==0){
            System.out.println("it is leap year");
        }
        else {
            System.out.println("it is not a leap year");
        }

    }
}

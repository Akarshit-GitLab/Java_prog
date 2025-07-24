package Challange;

import java.util.Scanner;

public class parameter_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length = ");
        int l = input.nextInt();
        System.out.print("enter breath = ");
        int b = input.nextInt();
        float parameter = 2*(l+b);
        System.out.println(" Parameter of rectangle = " +parameter);

    }
}

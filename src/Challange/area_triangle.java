package Challange;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter base = ");
        double base = input.nextDouble();
        System.out.print("enter height = ");
        double height = input.nextDouble();
        double area = 0.5*base*height;
        System.out.println("Area of triangle = "+ area);
    }
}

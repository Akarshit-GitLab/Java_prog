package Challange;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter marks of physics = ");
        int phy = input.nextInt();
        System.out.print("enter marks of chemistry = ");
        int chem = input.nextInt();
        System.out.print("enter marks of mathematics = ");
        int math = input.nextInt();
        int sum = phy +chem +math;
        int percentage = sum/3;
        if (percentage >=90){
            System.out.println("your grade is A");
        } else if (percentage >=75) {
            System.out.println("your grade is B");
        }else if (percentage >=60) {
            System.out.println("your grade is B");
        }else if (percentage >30) {
            System.out.println("your grade is B");
        }else if (percentage < 30) {
            System.out.println("your grade is B");
        }
    }
}

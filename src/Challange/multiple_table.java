package Challange;

import java.sql.SQLOutput;
import java.util.Scanner;

public class multiple_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = input.nextInt();
        int i = 1;
        while(i <=10){
            System.out.println(n + "X" + i +" = " + n*i);
            i++ ;
        }
    }
}

package Challange;

import java.util.Scanner;

public class odd_sum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("enter the n number  = ");
        int n = input.nextInt();
        int i =1;
        int sum = 0;

        while(i<=n){
            if(i%2 != 0){
                sum += i;
            }
            i++;

        }
        System.out.print("sum of all odd number = "+sum);
    }
}

package Challange;


import java.util.Scanner;

public class factorial {

    public static int fact(int n){
        int facto =1;
        int i =1;
        while(i <=n){
            facto *= i ;
            i++;
        }
        return facto;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = input.nextInt();
        int result = fact(num);
        System.out.print("factorial of number = " + result);

    }
}

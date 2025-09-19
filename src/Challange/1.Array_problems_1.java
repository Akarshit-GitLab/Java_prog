package Challange;

import java.util.Scanner;

//        Create a program to find the sum and avg of all elements in an array
 class Array_problems_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to sum and average ");
        int[] numArray = ArrayUtility.inputArray();
        long sum =sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of array = "+ sum);
        System.out.println("average of array = " + avg);

    }
    public static long sum (int[] numArray){
        long sum = 0;
        int i =0;
        while (i < numArray.length ){
            sum += numArray[i];
            i++;
        }

        return sum;
    }
    public static double average (int[] numArray){
        double sum =sum(numArray);

        return (double) (sum/numArray.length);
    }
}

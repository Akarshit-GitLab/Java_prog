package Challange;

import java.util.Scanner;

// create a program to find number of occurance  of an element in an array
 class Array_problems_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Occurance ");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Now Enter the number you want ot find : ");
        int num = input.nextInt();
        int occurances = noOfOccurance(numArray,num);
        System.out.println("you number found in array "+ occurances + " times");

    }
    public static int noOfOccurance(int[] numArray,int num){
        int occ =0;
        int i =0;
        while (i < numArray.length){
            if(numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;

    }

}

package Challange;

import java.util.Scanner;

//----------> CREATE A PROGRAM TO FIND MAXIMUM AND MINIMUM ELEMENT IN AN ARRAY <---------
 class MaxMinArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to thr min and max ");
         int[] numArray = ArrayUtility.inputArray();
         int mini = min(numArray);
         System.out.println("Minimun value of the array : " + mini);
         int max = max(numArray);
         System.out.println("Maximum value of the array : " + max);



     }
     public static int min(int[] numArray){
         int min = Integer.MAX_VALUE;
         int i =0;
         while(i < numArray.length){
             if(min > numArray[i]){
                 min = numArray[i];
             }
             i++;
         }
         return min;
     }
     public static int max(int[] numArray) {
         int i = 0;
         int max = numArray[0];
         while (i < numArray.length) {
             if (numArray.length == 0) {
                 return Integer.MIN_VALUE;

             }

             if (max < numArray[i]) {
                 max = numArray[i];
             }
             i++;
         }
         return max;


     }
}

package Challange;

import java.sql.SQLOutput;

class IsSortedArray {
     public static void main(String[] args) {
         System.out.println("Welcome to array Sorting Checkpost ");
         int[] numArray = ArrayUtility.inputArray();
         boolean IsInc = isdecreasing(numArray);
         boolean IsDec = isIncreasing(numArray);
         if(IsInc || IsDec ){
             System.out.println("Your Array is sorted ");
         }
         else {
             System.out.println("Your Array is not sorted ");
         }



     }
     public static boolean isdecreasing(int[] numArray){
         int i =1;
         while (i < numArray.length){
             if(numArray[i] > numArray[i -1]){
                 return false;
             }
             i++;
         }
         return true;
     }
     public static boolean isIncreasing(int[] numArray){
         int i =1;
         while (i < numArray.length){
             if(numArray[i] < numArray[i -1]){
                 return false;
             }
             i++;
         }
         return true;
     }

 }

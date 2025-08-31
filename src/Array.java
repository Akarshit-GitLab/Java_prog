import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] arr = new int[3][3];
//        ----------Traversal--------------
        int i =0;
        while(i < arr.length){
            int j =0;
            while(j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;

            }
            i++;
            System.out.println();
        }
    }
}

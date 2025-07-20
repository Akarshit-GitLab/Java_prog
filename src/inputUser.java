import java.util.Scanner;

public class inputUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.print("HI " + name + " Enter your age sir ");
        int age = input.nextInt();

}
}
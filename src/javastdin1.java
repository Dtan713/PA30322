import java.util.Scanner;

public class javastdin1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
    }
}







package comp127.ScannerDemo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // ONE SCANNER PER PROGRAM
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type an integer: ");
        int cents = scanner.nextInt();
        // nextLine to clear the buffer!
        scanner.nextLine();

        // if you add a string and an integer a string will be the result
        System.out.println("here is my integer: " + cents);

        System.out.println("please type a string: ");        
        String nextLine = scanner.nextLine();
        System.out.println("Here is my string: " + nextLine);

        scanner.close();
    }
}

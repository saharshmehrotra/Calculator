import java.io.*;
import java.util.*;

// Class to handle user input
class UserInput {

    // Method to get user's choice
    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Choice:");
        int input = scanner.nextInt();
        return input;
    }

    // Method to get a single integer input from the user
    public static int num() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    // Method to get an array of 5 integers from the user
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 Elements for the Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

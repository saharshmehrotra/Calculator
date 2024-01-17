import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Arrays;

// Class to perform various mathematical operations
class Calculator {

    // Method to perform addition of two numbers
    public static void addition() {
        UserInput input = new UserInput();
        System.out.println("Enter First Number: ");
        int num1 = input.num();
        System.out.println("Enter Second Number: ");
        int num2 = input.num();
        int add = num1 + num2;
        System.out.println("The Sum of " + num1 + " and " + num2 + " is: " + add);
    }

    // Method to perform subtraction of two numbers
    public static void subtraction() {
        UserInput input = new UserInput();
        System.out.println("Enter First Number: ");
        int num1 = input.num();
        System.out.println("Enter Second Number: ");
        int num2 = input.num();
        int sub = num1 - num2;
        System.out.println("The Subtraction of " + num2 + " from " + num1 + " is: " + sub);
    }

    // Method to perform multiplication of two numbers
    public static void multiplication() {
        UserInput input = new UserInput();
        System.out.println("Enter First Number: ");
        int num1 = input.num();
        System.out.println("Enter Second Number: ");
        int num2 = input.num();
        int mul = num1 * num2;
        System.out.println("The Multiplication of " + num1 + " and " + num2 + " is: " + mul);
    }

    // Method to perform division of two numbers
    public static void division() {
        UserInput input = new UserInput();
        System.out.println("Enter First Number: ");
        int num1 = input.num();
        System.out.println("Enter Second Number: ");
        int num2 = input.num();
        int div = num1 / num2;
        System.out.println("The Division of " + num1 + " by " + num2 + " is: " + div);
    }

    // Method to calculate the sum of elements in an array
    public static void sumOfArray() {
        UserInput input = new UserInput();
        int[] array = input.inputArray();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + array[i];
        }
        System.out.println("The Sum of the Array is: " + sum);
    }

    // Method to calculate the mean of elements in an array
    public static void meanOfArray() {
        UserInput input = new UserInput();
        int[] array = input.inputArray();
        int sum = 0;
        int mean;
        for (int i = 0; i < 5; i++) {
            sum = sum + array[i];
        }
        mean = sum / 5;
        System.out.println("The Mean of the Array is: " + mean);
    }

    // Method to calculate the mode of elements in an array
    public static void modeOfArray() {
        UserInput input = new UserInput();
        int[] array = input.inputArray();
        int mode = 0;
        int maxValue = 0, maxCount = 0, i, j;
        for (i = 0; i < 5; ++i) {
            int count = 0;
            for (j = 0; j < 5; ++j) {
                if (array[j] == array[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }
        System.out.println("The Mode of the Array is: " + maxValue);
    }

    // Method to calculate the median of elements in an array
    public static void medianOfArray() {
        UserInput input = new UserInput();
        int[] array = input.inputArray();
        Arrays.sort(array);
        int median = 0;
        median = array[2];
        System.out.println("The Median of the Array is: " + median);
    }

    // Method to calculate the variance of elements in an array
    public static void varianceOfArray() {
        UserInput input = new UserInput();
        int[] array = input.inputArray();
        int mean = 0;
        for (int i = 0; i < 5; i++) {
            mean = mean + array[i];
        }
        mean = mean / 5;
        int deviation = 0;
        int temp;
        for (int i = 0; i < 5; i++) {
            temp = array[i] - mean;
            deviation = deviation + (temp * temp);
        }
        int variance = deviation / 5;
        System.out.println("The Variance of the Array is: " + variance);
    }

    // Method to calculate the standard deviation of elements in an array
    public static void stdDevOfArray() {
        UserInput input = new UserInput();
        int[] array = input.inputArray();
        int mean = 0;
        for (int i = 0; i < 5; i++) {
            mean = mean + array[i];
        }
        mean = mean / 5;
        double deviation = 0;
        int temp;
        for (int i = 0; i < 5; i++) {
            temp = array[i] - mean;
            deviation = deviation + (temp * temp);
        }
        double variance = deviation / 5;
        double stddev = Math.sqrt(variance);
        System.out.println("The Standard Deviation of the Array is: " + stddev);
    }
}

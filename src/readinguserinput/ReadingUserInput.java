package readinguserinput;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        readingUserInputDataChallenge();
    }

    public static void readingUserInputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = sc.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = sc.nextInt();
            sc.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");

            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        sc.close();
    }

    public static void readingUserInputDataChallenge() {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid number");
                sc.nextInt();
            }
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("Negative numbers not allowed!");
            } else {
                counter++;
                sum += number;
            }
            sc.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        sc.close();
    }
}

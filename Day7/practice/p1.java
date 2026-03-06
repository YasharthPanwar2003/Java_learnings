package Day7.practice;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question 1: Positive Number Check
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive number");
        }

        // Question 2: Even or Odd
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        // Question 3: Voting Eligibility
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {                        // >= 18, not > 18
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible");
        }

        // Question 4: Greater of Two Numbers
        System.out.print("Enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        }
        else if (num2 > num1) {
            System.out.println(num2 + " is greater");
        }
        else {
            System.out.println("Both are equal");
        }

        // Question 5: Temperature Category
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp < 10) {
            System.out.println("Very Cold");
        }
        else if (temp >= 10 && temp < 25) {
            System.out.println("Moderate");
        }
        else {
            System.out.println("Hot");
        }

        // Question 6: Student Grade Calculator
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 60) {
            System.out.println("Grade C");
        }
        else if (marks >= 40) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }

        // Question 7: Largest of Three Numbers
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Largest number is " + n1);
        }
        else if (n2 >= n3) {
            System.out.println("Largest number is " + n2);
        }
        else {
            System.out.println("Largest number is " + n3);
        }

        // Question 8: Number Sign Check
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Positive number");
        }
        else if (n == 0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Negative number");
        }

        // Question 9: Day of Week (switch)
        System.out.print("Enter week day number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }

        // Question 10: Simple Calculator (switch)
        System.out.print("Enter first number: ");
        double op1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double op2 = sc.nextDouble();
        switch (op) {
            case '+':
                System.out.println("Result = " + (op1 + op2));
                break;
            case '-':
                System.out.println("Result = " + (op1 - op2));
                break;
            case '*':
                System.out.println("Result = " + (op1 * op2));
                break;
            case '/':
                System.out.println("Result = " + (op1 / op2));
                break;
            case '%':
                System.out.println("Result = " + (op1 % op2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        // Bonus: Leap Year Check
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean b = (year % 4 == 0) && (year % 100 != 0);
        if ((year % 400 == 0) || b) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }

        sc.close();
    }
}
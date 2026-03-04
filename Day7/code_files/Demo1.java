package Day7.code_files;

public class Demo1 {
    public static void main(String[] args) {

        // ── Normal if ──
        int i = 7;

        if (i > 5 && i < 10) {
            System.out.println("i is greater than 5");
        } else {
            System.out.println("i is less than or equal to 5");
        }

        if (i % 2 == 0) {
            System.out.println("i is even");
        } else {
            System.out.println("i is odd");
        }

        // ── Nested if ──
        if (i > 5) {
            if (i < 10) {
                if (i == 7) {
                    System.out.println("i is exactly 7");
                }
            } else {
                System.out.println("i is >= 10");
            }
        } else {
            System.out.println("i is <= 5");
        }

        // same nested condition using &&
        if (i > 5 && i < 10) {
            System.out.println("i is between 5 and 10");
        }

        // ── if-else-if ladder ──
        boolean b = true;

        if (i == 5) {
            System.out.println("i is 5");
        } else if (i == 6) {
            System.out.println("i is 6");
        } else if (i == 7) {
            System.out.println("i is 7");
        } else if (i == 8) {
            System.out.println("i is 8");
        } else if (i == 9) {
            System.out.println("i is 9");
        }

        // ── Multiple independent ifs (all evaluated, no else-if chaining) ──
        int age = 50;

        if (age > 80) {
            System.out.println("You are very old");
        }
        if (age > 60) {
            System.out.println("You are old");
        }
        if (age > 40) {
            System.out.println("You are becoming old");
        }
        if (age > 20) {
            System.out.println("You are young");
        } else {
            System.out.println("You are a child");
        }
    }
}
package Day6;

/**
 * Demo4 - Logical Operators in Java
 *
 * Operators : && (AND), || (OR), ! (NOT)
 * Output    : always a boolean → true or false
 *
 * Key concept → SHORT-CIRCUIT EVALUATION:
 *   &&  : If the LEFT side is false, the RIGHT side is NOT evaluated.
 *         (Because false AND anything = false)
 *   ||  : If the LEFT side is true,  the RIGHT side is NOT evaluated.
 *         (Because true OR anything = true)
 */
public class Demo4 {

    public static void main(String[] args) {

        int a = 25;
        int b = 10;
        int c = 15;

        // ─────────────────────────────────────────────────────────
        // && (Logical AND) — both conditions must be true
        //   (a < b) → 25 < 10 → false
        //   Since left side is false, RIGHT SIDE IS SKIPPED (short-circuit)
        //   Result → false
        // ─────────────────────────────────────────────────────────
        boolean d = (a < b) && (b < c);
        System.out.println(d);   // Output: false

        // ─────────────────────────────────────────────────────────
        // || (Logical OR) — at least one condition must be true
        //   (a < b) → 25 < 10 → false
        //   Left side is false, so RIGHT SIDE IS EVALUATED
        //   (b < c) → 10 < 15 → true
        //   Result → true
        // ─────────────────────────────────────────────────────────
        boolean e = (a < b) || (b < c);
        System.out.println(e);   // Output: true

        // ─────────────────────────────────────────────────────────
        // ! (Logical NOT) — flips / negates the boolean value
        // ─────────────────────────────────────────────────────────
        boolean f = !(a > b);   // a > b → 25 > 10 → true → !true → false
        System.out.println(f);   // Output: false

        // ─────────────────────────────────────────────────────────
        // TERNARY OPERATOR : condition ? valueIfTrue : valueIfFalse
        //   Shorthand for a simple if-else — result is a value, not void
        // ─────────────────────────────────────────────────────────
        int max = (a > b) ? a : b;   // 25 > 10 → true → max = a = 25
        System.out.println("Max = " + max);   // Output: Max = 25
    }
}
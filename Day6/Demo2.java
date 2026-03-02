package Day6;

/**
 * Demo2 - Relational (Comparison) Operators in Java
 *
 * Operators : ==, !=, >, <, >=, <=
 * Output    : always a boolean → true or false
 */
public class Demo2 {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────
        // RELATIONAL OPERATORS : ==, !=, >, <, >=, <=
        //   Result is always boolean (true / false)
        // ─────────────────────────────────────────────────────────

        int a = 10;
        int b = 20;

        boolean c = (a == b);    // 10 == 20 → false  (equality check)
        System.out.println(c);

        boolean d = (a != b);    // 10 != 20 → true   (not equal)
        System.out.println(d);

        boolean e = (a < b);     // 10 < 20  → true   (less than)
        boolean f = (a <= b);    // 10 <= 20 → true   (less than or equal)
        System.out.println(e);
        System.out.println(f);

        boolean g = (a > b);     // 10 > 20  → false  (greater than)
        boolean h = (a >= b);    // 10 >= 20 → false  (greater than or equal)
        System.out.println(g);
        System.out.println(h);
    }
}
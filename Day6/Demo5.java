package Day6;

/**
 * Demo5 - Modern Operator-Related Features (Java 16 → Java 25)
 *
 * Covers:
 *   1. instanceof  pattern matching  (Java 16 — stable)
 *   2. Switch expressions            (Java 14 — stable)
 *   3. Pattern matching in switch    (Java 21 — stable)
 *   4. Primitive types in patterns   (Java 25 — preview)
 *
 * These are modern replacements / extensions of older operator-style patterns.
 */
public class Demo5 {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────
        // 1. instanceof PATTERN MATCHING  (Java 16, stable)
        //
        //    Old way (before Java 16):
        //      if (obj instanceof String) {
        //          String s = (String) obj;  // manual cast needed
        //      }
        //
        //    New way: type check + cast + binding in ONE expression
        //      if (obj instanceof String s)  → s is directly usable inside block
        // ─────────────────────────────────────────────────────────

        Object obj = "Hello Java 25";

        // Old style (verbose)
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("Old style length: " + s.length());
        }

        // New style — pattern matching instanceof (cleaner, no separate cast)
        if (obj instanceof String s) {
            System.out.println("New style length: " + s.length());   // Output: 14
        }

        // ─────────────────────────────────────────────────────────
        // 2. SWITCH EXPRESSIONS  (Java 14+, stable)
        //
        //    Old switch → statement (uses break, falls through by default)
        //    New switch → expression (returns a value, no fall-through, uses ->)
        // ─────────────────────────────────────────────────────────

        int day = 3;

        // Old switch statement style
        String dayNameOld;
        switch (day) {
            case 1:  dayNameOld = "Monday";    break;
            case 2:  dayNameOld = "Tuesday";   break;
            case 3:  dayNameOld = "Wednesday"; break;
            default: dayNameOld = "Other";
        }
        System.out.println("Old switch : " + dayNameOld);   // Output: Wednesday

        // New switch expression style (Java 14+)
        String dayNameNew = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other";
        };
        System.out.println("New switch : " + dayNameNew);   // Output: Wednesday

        // ─────────────────────────────────────────────────────────
        // 3. PATTERN MATCHING IN SWITCH  (Java 21, stable)
        //
        //    Combines switch with instanceof-style type patterns.
        //    Works on Object — checks type and binds in one step.
        // ─────────────────────────────────────────────────────────

        Object value = 42;

        String result = switch (value) {
            case Integer i  -> "Integer  : " + i;
            case String  s  -> "String   : " + s;
            case Double  d  -> "Double   : " + d;
            default         -> "Unknown type";
        };
        System.out.println(result);   // Output: Integer : 42

        // ─────────────────────────────────────────────────────────
        // 4. GUARDED PATTERNS IN SWITCH  (Java 21, stable)
        //
        //    Adds a when condition (guard) to a pattern case.
        //    Allows extra filtering beyond just type matching.
        // ─────────────────────────────────────────────────────────

        Object number = 150;

        String category = switch (number) {
            case Integer i when i < 0    -> "Negative";
            case Integer i when i == 0   -> "Zero";
            case Integer i when i < 100  -> "Small positive";
            case Integer i               -> "Large positive : " + i;
            default                      -> "Not an integer";
        };
        System.out.println(category);   // Output: Large positive : 150

        // ─────────────────────────────────────────────────────────
        // 5. PRIMITIVE TYPES IN PATTERNS  (Java 25, preview)
        //
        //    Before Java 25: pattern matching only worked on reference types
        //                    (Integer, String, Double, etc.)
        //    Java 25 preview: works directly with primitives (int, long, double)
        //
        //    NOTE: Requires --enable-preview flag to compile in Java 25.
        //
        //    Example (preview — do not use in production yet):
        //
        //    int score = 95;
        //    String grade = switch (score) {
        //        case int s when s >= 90 -> "A";
        //        case int s when s >= 80 -> "B";
        //        case int s when s >= 70 -> "C";
        //        default                 -> "F";
        //    };
        //    System.out.println(grade);   // Output: A
        // ─────────────────────────────────────────────────────────

        System.out.println("Modern operator features demo complete.");
    }
}
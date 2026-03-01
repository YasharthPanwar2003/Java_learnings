package Day6;

/**
 * Demo1 - Arithmetic Operators in Java
 *
 * Covers:
 *   Basic       : +, -, *, /, %
 *   Compound    : +=, -=, *=, /=, %=
 *   Unary       : ++, -- (prefix and postfix)
 */
public class Demo1 {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────
        // 1. BASIC ARITHMETIC OPERATORS : + , - , * , / , %
        // ─────────────────────────────────────────────────────────

        int n1 = 5;
        int n2 = 15;

        int c = n1 + n2;   // 5  + 15 =  20   → addition
        int d = n1 - n2;   // 5  - 15 = -10   → subtraction
        int e = n1 * n2;   // 5  * 15 =  75   → multiplication
        int f = n2 / n1;   // 15 /  5 =   3   → integer division (quotient only)
        int g = n2 % n1;   // 15 %  5 =   0   → modulus (remainder)

        System.out.println(c + " , " + d + " , " + e + " , " + f + " , " + g);
        // Output: 20 , -10 , 75 , 3 , 0

        // ─────────────────────────────────────────────────────────
        // 2. COMPOUND ASSIGNMENT OPERATORS : +=, -=, *=, /=, %=
        //    Shorthand: h = h <op> value  →  h <op>= value
        // ─────────────────────────────────────────────────────────

        int h = n1 + 2;   // h = 5 + 2 = 7

        h += 2;           // h = h + 2 → h = 9
        h -= 2;           // h = h - 2 → h = 7
        h *= 3;           // h = h * 3 → h = 21
        h /= 3;           // h = h / 3 → h = 7
        h %= 5;           // h = h % 5 → h = 2

        System.out.println(h);   // Output: 2

        // ─────────────────────────────────────────────────────────
        // 3. INCREMENT / DECREMENT OPERATORS : ++ , --
        //    i++ is equivalent to  i += 1  which is  i = i + 1
        //    i-- is equivalent to  i -= 1  which is  i = i - 1
        // ─────────────────────────────────────────────────────────

        int i = 7;

        i++;   // postfix increment → i = 8
        i--;   // postfix decrement → i = 7

        System.out.println(i);   // Output: 7

        // ─────────────────────────────────────────────────────────
        // 4. PREFIX vs POSTFIX  (VERY IMPORTANT CONCEPT)
        //
        //   POSTFIX  k++  →  first USE / ASSIGN the current value,
        //                     then INCREMENT
        //
        //   PREFIX  ++k   →  first INCREMENT the value,
        //                     then USE / ASSIGN
        // ─────────────────────────────────────────────────────────

        int k = 5;
        k++;   // postfix → current value (5) is used first, then k becomes 6
        ++k;   // prefix  → k is incremented first to 7, then value is used
        // k = 7 at this point

        /*
         * Postfix example:
         *   int m = k++;
         *   Step 1 → m = k      →  m = 7   (current value assigned first)
         *   Step 2 → k = k + 1  →  k = 8   (then k is incremented)
         */
        int m = k++;   // m = 7,  k = 8
        System.out.println(k + " , " + m);   // Output: 8 , 7

        /*
         * Prefix example:
         *   int l = ++k;
         *   Step 1 → k = k + 1  →  k = 9   (k is incremented first)
         *   Step 2 → l = k      →  l = 9   (then assigned to l)
         */
        int l = ++k;   // k = 9,  l = 9
        System.out.println(k + " , " + l);   // Output: 9 , 9
    }
}
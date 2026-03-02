package Day6;

/**
 * Demo3 - Bitwise Operators in Java
 *
 * Operators : & (AND), | (OR), ^ (XOR), ~ (NOT), << (left shift),
 *             >> (signed right shift), >>> (unsigned right shift)
 *
 * Note : int is 32-bit (4 bytes) in Java.
 *        All bitwise operations work on individual bits.
 */
public class Demo3 {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────
        // 1. BASIC BITWISE OPERATORS : & | ^ ~
        // ─────────────────────────────────────────────────────────

        int a = 2;   // binary: 00000000 00000000 00000000 00000010
        int b = 3;   // binary: 00000000 00000000 00000000 00000011

        int c = a & b;   // AND : 00000000 00000000 00000000 00000010 → 2
        //       (bit is 1 only if BOTH bits are 1)

        int d = a | b;   // OR  : 00000000 00000000 00000000 00000011 → 3
        //       (bit is 1 if EITHER bit is 1)

        int e = a ^ b;   // XOR : 00000000 00000000 00000000 00000001 → 1
        //       (bit is 1 if bits are DIFFERENT)

        int f = ~a;      // NOT : 11111111 11111111 11111111 11111101 → -3
        //       (flips every bit; result = -(n+1) for int)

        System.out.println(c + " , " + d + " , " + e + " , " + f);
        // Output: 2 , 3 , 1 , -3

        // ─────────────────────────────────────────────────────────
        // 2. LEFT SHIFT OPERATOR :
        //    g << n  →  shifts bits left by n positions
        //    Equivalent to: g * 2^n  (multiplies by power of 2)
        //
        //    NOTE on shift wrapping (for int, 32-bit):
        //    Shift amount is always taken modulo 32.
        //    So  g << 33  ==  g << (33 % 32)  ==  g << 1
        // ─────────────────────────────────────────────────────────

        int g = 1;        // binary: 00000000 00000000 00000000 00000001
        g = g << 33;      // 33 % 32 = 1 → effectively g << 1 → g = 2
        System.out.println(g);   // Output: 2

        byte h = 1;              // binary: 00000001
        h = (byte)(h << 1);     // 00000001 << 1 = 00000010 → 2
        // cast back to byte required (shift promotes to int)
        System.out.println(h);   // Output: 2

        // ─────────────────────────────────────────────────────────
        // 3. RIGHT SHIFT OPERATORS : >> (signed)  and  >>> (unsigned)
        //
        //    >>  (signed right shift)
        //        Fills the MSB (leftmost bit) with the ORIGINAL sign bit.
        //        If MSB was 1 (negative number) → fills with 1
        //        If MSB was 0 (positive number) → fills with 0
        //        Equivalent to: n / 2^shift (for positive numbers)
        //
        //    >>> (unsigned right shift)
        //        ALWAYS fills the MSB with 0, regardless of sign.
        //        Useful when you want to treat the value as unsigned bits.
        // ─────────────────────────────────────────────────────────

        int k = 10;    // binary: 00000000 00000000 00000000 00001010
        int m = k >> 1;           // 00000000 00000000 00000000 00000101 → 5
        System.out.println(m);   // Output: 5

        // >>> vs >> difference on a negative number:
        int neg  = -8;           // binary: 11111111 11111111 11111111 11111000
        int signedShift   = neg >> 2;    // fills with 1 → 11111111 11111111 11111111 11111110 → -2
        int unsignedShift = neg >>> 2;   // fills with 0 → 00111111 11111111 11111111 11111110 → large positive

        System.out.println(">>  on -8 : " + signedShift);    // Output: -2
        System.out.println(">>> on -8 : " + unsignedShift);  // Output: 1073741822

        // ─────────────────────────────────────────────────────────
        // 4. EDGE CASES
        // ─────────────────────────────────────────────────────────

        // Shift by 33 on int (32-bit): wraps via modulo 32 → same as shift by 1
        int h1 = 1;
        h1 = h1 << 33;     // effectively << 1 → result = 2
        System.out.println(h1);   // Output: 2

        // Byte right-shifted 8 positions:
        //   127 = 01111111 → promoted to int: 00000000 00000000 00000000 01111111
        //   >> 8 → 00000000 00000000 00000000 00000000 → 0
        byte i1 = 127;
        byte j1 = (byte)(i1 >> 8);
        System.out.println(j1);   // Output: 0
    }
}
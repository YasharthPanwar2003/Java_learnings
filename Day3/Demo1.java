package Day3;

public class Demo1 {
    public static void main(String[] args) {

        // ── Integers : byte, short, int, long ──

        byte b = 5;
        // byte b = 0b101;        // binary literal        (base 2)
        // byte b = 07;           // octal literal         (base 8)  — valid: 0-7 only, 08 is invalid
        // byte b = 0X5;          // hexadecimal literal   (base 16) — digits: 0-9, A-F

        short s = 10;
        int   i = 4000;
        long  l = 1000;           // large longs: 12_34_56_789 → underscore ignored by compiler
        // rule: underscore not allowed after 0x, 0b, or after decimal point

        // ── Real Numbers : float, double ──

        float  f = 10.52f;        // single precision — needs 'f' suffix
        // double d = 73.29;      // double precision — standard way
        double d = 6.022e23;      // scientific notation: mantissa (6.022) × 10^exponent (23)

        // ── Character ──

        char c = 'a';             // 'a' → Unicode integer (97) → stored as binary

        // ── Boolean ──

        boolean bool = false;

        System.out.println("Integer values --> " + b + " , " + s + " , " + i + " , " + l);
        System.out.println("Real values    --> " + f + " , " + d);
        System.out.println("Character value --> " + c);
        System.out.println("Boolean value  --> " + bool);
    }
}
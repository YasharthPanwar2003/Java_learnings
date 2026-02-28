package Day4;

public class Demo1 {
    public static void main(String[] args) {

        float f = 0.7f;

        // float has ~7 decimal digits of precision (32-bit IEEE 754)
        // beyond that, storage approximation kicks in — never exact
        System.out.printf("%.20f%n", f);
        // Output: 0.69999998807907104492  ← not exactly 0.7 due to binary floating-point representation
    }
}
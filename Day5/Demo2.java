package Day5;

public class Demo2 {
    public static void main(String[] args){

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        // f * b --> float;

        // i / c ---> integer

        // d * s ---> double

        // float + integer ----> float - double ---> double
        double result = (f * b) + (i / c ) - (d * s);

        System.out.println((f * b) + " + " +  (i / c ) + " - " + (d * s));
        System.out.println("result = " +result);



    }
}

package Day5;
public class Demo1 {
    public static void main(String[] args){
        //implicit conversion
        //1 .(byte to int conversion)

        byte b = 24;
        int i;

        i = b;
        System.out.println(i); //24

        //1.1 implicit conversion character to int

        char c = 'a';

        int n;
        n = c;
        System.out.println(n); //97


        //2. Explicit conversion
        int i1 = 300;
        byte bite ; // -128 to +127

        bite = (byte) i1;

        System.out.println(bite); // 300 % 256 = 44 ( range of int )

        //3. Truncating conversion

        float f = 15.678f;

        int i2;

        i2 = (int) f;
        System.out.println(i2);  //15

        //Boolean to any other data type conversion
        //These conversion are not possible

        //boolean bool = false;
        //int i3;

        //i3 = bool;    give mismatch or type cast error can't convert


        //automatic type promotion  so we must specify the resp. keywords

        byte b2  = 50;
        b2 = (byte) (b2 * 2);

        System.out.println(b2); //100

    }

}

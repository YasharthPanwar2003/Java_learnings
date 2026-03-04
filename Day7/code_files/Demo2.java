package Day7.code_files;

public class Demo2 {
    public static void main(String[] args) {

        // switch expression must be: byte, short, int, char, Enum, or String (JDK 7+)
        int i = 1;

        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is greater than 3");
                break;
        }

        // no duplicate cases allowed; JDK 14+ enhanced switch further
        int j = 5;
        int k = 1;

        switch (j) {
            case 4:
                System.out.println("j is 4");
                break;
            case 5:
                switch (k) {                 // nested switch
                    case 1:
                        switch (j) {         // triple-nested switch
                        }
                    case 2:
                        break;
                }
            default:
                System.out.println("j is not 4 or 5");
                break;
        }
    }
}
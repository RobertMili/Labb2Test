import java.util.Scanner;

public class TestPrintOutMainMeny {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printOutMeny();

        eanTesting(sc);

    }

    private static void eanTesting(Scanner sc) {
        System.out.println("input number");

        int number = sc.nextInt();

        System.out.println("this is number : " + number);
    }

    private static void printOutMeny() {
        final String menyText = """
                meny 
                test
                """;


        System.out.println(menyText);
    }
}

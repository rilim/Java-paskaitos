import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;//skaičius kurį vartotojas įveda
        int rezultatas1;
        System.out.println("Daugybos lentelė");
        System.out.println("Įveskite skaičių");
        while (true) {
            Scanner s = new Scanner(System.in);
            try {
                a = s.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ivestas neteisingas skaicius");
            }
        }
        rezultatas1 = 1 * a;
        System.out.println(a + "*" + 1 + "=" + rezultatas1);
        rezultatas1 = 2 * a;
        System.out.println(a + "*" + 2 + "=" + rezultatas1);
        rezultatas1 = 3 * a;
        System.out.println(a + "*" + 3 + "=" + rezultatas1);
        rezultatas1 = 4 * a;
        System.out.println(a + "*" + 4 + "=" + rezultatas1);
        rezultatas1 = 5 * a;
        System.out.println(a + "*" + 5 + "=" + rezultatas1);
        rezultatas1 = 6 * a;
        System.out.println(a + "*" + 6 + "=" + rezultatas1);
        rezultatas1 = 7 * a;
        System.out.println(a + "*" + 7 + "=" + rezultatas1);
        rezultatas1 = 8 * a;
        System.out.println(a + "*" + 8 + "=" + rezultatas1);
        rezultatas1 = 9 * a;
        System.out.println(a + "*" + 9 + "=" + rezultatas1);
    }
}

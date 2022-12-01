import java.util.Scanner;

public class Vjezba7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Fibonacijev niz

        int a = 0;
        int b = 0;
        int c = 1;
        System.out.println("Unesi koliko zelis clanova Fibonacijevog niza");
        int n = userInput.nextInt();
        System.out.println("Clanovi Fibonacijevog niza su:");
        System.out.println(b + "\n" + c);
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
    }
}

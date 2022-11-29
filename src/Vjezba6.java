import java.util.Scanner;

public class Vjezba6 {
    public static void main(String[] args) {
        Scanner korisnickiUnos = new Scanner(System.in);
  /*      System.out.println("Unesi x koordinatu");
        int x = korisnickiUnos.nextInt();
        System.out.println("Unesi y koordinatu");
        int y = korisnickiUnos.nextInt();

        for (int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        // Crtanje okvira (prozora)

        System.out.println("Unesi x koordinatu: ");
        int x = korisnickiUnos.nextInt();
        System.out.println("Unesi y koordinatu: ");
        int y = korisnickiUnos.nextInt();

        for(int i = 0; i < x; i++) {
            if (i == 0 || i == x - 1) {
                for (int j = 0; j < y; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < y; j++) {
                    if (j == 0 || j == y - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

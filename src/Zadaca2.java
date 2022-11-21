import java.util.Scanner;

public class Zadaca2 {
    public static void main(String[] args) {

        Scanner korisnickiUnos = new Scanner(System.in);
        // Zadatak 1
        // Koristeci for petlju ispisati sve brojeve od 0 do 100 koji su djeljivi sa 3 i sa 5

        /*for(int i=0; i<100;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }*/


        // Zadatak 2

        /*String username = "Ikbal";
        String password = "Mulalic";
        System.out.println("Unesi username");
        String unijetiUsername = korisnickiUnos.next();
        while(!unijetiUsername.equals(username)) {
            System.out.println("Netacan username:");
            unijetiUsername = korisnickiUnos.next();
        }
        System.out.println("Unesi password: ");
        String unijetiPassword = korisnickiUnos.next();
        while (!unijetiPassword.equals(password)){
            System.out.println("Netacan unos ");
            unijetiPassword = korisnickiUnos.next();
        }
        System.out.println("dobro dosli");*/

        // Zadatak 3
      String myUsername = "Ikbal";
        String myPassword = "Mulalic";
        System.out.println("Unesi username");
        String username = korisnickiUnos.next();
        int brojUnosa = 3;
        while(brojUnosa > 0) {
            if (!username.equals(myUsername)) {
                brojUnosa--;
                if(brojUnosa == 0) {
                    break;
                }
                System.out.println("Imas jos " + brojUnosa + " pokusaja");
                System.out.println("Unesi username ponovo");
                username = korisnickiUnos.next();
            } else {
                System.out.println("Unesi password");
                String password = korisnickiUnos.next();
                while(!password.equals(myPassword) && brojUnosa > 0) {
                    brojUnosa--;
                    if (brojUnosa == 0) {
                        break;
                    }
                    System.out.println("Imas jos " + brojUnosa + " pokusaja");
                    System.out.println("Unesi password ponovo");
                    password = korisnickiUnos.next();
                }
                if (password.equals(myPassword)) {
                    System.out.println("Dobro dosli");
                    return;
                }
            }
        }
        System.out.println("Previse pogresaka");

        // Korisnik unosi sirinu duzinu, npr 4(duzina) i 5(sirina)
        // a mi zatim crtamo pravougaonik dimenzija 4x5

        /*  *****
         *****
         *****
         *****
         *****

         */

        // Primjer 1
        // Crtanje cetverougla sa zvjezdicama

       /* System.out.println("Unesi x koordinatu");
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

      /*  System.out.println("Unesi x koordinatu: ");
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
        }*/
    }
}

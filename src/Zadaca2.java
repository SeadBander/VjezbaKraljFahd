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
       /* int i = 1;
        String username = "sejo";
        String password = "sejo123";
        System.out.println("unesi username");
        String unijetiUsername = korisnickiUnos.next();

        while (i < 4 && !unijetiUsername.equals(username)) {
            if (!unijetiUsername.equals(username)) {
                System.out.println("Unesi username ponovo");
                unijetiUsername = korisnickiUnos.next();
                System.out.println("i je " + i);
                i++;
            } else {
                System.out.println("Unesi password");
                String unijetiPassword = korisnickiUnos.next();
                if (!unijetiPassword.equals(password)) {
                    System.out.println("Unesi password ponovo");
                    unijetiPassword = korisnickiUnos.next();
                    System.out.println("i je " + i);
                    i++;
                } else {
                    System.out.println("Dobro dosli");
                }
            }
        }


        while(!unijetiUsername.equals(username) && i < 3) {
            System.out.println("netacna username" + i + "/3 pokusaja ostalo");
            unijetiUsername = korisnickiUnos.next();

            if (i == 3 && !unijetiUsername.equals(username)) {
                return;
            }
            i++;
        }
        System.out.println("Unesi password: ");
        String unijetiPassword = korisnickiUnos.next();
        while (!unijetiPassword.equals(password) || i < 3){
            System.out.println("netacna sifra" + i + "/3 pokusaja ostalo");
            unijetiPassword = korisnickiUnos.next();
            i++;
            if (i == 4 && !unijetiPassword.equals(password)) {
                return;
            }

        }
        System.out.println("dobro dosli");*/

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

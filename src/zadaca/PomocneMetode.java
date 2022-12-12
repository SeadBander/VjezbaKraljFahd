package zadaca;

import static zadaca.PomocneVarijable.*;

public class PomocneMetode {
    static void unosUsernameIPassword2() {
        while (brojPokusajaUserName > 0) {
            System.out.println("Unesi username");
            String username = korisnickiUnos.next();
            if (username.equals(myUsername)) {
                System.out.println("Hvala. Ispravno unesen username");
                System.out.println("Dobro dosli");
                break;
            } else {
                System.out.println("Pogresno unesen username");
                brojPokusajaUserName--;
            }
            if (brojPokusajaUserName == 0) {
                System.out.println("Pogrijesili ste username 3 puta");
                System.out.println("Pokusajte ponovo");
                return;
            }
        }
        while (brojPokusajaPassword > 0) {
            System.out.println("Unesi password");
            String password = korisnickiUnos.next();
            if (password.equals(myPassword)) {
                System.out.println("Hvala. Ispravno unesen password");
                System.out.println("Dobro dosli");
                break;
            } else {
                System.out.println("Pogresno unesen password");
                brojPokusajaPassword--;
            }
            if (brojPokusajaPassword == 0) {
                System.out.println("Pogrijesili ste password 3 puta");
                System.out.println("Pokusajte ponovo");
                return;
            }
        }
    }

    static void unosUsernameIPassword() {
        while (brojPokusaja > 0) {
            System.out.println("Unesi username");
            String username = korisnickiUnos.next();
            System.out.println("Unesi password");
            String password = korisnickiUnos.next();
            if (username.equals(myUsername) && password.equals(myPassword)) {
                System.out.println("Hvala. Ispravno unesen username i password");
                System.out.println("Dobro dosli");
                break;
            } else {
                System.out.println("Pogresno unesen username ili password");
                brojPokusaja--;
            }
            if (brojPokusaja == 0) {
                System.out.println("Pogrijesili ste unos 3 puta");
                System.out.println("Pokusajte ponovo");
                return;
            }
        }
    }

    static void loginNaMail() {
        //unosUsernameIPassword2();
        //unosUsernameIPassword();
    }
}

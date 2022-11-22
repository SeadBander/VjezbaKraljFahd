import java.util.Scanner;

public class Vjezba3 {
    public static void main(String[] args) {

        Scanner korisnickiUnos = new Scanner(System.in);
        String myUsername = "sejo";
        String myPassword = "sejo123";
        System.out.println("Unesi username");
        String username = korisnickiUnos.next();

        while(!username.equals(myUsername)) {
            System.out.println("Pogresan username");
            username = korisnickiUnos.next();
        }
        System.out.println("Hvala. Ispravno unesen username");

        System.out.println("Unesi password");
        String password = korisnickiUnos.next();
        while(!password.equals(myPassword)) {
            System.out.println("Pogresan password");
            password = korisnickiUnos.next();
        }
        System.out.println("Hvala. Ispravno unesen password");
        System.out.println("Dobro dosli");

        /*String myUsername = "sejo";
        String myPassword = "sejo123";
        int brojPokusajaUserName = 3;
        while (brojPokusajaUserName > 0) {
            System.out.println("Unesi username");
            String username = korisnickiUnos.next();
            if (username.equals(myUsername)) {
                System.out.println("Hvala. Ispravno unesen username");
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

        int brojPokusajaPassword = 3;
        while (brojPokusajaPassword > 0) {
            System.out.println("Unesi password");
            String password = korisnickiUnos.next();
            if (password.equals(myPassword)) {
                System.out.println("Hvala. Ispravno unesen password");
                System.out.println("DOBRO DOSLI");
                break;
            } else {
                System.out.println("Pogresno unesen password");
                brojPokusajaPassword--;
            }

            if (brojPokusajaUserName == 0) {
                System.out.println("Pogrijesili ste password 3 puta");
                System.out.println("Pokusajte ponovo");
                return;
            }
        }*/
    }
}

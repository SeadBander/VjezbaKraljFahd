import java.util.Scanner;

public class Zadaca {
    public static void main(String[] args) {

        Scanner korisnickiUnos = new Scanner(System.in);
        /*System.out.println("Unesite prvi broj");
        int brojA = korisnickiUnos.nextInt();
        System.out.println("Unesite drugi broj");
        int brojB = korisnickiUnos.nextInt();
        if(brojB<=0){
            System.out.println("Unesite drugi broj veci od 0");
        }else {
            System.out.println("Cijeli broj nakon dijeljenja je " + (brojA/brojB));
            System.out.println("Ostatak nakon dijeljenja je " + (brojA%brojB));
        }*/

       /* for (int i = 1; i<100; i++){
            if((i%3)==0 && (i%5)==0){
                System.out.println("Brojevi dijeljivi sa 3 i sa 5 su " + i);
            }
        }*/


        /*String myUsername = "sejo";
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
        System.out.println("Dobro dosli");*/

        String myUsername = "sejo";
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
            }

        /*String myUsername = "sejo";
        String myPassword = "sejo123";
        int brojUnosa = 3;
        while (brojUnosa > 0) {
            System.out.println("Unesi username: ");
            String username = korisnickiUnos.next();
            System.out.println("Unesi password: ");
            String password = korisnickiUnos.next();
            if (username.equals(myUsername) && password.equals(myPassword)) {
                System.out.println("Uspjesno uneseni username i password");
                System.out.println("Dobro dosli");
                break;
            } else {
                System.out.println("Pogresno unesen username ili password");
                brojUnosa--;
            }
        }
        if (brojUnosa == 0) {
            System.out.println("Pogresno unesen podaci 3 puta");
        }*/
    }
}
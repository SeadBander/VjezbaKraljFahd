import java.util.Random;
import java.util.Scanner;

public class Vjezba2 {
    public static void main(String[] args) {
        final String KAMEN = "kamen";
        final String PAPIR = "papir";
        final String MAKAZE = "makaze";
        Random randomGenerator = new Random();
        int korisnickePobjede = 0;
        int racunarskePobjede = 0;
        Scanner korisnickiUnos = new Scanner(System.in);
        int randomBroj;
        String[] opcije = new String[]{KAMEN, PAPIR, MAKAZE};
        System.out.println("Unesi jednu od opcija: Kamen, Papir, Makaze ili \"n\" da zavrsis igru");
        String userInput = korisnickiUnos.next().toLowerCase();

        while (!userInput.equals("n") && (korisnickePobjede < 3) && racunarskePobjede < 3) {
            while (!userInput.equals(KAMEN) && !userInput.equals(PAPIR) && !userInput.equals(MAKAZE)) {
                System.out.println("Unesi jednu od opcija: Kamen, Papir, Makaze ili \"n\" da zavrsis igru");
                userInput = korisnickiUnos.next();
            }
            randomBroj = randomGenerator.nextInt(3);
            String racunarskiUnos = opcije[randomBroj];
            System.out.println("Racunar je odabrao " + racunarskiUnos);
            if (racunarskiUnos.equals(userInput)) {
                System.out.println("Nerjeseno");
            } else {
                if (racunarskiUnos.equals(KAMEN)) {
                    if (userInput.equals(MAKAZE)) {
                        System.out.println("Racunar je pobijedio");
                        racunarskePobjede++;
                    } else if (userInput.equals(PAPIR)) {
                        System.out.println("Korisnik je pobijedio");
                        korisnickePobjede++;
                    }
                } else if (racunarskiUnos.equals(MAKAZE)) {
                    if (userInput.equals(KAMEN)) {
                        System.out.println("Korisnik je pobijedio");
                        korisnickePobjede++;
                    } else if (userInput.equals(PAPIR)) {
                        System.out.println("Racunar je pobijedio");
                        racunarskePobjede++;
                    }
                } else if (racunarskiUnos.equals(PAPIR)) {
                    if (userInput.equals(KAMEN)) {
                        System.out.println("Racunar je pobijedio");
                        racunarskePobjede++;
                    } else if (userInput.equals(MAKAZE)) {
                        System.out.println("Korisnik je pobijedio");
                        korisnickePobjede++;
                    }
                }
            }
            System.out.println("Korisnik: " + korisnickePobjede + "\nRacunar: " + racunarskePobjede);
            if (korisnickePobjede == 3) {
                System.out.println("Igra je zavrsena. \nKorisnik je pobijedio");
                return;
            } else if (racunarskePobjede == 3) {
                System.out.println("Igra je zavrsena. \nRacunar je pobijedio");
                return;
            }
            System.out.println("Unesi jednu od opcija: Kamen, Papir, Makaze ili \"n\" da zavrsis igru");
            userInput = korisnickiUnos.next();
        }
    }
}

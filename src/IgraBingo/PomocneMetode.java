package IgraBingo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PomocneMetode {
    static Scanner korisnickiUnos = new Scanner(System.in);
    static Random random = new Random();
    static final int BROJEVI_NA_LISTICU = 6;
    static final int BROJEVI_U_IGRI = 48;

    static final int MAX_BROJ_RUNDI = 36;
    static ArrayList<Integer> randomBingoBrojevi = new ArrayList<>();
    static ArrayList<Integer> tvojiBingoBrojevi = new ArrayList<>();
    static ArrayList<Integer> sviBingoBrojevi = new ArrayList<>();
    static ArrayList<Integer> pogodjeniBrojevi = new ArrayList<>();
    static int brojac = 1;


    static void popuniSveBrojeve() {
        for (int i = 0; i <= BROJEVI_U_IGRI; i++) {
            sviBingoBrojevi.add(i);
        }
    }

    static void generisiRandomListic() {
        System.out.println("Tvoj kompjuterski listic je :");
        for (int i = 0; i < BROJEVI_NA_LISTICU; i++) {
            int broj = randomGenerisaniBroj();
            while (randomBingoBrojevi.contains(broj)) {
                broj = randomGenerisaniBroj();
            }
            randomBingoBrojevi.add(broj);
            System.out.print(randomBingoBrojevi.get(i) + "\t");
        }
    }

    static int randomGenerisaniBroj() {
        int broj = random.nextInt(sviBingoBrojevi.size());
        while (sviBingoBrojevi.get(broj) == -1) {
            broj = random.nextInt(sviBingoBrojevi.size());
        }
        return broj;
    }

    static void unesiSvojeBrojeve() {
        System.out.println("Morate unijeti broj izmedju 0 i 48.");
        System.out.println("Unesi svojih " + BROJEVI_NA_LISTICU + " brojeva.");
        for (int i = 0; i < BROJEVI_NA_LISTICU; i++) {
            int korisnickiBroj = korisnickiUnos.nextInt();
            while ((korisnickiBroj < 0 || korisnickiBroj > BROJEVI_U_IGRI) ||
                    tvojiBingoBrojevi.contains(korisnickiBroj)) {
                System.out.println("Morate unijeti broj izmedju 0 i 48.");
                korisnickiBroj = korisnickiUnos.nextInt();
            }
            tvojiBingoBrojevi.add(korisnickiBroj);
        }
        System.out.println("Tvoja kombinacija je:");
        for (int broj : tvojiBingoBrojevi) {
            System.out.print(broj + "\t");
        }
    }

    static void ukloniBrojIzListe(int broj) {
        int index = -1;
        for (int i = 0; i < sviBingoBrojevi.size(); i++) {
            if (sviBingoBrojevi.get(i) == broj) {
                index = i;
            }
        }
        if (index >= 0) {
            sviBingoBrojevi.remove(sviBingoBrojevi.get(index));
            sviBingoBrojevi.add(index, -1);
        }
    }

    static boolean jePogodjen(int broj) {
        return randomBingoBrojevi.contains(broj) || tvojiBingoBrojevi.contains(broj);
    }

    static void dajBingoBroj() {
        System.out.println( "\t" + "Unesi n da dobijes Bingo lopticu:");
        String unos = korisnickiUnos.next();
        while(!unos.equals("n")) {
            unos = korisnickiUnos.next();
        }

        int trenutniBroj = randomGenerisaniBroj();
        System.out.println(brojac + " runda: " + trenutniBroj);
        if (jePogodjen(trenutniBroj)) {
            pogodjeniBrojevi.add(trenutniBroj);
            System.out.println("Tvoji pogodjeni brojevi su: ");

            for (int broj: pogodjeniBrojevi) {
                System.out.print(broj + "\t");
            }
        }
        ukloniBrojIzListe(trenutniBroj);
        brojac++;
    }

    static void pocniIgru() {
        System.out.println("Pocni igru Bingo.");
        popuniSveBrojeve();
        System.out.println("Odaberi svoj listic ili odaberi slucajne brojeve");
        System.out.println("Odaberi 1 ako zelis svoje brojeve ili 0 ako zelis slucajne:");
        int odabirListica = korisnickiUnos.nextInt();
        while (odabirListica != 0 && odabirListica != 1) {
            System.out.println("Molim te unesi 0 ili 1.");
            odabirListica = korisnickiUnos.nextInt();
        }

        if (odabirListica == 0) {
            generisiRandomListic();
        } else {
            unesiSvojeBrojeve();
        }

        while (pogodjeniBrojevi.size() < BROJEVI_NA_LISTICU  && brojac < MAX_BROJ_RUNDI) {
            dajBingoBroj();
        }

        if (pogodjeniBrojevi.size() >= BROJEVI_NA_LISTICU) {
            pokaziRezultat(true);
        } else {
            pokaziRezultat(false);
        }
    }

    static void pokaziRezultat(boolean jePobjeda) {
        if (jePobjeda) {
            System.out.println("Pobijedio si i osvojio: " + (MAX_BROJ_RUNDI - (brojac - 1)) * 1000);
        } else {
            System.out.println("Izgubio si.");
        }
    }
}

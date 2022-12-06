package IgraPKM;

public class PomocneMetode {
    static String racunarskiIzbor() {
        String racunarskiOdabir = PomocneVarijable.opcije[PomocneVarijable.random.nextInt(PomocneVarijable.opcije.length)];
        System.out.println("Racunarski odabir je: " + racunarskiOdabir);
        return racunarskiOdabir;
    }

    static String korisnickiIzbor() {
        System.out.println("Unesi kamen,papir ili makaze:");
        return validirajKorisnickiUnos(PomocneVarijable.korisnickiUnos.next().toLowerCase());
    }

    static String validirajKorisnickiUnos(String korisnickiOdabir) {
        while (!korisnickiOdabir.equals(PomocneVarijable.KAMEN) &&
                !korisnickiOdabir.equals(PomocneVarijable.PAPIR) &&
                !korisnickiOdabir.equals(PomocneVarijable.MAKAZE)) {
            System.out.println("Neispravan unos, probaj ponovo: ");
            korisnickiOdabir = PomocneVarijable.korisnickiUnos.next().toLowerCase();
        }
        return korisnickiOdabir;
    }

    static void rezultatNerjeseno() {
        System.out.println("Nerjeseno");
    }

    static void korisnikJeBolji() {
        System.out.println("Korisnik je bolji.");
        PomocneVarijable.korisnickePobjede++;
    }

    static void racunarJeBolji() {
        System.out.println("Racunar je bolji.");
        PomocneVarijable.racunarskePobjede++;
    }

    static void provjeriKoJeBolji(String korisnickiIzbor, String racunarskiIzbor) {
        if (korisnickiIzbor.equals(racunarskiIzbor)) {
            rezultatNerjeseno();
        } else {
            switch (korisnickiIzbor) {
                case PomocneVarijable.KAMEN:
                    if (racunarskiIzbor.equals(PomocneVarijable.MAKAZE)) {
                        korisnikJeBolji();
                    } else {
                        racunarJeBolji();
                    }
                    break;
                case PomocneVarijable.MAKAZE:
                    if (racunarskiIzbor.equals(PomocneVarijable.PAPIR)) {
                        korisnikJeBolji();
                    } else {
                        racunarJeBolji();
                    }
                    break;
                case PomocneVarijable.PAPIR:
                    if (racunarskiIzbor.equals(PomocneVarijable.KAMEN)) {
                        korisnikJeBolji();
                    } else {
                        racunarJeBolji();
                    }
                    break;
            }
        }
        System.out.println("Korisnik : " + PomocneVarijable.korisnickePobjede + "\tRacunar: " + PomocneVarijable.racunarskePobjede);
    }

    static void igrajIgru() {
        while (PomocneVarijable.korisnickePobjede < PomocneVarijable.MAKSIMALNE_POBJEDE && PomocneVarijable.racunarskePobjede < PomocneVarijable.MAKSIMALNE_POBJEDE) {
            provjeriKoJeBolji(korisnickiIzbor(), racunarskiIzbor());
        }
        proglasiPobjednika();
    }

    static void proglasiPobjednika() {
        if (PomocneVarijable.korisnickePobjede == PomocneVarijable.MAKSIMALNE_POBJEDE) {
            System.out.println("Korisnik je pobijedio");
        } else {
            System.out.println("Racunar je pobijedio");
        }
    }
}

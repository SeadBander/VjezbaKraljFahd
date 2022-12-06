package IgraPKM;

import java.util.Random;
import java.util.Scanner;

public class PomocneVarijable {
    static final String KAMEN = "kamen";
    static final String PAPIR = "papir";
    static final String MAKAZE = "makaze";
    static final int MAKSIMALNE_POBJEDE = 3;
    static String[] opcije = new String[]{KAMEN, PAPIR, MAKAZE};
    static Scanner korisnickiUnos = new Scanner(System.in);
    static Random random = new Random();
    static int korisnickePobjede = 0;
    static int racunarskePobjede = 0;
}

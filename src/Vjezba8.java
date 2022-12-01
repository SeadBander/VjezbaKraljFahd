import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vjezba8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Metode
        // Sintaksa kreiranja nekog metoda je:
        // static tip_metode naziv_metode(parametar - opcionalno) { kod }
        // ukoliko imamo povratni tip, onda moramo imati return na kraju metode

        /*nekiMetod();
        nekiMetod();
        nekiMetod();*/
        /*System.out.println("Ispisi neki pozdrav na ekranu:");
        String pozdrav = userInput.nextLine();
        metodSaParametrom(pozdrav);*/

        /*System.out.println("Unesi ime:");
        String ime = userInput.next();
        pozdravSaImenom(ime);*/
        //System.out.println(metodZaPozdrav("Cao", "Ikbal"));
        /*System.out.println("Unesi prvi broj:");
        int prviBroj = userInput.nextInt();
        System.out.println("Unesi drugi broj:");
        int drugiBroj = userInput.nextInt();
        System.out.println("Unesi operator:");
        String operator = userInput.next();
        metodZaRacunanje(prviBroj, drugiBroj, operator);*/
        //int broj = 4; // podrazumijevamo da ova vrijednost mora ostati 4 zbog logike
        // u nasoj klasi, jer ako se njena vrijednost promijeni,
        // Poremetice se komplet logika u klasi

        // Napraviti metod za sabiranje prvih 100 brojeva

        //metodZaSabiranjeStoBrojeva();
        int velicinaListe = userInput.nextInt();
        ArrayList<Integer> listaBrojeva = listaSlucajnoGenerisanihBrojeva(velicinaListe);
        for (int i : listaBrojeva) {
            System.out.println(i);
        }
        System.out.println("Lista parnih brojeva je");
        for (int number : listaSlucajnoOdabranihParnihBrojeva(listaBrojeva)) {
            System.out.print(number + " \t");
        }
        // napraviti metod za ispis svih parnih brojeva iz "listaBrojeva"

    }

    static void nekiMetod() {
        System.out.println("Pozdrav 1");
        System.out.println("Pozdrav 2");
        System.out.println("Pozdrav 3");
        System.out.println("Pozdrav 4");
        System.out.println("Pozdrav 5");
        System.out.println("Pozdrav 6");
        System.out.println("Pozdrav 7");
        System.out.println("Pozdrav 8");
        System.out.println("Pozdrav 9");
        System.out.println("Pozdrav 10");
        System.out.println("Pozdrav 11");
        System.out.println("Pozdrav 12");
    }

    static void metodSaParametrom(String pozdrav) {
        System.out.println(pozdrav);
    }

    static void pozdravSaImenom(String ime) {
        System.out.println("Pozdrav " + ime);
    }

    static String metodZaPozdrav(String pozdrav, String ime) {
        String noviPozdrav = pozdrav + "\t" + ime;
        return noviPozdrav;
    }

    static void metodZaRacunanje(int prviBroj, int drugiBroj, String operator) {
        switch (operator) {
            case "+":
                System.out.println(prviBroj + drugiBroj);
                break;
            case "-":
                System.out.println(prviBroj - drugiBroj);
                break;
            case "*":
                System.out.println(prviBroj * drugiBroj);
                break;
            case "/":
                if (jeValidanBroj(drugiBroj)) {
                    System.out.println(prviBroj / drugiBroj);

                } else {
                    System.out.println("Drugi broj mora biti razlicit od 0");
                }
                break;
            default:
                System.out.println("Neispravan operator");
                break;
        }
    }

    static boolean jeValidanBroj(int broj) {
        //return broj != 0; -> Ovo je kraci zapis
        if (broj == 0) {
            return false;
        } else {
            return true;
        }
    }

    static void metodZaSabiranjeStoBrojeva() {
        int rezultat = 0;
        for (int i = 0; i <= 100; i++) {
            rezultat+=i;
        }
        System.out.println(rezultat);
    }

    // napraviti metod za ispis svih parnih brojeva iz "listaBrojeva"

    static ArrayList<Integer> listaSlucajnoGenerisanihBrojeva(int velicinaListe) {
        Random random = new Random();
        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        for (int i = 0; i < velicinaListe; i++) {
            listaBrojeva.add(random.nextInt(100));
        }
        return listaBrojeva;
    }

    static ArrayList<Integer> listaSlucajnoOdabranihParnihBrojeva(ArrayList<Integer> lista) {
        ArrayList<Integer> novaLista = new ArrayList<>();
        for (int number : lista) {
            if (number % 2 == 0) {
                novaLista.add(number);
            }
        }
        return novaLista;
    }
}


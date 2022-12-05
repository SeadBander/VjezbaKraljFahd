import java.util.Scanner;

public class Vjezba9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Unesite mjesec u godini");
        int mjesecUGodini = userInput.nextInt();
        mjeseciUGodini(mjesecUGodini);
        System.out.print(" i godisnje doba je ");
        sezona(mjesecUGodini);
    }

    static void sezona(int mjesec){

        if(mjesec == 12 || mjesec == 1 || mjesec == 2)
            System.out.println("Zima");
        else if(mjesec == 3 || mjesec == 4 || mjesec == 5)
            System.out.println("Proljece");
        else if(mjesec == 6 || mjesec == 7 || mjesec == 8)
            System.out.println("Ljeto");
        else if(mjesec == 9 || mjesec == 10 || mjesec == 11)
            System.out.println("Jesen");
        else
            System.out.println("Pogresno unesen mjesec");

    }
    static void mjeseciUGodini(int mjesecUGodini){

        switch (mjesecUGodini) {
            case 1:
                System.out.print("Uneseni mjesec je Januar");
                break;
            case 2:
                System.out.print("Uneseni mjesec je Februar");
                break;
            case 3:
                System.out.print("Uneseni mjesec je Mart");
                break;
            case 4:
                System.out.print("Uneseni mjesec je April");
                break;
            case 5:
                System.out.print("Uneseni mjesec je Maj");
                break;
            case 6:
                System.out.print("Uneseni mjesec je Juni");
                break;
            case 7:
                System.out.print("Uneseni mjesec je Juli");
                break;
            case 8:
                System.out.print("Uneseni mjesec je Avgust");
                break;
            case 9:
                System.out.print("Uneseni mjesec je Septembar");
                break;
            case 10:
                System.out.print("Uneseni mjesec je Oktobar");
                break;
            case 11:
                System.out.print("Uneseni mjesec je Novembar");
                break;
            case 12:
                System.out.print("Uneseni mjesec je Decembar");
                break;
            default:
                System.out.print("Pogresan unos mjeseca u godini");

        }
    }
}


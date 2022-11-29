import java.util.Scanner;

public class Vjezba5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Unesi broj zvjezdica");
        int numOfStars = userInput.nextInt();
        for(int i = 0; i < numOfStars; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < numOfStars; i++) {
            for (int j = 0; j < numOfStars - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < numOfStars; i++) {
            for (int j = numOfStars; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < numOfStars; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numOfStars - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

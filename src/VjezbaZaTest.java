import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class VjezbaZaTest {
    public static void main(String[] args) {
        final Random randomGenerator = new Random();
        ArrayList<Integer> convertedNumber = new ArrayList<>();
        int randomNumber = randomGenerator.nextInt(20);
        int base = 5;

        System.out.println("Randomly generated number is: " + randomNumber);

        while(randomNumber > 0) {
            convertedNumber.add(randomNumber % base);
            randomNumber = randomNumber / base;
        }

        Collections.reverse(convertedNumber);
        for (int i : convertedNumber) {
            System.out.println(i);
        }
    }
}

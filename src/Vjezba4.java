import java.util.ArrayList;

public class Vjezba4 {
    public static void main(String[] args) {

        ArrayList<Integer> listaParnihBrojeva = new ArrayList<>();
        ArrayList<Integer> listaNeparnihBrojeva = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                listaParnihBrojeva.add(i);
            } else {
                listaNeparnihBrojeva.add(i);
            }
        }

        System.out.println("Lista parnih brojeva:");
        for (int broj : listaParnihBrojeva) {
            System.out.println(broj);
        }

        System.out.println("Lista neparnih brojeva:");
        for (int broj : listaNeparnihBrojeva) {
            System.out.println(broj);
        }
    }
}

public class Vjezba {
    public static void main(String[] args){

        int[] nizOdStoBrojeva = new int[100];
        for (int i = 0; i < nizOdStoBrojeva.length; i++) {
            nizOdStoBrojeva[i] = i;
        }
        int suma = 0;
        for (int i = 0; i < nizOdStoBrojeva.length; i++) {
            suma = suma + nizOdStoBrojeva[i];
        }

        System.out.println("Suma svih brojeva u nizu je " + suma);
    }
}

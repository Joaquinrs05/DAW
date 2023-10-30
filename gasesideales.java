import java.util.Scanner;

public class gasesideales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada y persistencia
        int iVolumen = 1;
        int iatm = 1;
        double iCte = 8.314;
        double dtemperatura = 0;
        int imol = 50;

        // Procesos

        for (int i = 1; i <= imol; i++) {

            dtemperatura = (iVolumen * iatm) / (i * iCte);

            System.out.println(" La temperatura sera: " + dtemperatura);
        }

        input.close();
    }
}
package Programacion.Arraysymatrices;

public class Elementomayormenor {
    public static void main(String arg[]) {
        int[] MayorMenorArray = { 3, 2, 6, 9, 1, 8 };

        int maximo = MayorMenorArray[0];
        int minimo = MayorMenorArray[0];

        for (int i = 1; i < MayorMenorArray.length; i++) {
            int actualMax = MayorMenorArray[i];
            int actualMin = MayorMenorArray[i];

            if (actualMax > maximo) {
                maximo = actualMax;
            }
            if (actualMin < minimo) {
                minimo = actualMin;

            }
        }
        System.out.println("El nuúmero más grande es : " + maximo);
        System.out.println("El nuúmero más pequeño es : " + minimo);
    }

}

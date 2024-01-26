package Programacion.Arraysymatrices;

public class ejercicioparimpar {

    public static void main(String[] args) {
        int[] a = { 3, 7, 12, 22, 9, 25, 18, 31, 21, 14, 45, 2 };
        System.out.println(sumarPares(a)); // Salida: 116
        System.out.println(sumarImpares(a));
        System.out.println(ContarPar(a));
        System.out.println(ContarImpar(a));
    }

    public static int sumarPares(int[] array) {
        int suma = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int sumarImpares(int[] array) {
        int suma2 = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                suma2 += i;
            }
        }
        return suma2;
    }

    public static int ContarPar(int[] array) {
        int contadorPar = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                contadorPar++;
            }
        }
        return contadorPar;
    }

    public static int ContarImpar(int[] array) {
        int contadorImpar = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                contadorImpar++;
            }
        }
        return contadorImpar;
    }
}
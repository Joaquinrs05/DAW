package Programacion.Arraysymatrices;

import java.util.Scanner;

public class Numerosprimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j, num, cont_prim;
        boolean primo;

        cont_prim = 0;
        System.out.println("Ingrese un numero:");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            // con esto ejecutamos un bucle y ahcemos que mire todo el array
            primo = true;
            j = 2;
            while (j <= i - 1 && primo == true) {// este while es para ver si el numero es par o no
                if (i % j == 0) {
                    primo = false;
                    j++;
                }
            }
            if (primo == true) {
                cont_prim++;
                System.out.println(i + "es primo");
            }
        }
        System.out.println("en el rango " + num + " hay " + cont_prim + " numeros primos");
        input.close();
    }

}

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int programa = 1;
        int errores = 0;
        int planteamientos = 0;
        int completado = 0;
        // Progrmacion algoritmica
        // Sistema de ayuda al desarrollo de software mediante C++
        // estadisticas: errores de codigo, planteamientos, programas realizados
        while (programa == 1 || programa == 2) {
            programa = 0;
            System.out.println("¿Qué desea hacer?");
            System.out.println("1 Realizar Softwre");
            System.out.println("2 Mostrar estadísticas");
            System.out.println("3 Salir");

            System.out.print("Elige una opción: ");
            int opcion = input.nextInt();

            if (opcion == 1) {
                System.out.println("Vamos a realizar el planteo del programa");
                planteamientos++;
                System.out.println("Abrimos el compilador y empezamos a programar");
                System.out.println("¿Tengo dudas?");
                String respuesta1 = input.next();

                if (respuesta1.compareTo("Si") == 0) {
                    System.out.println("repaso la teoria y vuelvo a programar");
                    programa = 1;
                } else {
                    System.out.println("Pulsa la tecla para compilar");
                    System.out.println("¿Hay algun error?");
                    errores++;

                    String respuesta2 = input.next();
                    if (respuesta2.compareTo("Si") == 0) {
                        System.out.println("Corrijo el codigo fuente");
                        programa = 1;
                    } else {
                        System.out.println("Ejecuto el programa");
                        System.out.println("¿Realiza completamente su funcion?");

                        String respuesta3 = input.next();
                        if (respuesta3.compareTo("No") == 0) {
                            System.out.println("¿Es un error de planteamiento?");

                            String respuesta4 = input.next();
                            if (respuesta4.compareTo("No") == 0) {
                                System.out.println("Corrijo el codigo fuente");
                                programa = 1;
                            } else {
                                System.out.println("Volvemos a plantear el programa");
                                programa = 1;
                            }

                        } else {
                            System.out.println("Guardo el codigo fuente");
                            System.out.println("Cierro el compilador");
                            completado++;
                            programa = 1;
                        }
                    }

                }
            }
            if (opcion == 2) {
                System.out.println("Las estadisticas son ");
                System.out.println("Errores de codigo: " + errores);
                System.out.println("Plateamientos: " + planteamientos);
                System.out.println("Programas realizados: " + completado);
                programa = 1;
            }

        }

        input.close();
    }
}

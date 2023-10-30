import java.util.Scanner;

public class Triaje {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 1;
        String respuesta1 = "", respuesta2 = "", respuesta3 = "", respuesta4 = "", respuesta5 = "", respuesta6 = "";
        int iverde = 0;
        int irojo = 0;
        int iamarillo = 0;
        int inegro = 0;

        while (opcion == 1 || opcion == 2) {
            opcion = 0;
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Realizar triaje");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");

            System.out.print("Elige una opción: ");
            opcion = input.nextInt();

            if (opcion == 1) {
                System.out.println("Rensponda las siguientes preguntas");
                System.out.println("¿Puede Caminar?");
                respuesta1 = input.next();
                if (respuesta1.compareTo("Si") == 0) {
                    System.out.println("Prioridad 3, verde");
                    iverde++;
                } else {
                    System.out.println("¿Respira?");// Preguntamos si puede respirar
                    respuesta2 = input.next();
                    if (respuesta2.compareTo("Si") == 0) {
                        // Si la respuesta es si continuamos hacia la derecha y seguimos haciendo
                        // preguntas.
                        System.out.println("¿Su fr es mayor a 30?");
                        respuesta3 = input.next();
                        if (respuesta3.compareTo("Si") == 0) {
                            System.out.println("Prioridad 1, rojo");
                            irojo++;
                        } else {
                            System.out.println("¿Tiene Pulso radical?");
                            respuesta4 = input.next();
                            if (respuesta4.compareTo("Si") == 0) {
                                System.out.println("¿Esta orientado?");
                                respuesta5 = input.next();
                                if (respuesta5.compareTo("Si") == 0) {
                                    System.out.println("Prioridad 2, Amarillo");
                                    iamarillo++;
                                } else {
                                    System.out.println("Prioridad 1, rojo");
                                    irojo++;
                                }
                            } else {
                                System.out.println("Prioridad 1, Rojo");
                                System.out.println("Controle la Hemorragia");
                                irojo++;
                            }
                        }

                    } else {
                        System.out.println("¿Al posicionar puede respirar?");
                        respuesta6 = input.next();
                        if (respuesta6.compareTo("Si") == 0) {
                            System.out.println("Prioridad 1, rojo");
                            irojo++;
                        } else {
                            System.out.println("prioridad 0, negro");
                            inegro++;
                        }
                    }
                }
            }

            if (opcion == 2) {
                System.out.println("Las estadisticas son las siguientes: ");
                System.out.println(" Los pacientes urgentes son: " + irojo);
                System.out.println(" Los pacientes medio urgentes son: " + iamarillo);
                System.out.println(" Los pacientes poco urgentes son: " + iverde);
                System.out.println(" Los pacientes muertos: son  " + inegro);
            }
        }
        System.out.println("Adios");
        input.close();
    }
}
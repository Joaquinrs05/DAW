import java.util.Scanner;

public class Diagtmr0 {
    public static void main(String[] args) {
        System.out.println("Habilitar inte. por TMR0 GIE = T0IE = 1\n Cargar registra auxiliar Reg1 con d'45");
        int reg100 = 1;
        int reg216 = 1;
        Scanner input = new Scanner(System.in);
        while (reg100 == 1) {
            reg100 = 0;
            System.out.println("Cargar registro auxuliar reg2 con 100");

            while (reg216 == 1) {
                reg216 = 0;
                System.out.println("Cargar tmr0 con d216");
                System.out.println("TMR0 Bit87 =0?");
                String registro1 = input.nextLine();
                if (registro1.compareToIgnoreCase("No") == 0) {
                    reg216 = 1;
                } else if (registro1.compareToIgnoreCase("Si") == 0) {
                    System.out.println("Hace reg2 -1");
                    System.out.println("reg2 = 0?");
                    String registro2 = input.nextLine();

                    if (registro2.compareToIgnoreCase("No") == 0) {
                        reg216 = 1;
                    } else if (registro2.compareToIgnoreCase("Si") == 0) {
                        System.out.println("Hace reg1-1");
                        System.out.println("Reg1 = 0?");
                        String registro3 = input.nextLine();

                        if (registro3.compareToIgnoreCase("No") == 0) {
                            reg100 = 1;
                            reg216 = 1;
                        } else if (registro3.compareToIgnoreCase("Si") == 0) {
                            System.out.println("Continua con el programa principal\n Fin");
                        }
                    }
                }
            }
        }
        input.close();
    }
}

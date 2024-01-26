
import java.util.Scanner;

public class Diagramas_Flujo {
    public static void main(String[] args) {

        Menu();

    }

    public static void Menu() {
        int opcion = 1;

        while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
            Scanner input = new Scanner(System.in);
            System.out.println(
                    "----------------------------------------\n1.- Diagrama Web\n2.- Diagrama Vertical\n3.- Diagrama Problemas\n4.- Diagrama Soporte\n5.- Salir\n----------------------------------------\n");
            opcion = Integer.valueOf(input.nextLine());
            input.close();

            if (opcion == 1) {
                Protocolo1();
            } else if (opcion == 2) {
                Protocolo2();
            } else if (opcion == 3) {
                Protocolo3();
            } else if (opcion == 5) {
                System.out.println("Hasta la proxima!!\nSaliendo...");
                opcion = 0;
            }
        }
    }

    public static void Protocolo1() {
        int inicio = 1;
        String sRes;
        System.out.println(
                "Recruiting...\nHiring Manager gets personal request APPROVED\nCreade Ad placement to post on website and Job Portals");

        while (inicio == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Recive and send resumes to hiring Manager for review\nSuitable candidate found? (s/n)");
            sRes = sc.nextLine();

            if (sRes.compareToIgnoreCase("s") == 0) {
                System.out.println(
                        "Coordinate applicant interview process\n Coordinate additional Screening if necessary\nIf applicant passes screening create offer letter / determine start date\nApliccant accepts offer? (s/n)");
                sRes = sc.nextLine();

                if (sRes.compareTo("s") == 0) {
                    System.out.println("On-Boarding...");
                } else {
                    System.out.println("Continue running Ad...");
                    inicio = 1;
                }
            } else {
                System.out.println("Continue running Ad...");
                inicio = 1;
            }
            sc.close();
        }
    }

    public static void Protocolo2() {
        Scanner sc = new Scanner(System.in);
        int inicio = 1;

        System.out.println("Inicio\nHabilitar Inte. por TMR0 GIE = T0IE = 1\nCargar registro auxiliar Reg1 con d'45'");

        while (inicio == 1) {
            System.out.println("Cargar registro auxiliar Reg2 con d'100'");

            while (inicio == 2) {
                System.out.println("cargar TMR0 con d'216'");

                while (inicio == 3) {
                    System.out.println("TMR0 Bit7 = 0? (s/n)");
                    String sRes = sc.nextLine();

                    if (sRes.compareTo("s") == 0) {
                        System.out.println("Hace Reg2 - 1\nReg2 = 0? (s/n)");
                        sRes = sc.nextLine();

                        if (sRes.compareTo("s") == 0) {
                            System.out.println("Hace Reg1 - 1\nReg1 = 0? (s/n)");
                            sRes = sc.nextLine();

                            if (sRes.compareTo("s") == 0) {
                                System.out.println("Continua con el programa principal\nFIN");
                                inicio = 0;
                            } else {
                                inicio = 1;
                            }
                        } else {
                            inicio = 2;
                        }

                    } else {
                        inicio = 3;
                    }
                }
            }
        }
        sc.close();
    }

    public static void Protocolo3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Funciona? (s/n)");
        String sRes = sc.nextLine();

        if (sRes.compareTo("s") == 0) {
            System.out.println("¡No lo toques!\nSin problemas...");
        } else {
            System.out.println("¿Lo tocaste? (s/n)");
            sRes = sc.nextLine();

            if (sRes.compareTo("s") == 0) {
                System.out.println("¡La cagaste!\n¿Lo sabe alguien? (s/n)");
                sRes = sc.nextLine();

                if (sRes.compareTo("s") == 0) {
                    Pobre();

                } else {
                    System.out.println("¡Escondelo!\nSin problemas...");

                }
            } else {
                System.out.println("¿Tendrás Problemas? (s/n)");
                sRes = sc.nextLine();

                if (sRes.compareTo("s") == 0) {
                    Pobre();

                } else {
                    System.out.println("Olvidate del Tema\nSin problemas...");

                }
            }
        }
        sc.close();
    }

    public static void Pobre() {
        int inicio = 1;
        Scanner sc = new Scanner(System.in);
        while (inicio == 1) {
            System.out.println("¡Pobre Imbecil!\n¿Puedes culpar a alguien? (s/n)");
            String sRes = sc.nextLine();

            if (sRes.compareTo("s") == 0) {
                System.out.println("Sin problemas...");
            } else {
                inicio = 0;
            }
        }
        sc.close();
    }

    public static void Protocolo4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inicio");
        int inicio = 1;

        while (inicio == 1) {
            System.out.println(
                    "Buscar una opcion de menu o boton que parezca relacionado con lo que quieres hacer\n¿Encuentras alguno? (s/n)");
            String sRes = sc.nextLine();
            inicio = 3;

            while (inicio == 3) {
                if (sRes.compareTo("s") == 0) {
                    System.out.println("Pulsalo");
                    inicio = 2;

                } else {
                    System.out.println(
                            "Elige uno al azar y pruebalo\nSi encuentras otro escribe 's', si ya no encuentras ninguno mas escribe 'n' (s/n)");
                    sRes = sc.nextLine();

                    if (sRes.compareTo("s") == 0) {
                        inicio = 3;
                    } else {
                        System.out.println(
                                "Busca en Google el nombre del programa junto con algunas palabras relacionadas con lo que se quiere hacer. Seguir las instrucciones");
                        inicio = 2;
                    }
                }

                while (inicio == 2) {
                    System.out.println("¿Ha funcionado? (s/n)");
                    sRes = sc.nextLine();

                    if (sRes.compareTo("s") == 0) {
                        System.out.println("¡Hecho!");
                        inicio = 0;
                    } else {
                        System.out.println("Llevas mas de media hora con esto? (s/n)");
                        sRes = sc.nextLine();

                        if (sRes.compareTo("s") == 0) {
                            System.out.println("Pide ayuda a alguien o rindete");
                            inicio = 0;
                        } else {
                            inicio = 1;
                        }
                    }
                }
            }
        }
        sc.close();
    }
}

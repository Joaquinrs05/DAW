import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // datos
        // pediremos 5 numero por teclado que seram los siguientes
        // la posicion debe ser un positivo mayor o igual a 0
        // la velocidad debe ser un numero entre 1.0 y 100.0
        // la aceleracion inicial sera un numero entre 10.0 y 20.0
        // tiempo un numero entre 10 y 100
        // Se calcularan las formulas tantas veces como tiempo hayamos puesto
        // Energia = "masa * velox * velx"
        // Mostrar velocidad aceleracion posciosion tiemopo enegia
        // Persistncia

        // proceso
        // Ahora usando el scanner tomare numeros para cada variable y despues usando un
        // bucle ejecutare el programa tantas veces como tiempo haya puesto el usuario
        System.out.println("Introduce la posicion");
        int iposX = input.nextInt();
        if (iposX < 0) {
            System.out.println("El numero que has introducido es incorrecto por favor introduzca un numero positivo");
        } else {
            System.out.println("numero introducido, continue");
        }

        System.out.println("Introduce la velocidad");
        float fvelX = input.nextInt();
        if (fvelX < 1.0 || fvelX > 100.0) {
            System.out.println("EL numero es incorrecto por favor introduzca un numero entre el 1 y el 100");
        } else {
            System.out.println("Esta perfecto, continue");
        }

        System.out.println("Introduce la masa");
        int imasa = input.nextInt();
        if (imasa < 1 || imasa > 100) {
            System.out.println("EL numero es incorrecto por favor introduzca un numero entre el 1 y el 100");
        } else {
            System.out.println("Esta perfecto, continue");
        }

        System.out.println("Introduce la aceleracion");
        float facelX = input.nextInt();
        if (facelX < 10.0 || facelX > 20.0) {
            System.out.println("El numero es incorrecto por favor introduzca un numero entre 10 y 20");
        } else {
            System.out.println("perfecto continue");
        }

        System.out.println("Introduce el tiempo");
        int itiempo = input.nextInt();
        if (itiempo < 10 || itiempo > 100) {
            System.out.println("El numero es incorrrecto por favor introduzca un numero del 10 al 100");
        } else {
            System.out.println("Perfecto vamos a realizar los calculos");
        }

        for (int i = 1; i <= itiempo; i++) {
            float posX = iposX + fvelX * i;
            float acelX = fvelX + facelX * i;
            float Energia = imasa * fvelX * fvelX * i;

            // Mostrar velocidad aceleracion posciosion tiemopo enegia

            System.out.println("La velocidad sera: " + fvelX);
            System.out.println("La aceleracion sera: " + acelX);
            System.out.println("La posicion sera: " + posX);
            System.out.println("el tiempo sera: " + itiempo);
            System.out.println("La energia sera: " + Energia);

        }

        input.close();
    }
}

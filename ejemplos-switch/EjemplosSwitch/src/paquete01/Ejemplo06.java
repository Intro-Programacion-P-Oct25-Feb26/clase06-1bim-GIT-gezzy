package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejemplo06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la placa del vehiculo");
        String placa = entrada.nextLine();
        placa = placa.toUpperCase();
        String inicial = placa.substring(0, 1);

        switch (inicial) {
            case "G":
                System.out.printf("Acceso correcto");
                break;

            case "P":
                System.out.printf("Acceso correcto");
                break;

            default:
                System.out.println("Acceso incorrecto");
                break;

        }
    }
}

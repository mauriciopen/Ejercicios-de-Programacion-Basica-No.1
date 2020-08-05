
import java.util.Scanner;


public class ElColectivo {

    public static void main(String[] args) {
        int capacidad_colectivo = 0;
        int viajes = 0;
        double pago_pasajeros = 0;
        double pago_conductor = 0;
        int numero_turistas = 0;
        int opc = 0;
        boolean rep = false;
        boolean error = false;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Ingrese la capacidad del colectivo");
            do {
                capacidad_colectivo = reader.nextInt();
                if (capacidad_colectivo == 0) {
                    System.out.println("La capacidad no puede ser 0,  intente de nuevo");
                }
            } while (capacidad_colectivo == 0);
            System.out.println("Ingrese el numero de turistas");
            numero_turistas = reader.nextInt();
            viajes = numero_turistas / capacidad_colectivo;
            pago_pasajeros = numero_turistas * 10000;
            pago_conductor = viajes * 2000;
            System.out.println("Se necesitan " + String.valueOf(viajes) + " viajes");
            System.out.println("Los pasajeros deben pagar " + String.valueOf(pago_pasajeros));
            System.out.println("el conductor debe pagar al propietario " + String.valueOf(pago_conductor));
            do {
                error = false;
                System.out.println("¿Desea volver a intertarlo?\n"
                        + "(1)Si\n"
                        + "(2)No");
                opc = reader.nextInt();
                switch (opc) {
                    case 1:
                        rep = true;
                        break;
                    case 2:
                        rep = false;
                        break;
                    default:
                        error = true;
                        System.out.println("Opcion invalida");
                }
            } while (error);

        } while (rep);

    }

}

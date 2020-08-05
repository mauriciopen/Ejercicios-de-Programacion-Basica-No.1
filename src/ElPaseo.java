
import java.util.Scanner;

public class ElPaseo {

    public static void main(String[] args) {
        int flacos = 0;
        int gordos = 0;
        int dias = 0;
        int buses = 0;
        int platos = 0;
        double costo_platos = 0;
        int num_hab = 0;
        double costo_dia_hab = 0;
        double costo_tot_hab = 0;
        int opc = 0;
        boolean rep = false;
        boolean error = false;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("¿Cuantos esudiantes flacos van?");
            flacos = reader.nextInt();
            System.out.println("¿Cuantos esudiantes gordos van?");
            gordos = reader.nextInt();
            System.out.println("¿Cuantos dias se quedaran?");
            dias = reader.nextInt();
            buses = (int) Math.ceil(((gordos * 2) + flacos) / 60);
            if (buses == 0) {
                buses = 1;
            }
            platos = ((gordos * 5) + (flacos * 3)) * dias;
            costo_platos = platos * 10000;
            num_hab = (gordos + flacos) / 4;
            costo_dia_hab = num_hab * 25000;
            costo_tot_hab = costo_dia_hab * dias;
            System.out.println("Se necesitan " + String.valueOf(buses) + " buses");
            System.out.println("Se serviran " + String.valueOf(platos) + " platos y "
                    + "costaran " + String.valueOf(costo_platos));
            System.out.println("Se necesitaran " + String.valueOf(num_hab) + " habitaciones, por dia costaran "
                    + String.valueOf(costo_dia_hab) + " y su costo total sera " + String.valueOf(costo_tot_hab));
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

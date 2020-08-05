
import java.util.Scanner;

public class DistanciaPuntos {

    public static void main(String[] args) {
        double t1 = 0;
        double g1 = 0;
        double t2 = 0;/*Se declaran variables*/
        double g2 = 0;
        double distancia = 0;
        boolean rep = false;
        boolean error = false;
        int opc = 0;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Ingrese la latitud de la primera ciudad");
            t1 = reader.nextDouble();
            System.out.println("Ingrese la longitud de la primera ciudad");
            g1 = reader.nextDouble();
            System.out.println("Ingrese la latitud de la segunda ciudad");/*Se leen los datos*/
            t2 = reader.nextDouble();
            System.out.println("Ingrese la longitud de la segunda ciudad");
            g2 = reader.nextDouble();
            distancia = Math.abs(6371.07 * Math.acos(Math.sin(t1)) * (Math.sin(t2)
                    + Math.cos(t1)) * Math.cos(t2) * Math.cos(g1 - g2));
            System.out.println("La distancia entre las dos ciudades es: " + String.valueOf(distancia));
            do {
                error = false;
                System.out.println("¿Desea calcular otra distancia?\n"
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
            } while (error);/*Asegura que se escoja una opcion valida*/
        } while (rep);/*Se repetira todo el boloque de codigo mientras rep=true*/
    }
}

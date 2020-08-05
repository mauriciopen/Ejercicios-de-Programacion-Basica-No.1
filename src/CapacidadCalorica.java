
import java.util.Scanner;

public class CapacidadCalorica {
    public static void main(String[] args) {
        double C = 4.186;
        double m = 0;
        double t1 = 8.8; /*Temperatura ambiente del agua*/
        double t2 = 0;
        double q = 0;
        int opc = 0;         /*Se declaran variables*/
        boolean rep=false;
        boolean error = false;
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("Ingrese la masa (g)");
            m = reader.nextDouble();
            System.out.println("Ingrese la temperatura (C°) ");
            t2 = reader.nextDouble();
            q = C*m*(t2-t1);
            System.out.println("La energia  necesaria para alcanzar la temperatura deseada es: "+ 
                    String.valueOf(q));
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
            } while (error);/*Asegura que se escoja una opcion valida*/
        }while(rep);
        
    }
    
}


import java.util.Scanner;


public class ViajeSasaima {
    public static void main(String[] args) {
        double capacidad_camion = 0;
        double distancia = 79; /*en km*/
        double precio_gasolina = 10000;
        double por_km = 0;
        double carga = 0;
        int viajes = 0;
        double gasto_gasolina = 0;
        double costo_gasolina = 0;
        int opc = 0;
        boolean rep = false;
        boolean error = false;
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("¿Cual es la capacidad del camion?");
            do{
            capacidad_camion = reader.nextDouble();
            if(capacidad_camion == 0){
                System.out.println("La capacidad no puede ser 0,  intente de nuevo");
            }
            }while(capacidad_camion == 0);
            System.out.println("¿Cuanto pesa la carga?");
            carga = reader.nextDouble();
            System.out.println("¿Cuantos galones de gasolina gasta el camion por km?");
            por_km = reader.nextDouble();
            viajes = (int) Math.ceil(carga/capacidad_camion);
            gasto_gasolina = por_km*distancia;
            costo_gasolina = gasto_gasolina*precio_gasolina;
            System.out.println("Se necesitan "+String.valueOf(viajes)+" viajes para transportar la carga");
            System.out.println("Se gastaran "+String.valueOf(gasto_gasolina)+" galones de gasolina y"
                    + " costaran "+String.valueOf(costo_gasolina));
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
        }while(rep);
        
    }
}

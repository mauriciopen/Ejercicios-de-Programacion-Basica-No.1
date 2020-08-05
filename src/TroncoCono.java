
import java.util.Scanner;

public class TroncoCono {
    public static void main(String[] args) {
        double r1 = 0;
        double h1 = 0;
        double r2 = 0;
        double h2 = 0;
        double volumen1 = 0;
        double volumen2 = 0;
        double volumen_tronco = 0;
        int opc = 0;
        boolean rep = false;
        boolean error = false;
        Scanner reader = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese el radio del primer cono");
            r1 = reader.nextDouble();
            System.out.println("Ingrese la altura del primer cono");
            h1 = reader.nextDouble();
            System.out.println("Ingrese el radio del segundo cono");
            r2 = reader.nextDouble();
            System.out.println("Ingrese la altura del segundo cono");
            h2 = reader.nextDouble();
            
            volumen1 = Math.PI*Math.pow(r1, 2)*h1;
            volumen2 = Math.PI*Math.pow(r2, 2)*h2;
            volumen_tronco = Math.abs(volumen1-volumen2);
            
            System.out.println("El volumen del tronco es "+String.valueOf(volumen_tronco));
            
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

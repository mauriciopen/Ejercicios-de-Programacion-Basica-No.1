
import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        double s = 0;
        int n = 0;
        double area = 0;
        int opc = 0;
        boolean rep = false;
        boolean error = false;
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("Ingrese la longitud del lado");
            s = reader.nextDouble();
            System.out.println("Ingrese el numero de lados");
            n = reader.nextInt();
            area = (n*Math.pow(s, 2))/(4*Math.tan(Math.PI/n));
            System.out.println("El area del poligono es: "+String.valueOf(area));
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
        }while (rep);            
    }
}

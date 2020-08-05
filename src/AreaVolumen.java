
import java.util.Scanner;


public class AreaVolumen {
    public static void main(String[] args) {
        double r = 0;
        double area = 0;
        double volumen = 0;
        boolean rep =false;
        boolean error=false;
        int opc = 0;
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("Ingrese el radio: ");
            r = reader.nextDouble();
            area = Math.PI*Math.pow(r, 2);
            volumen = (4/3)*Math.PI*Math.pow(r, 3);
            System.out.println("El area del circulo es: "+String.valueOf(area));
            System.out.println("El volumen de la esfera es: "+String.valueOf(volumen));
            do{
                error = false;
                System.out.println("¿Desea ingresar otro radio?\n"
                        + "(1)Si\n"
                        + "(2)No");
                opc = reader.nextInt();
                switch(opc){
                    case 1: rep = true; break;
                    case 2: rep = false; break;
                    default:
                        System.out.println("Opcion invalida");
                        error = true;
                }
            }while(error);
            
        }while(rep);
    }
}

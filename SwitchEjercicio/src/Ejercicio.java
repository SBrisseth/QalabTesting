import java.util.Scanner;
public class Ejercicio {
    public static void main (String[] args){
        //Cambio desde interfaz web
        // Editando desde la github web
        int op; // declaracion de la variable opcion
        String nombre, apellido;
       
        Scanner cmd = new Scanner(System.in);
        System.out.println("Ingrese la opcion :");
        op = cmd.nextInt();
        //op=0; // inicializamos la variable

        switch(op){ //case
            case 0:
                System.out.println("Haz marcado la opcion Llamar");
                break;
            case 1:
                System.out.println("Haz marcado la opcion Enviar");
                break;
            case 2:
                System.out.println("Haz marcado la opcion Apagar");
                break;
            case 3:
                System.out.println("Haz marcado la opcion Reiniciar");
                break;
            case 4:
                System.out.println("Haz marcado la opcion Autodestruir");
                break;
            case 5:
                System.out.println("Opcion Modificada");
            default:
                System.out.println("Pruebe las otras opciones");

        }

    }
}

import org.w3c.dom.events.EventException;

public class App {
    public static void main(String[] args) throws Exception {
        String nombreP1;
        nombreP1 = "Guadalupe Espino";
        int edadP1 = 25;
        boolean esMayorEdadP1 = true;
        String generoP1 = "Femenino";

        System.out.println("Antes de la division");
        try {
            int var = 50 / 0;
        } catch (EventException e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("Un mensaje");

        // if (edadP1 >= 18) {
        //     esMayorEdadP1 = true;
        // }


        // String nombreP2 = "David Hernandez";
        // int edadP2 = 5;
        // boolean esMayorEdadP2 = false;
        // String generoP2 = "Masculino";

        // if (edadP2 >= 18) {
        //     esMayorEdadP2 = true;
        // } else {
        //     esMayorEdadP2 = false;
        // }

        // String nombreP3 = "Erendira";
        // int edadP3 = 20;
        // boolean esMayorEdadP3 = false;
        // String generoP3 = "Mujer";

        // if (edadP3 >= 18) {
        //     esMayorEdadP3 = true;
        // } else {
        //     esMayorEdadP3 = false;
        // }
    }
}

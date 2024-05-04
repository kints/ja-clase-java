public class Ciclos {
    public static void main(String[] Args) {

        // Cuidado con ciclos infitos

        // for (int iterador1 = 0; iterador1 < 5; iterador1++) {
        // if (iterador1 % 2 == 0) {
        // continue;
        // }
        // for (int j = 10; j > 5; j--) {
        // if (j == 7) {
        // return 0;
        // }
        // System.out.println("Valor i: " + iterador1 + " Valor j: " + j);
        // }

        // }
        // String concatenar = "";
        // // a veces tenemos que hacer una validación antes de ejecutar las operaciones
        // do {
        // concatenar += "a";
        // System.out.println("Con la candena a: " + concatenar.length());
        // System.out.println("Contenido cadena: " + concatenar);
        // } while (concatenar.length() < 5);

        // String concatenar = "";
        // while (concatenar.length() < 5) {
        //     concatenar += "a";

        //     System.out.println("Con la candena a: " + concatenar.length());
        //     System.out.println("Contenido cadena: " + concatenar);
        // }
        // System.out.println("Fin del codigo");
        //Arreglo de Strings
        String[] nombres = {"Arturo","Desiree","Marel","Francisco","María","Alberto"};
        //recorrer los nombres 
        
        // for (int o = 0; o < nombres.length; o++){
        //     System.out.println("En posición: " + o + " nombre: " + nombres[o]);
        // }
        
        //recorrer nombres sin iterador, se mueve automáticamente por el arreglo
        // for (String iteradorNombre : nombres) {
        //     System.out.println(iteradorNombre);
        // }
        int size1Dim = 6;
        int size2Dim = 4;
                //pintar todos los valores del arreglo de 2 dim cada renglon por primera dimension 
        int[][] arreglo2Dim = new int[size1Dim][size2Dim];
        for (int primeraDim = 0; primeraDim < arreglo2Dim.length ; primeraDim++) {
            for( int segundaDim = 0 ; segundaDim < arreglo2Dim[0].length; segundaDim++){
                arreglo2Dim[primeraDim][segundaDim] = primeraDim;
            }
        }

        String valoresDimencion = "";
        for (int primeraDim = 0; primeraDim < arreglo2Dim.length ; primeraDim++) {
            valoresDimencion = "Dimension " + primeraDim + "valores: ";
            for(int segundaDim = 0 ; segundaDim < arreglo2Dim[0].length; segundaDim++){
                valoresDimencion += arreglo2Dim[primeraDim][segundaDim] + " ";
            }
            System.out.println(valoresDimencion);
        }
    }
}
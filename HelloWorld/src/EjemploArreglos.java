public class EjemploArreglos {
  public static void main(String[] args) {
    //Arreglo de Strings
    // String[] nombres = {"Arturo","Desiree","Marel","Francisco","María","Alberto"};
    // //recorrer los nombres 
    // for (int iteradorNombres = 0; iteradorNombres < nombres.length; iteradorNombres++){
    //     System.out.println("En posición: " + iteradorNombres + " nombre: " + nombres[iteradorNombres]);
    // }
    //int i = 0;
    //recorrer nombres sin iterador, se mueve automáticamente por el arreglo
    // for (String iteradorNombre : nombres) {
    //   i++;  
    //   if (i % 2 == 0) {
    //       continue;
    //     }
        
    //     System.out.println(iteradorNombre);
    // }


    int[][] arreglo2Dim = new int[6][10];
    //poner el valor de cada primera dimension en todos los valores de la segunda dimension
    for (int primeraDim = 0; primeraDim < 5 ; primeraDim++) {
        for( int segundaDim = 0 ; segundaDim < 5; segundaDim++){
            arreglo2Dim[primeraDim][segundaDim] = primeraDim;
            System.out.println(arreglo2Dim[primeraDim][segundaDim]);
        }
    }
    System.out.println(arreglo2Dim[0].length);

    
  }
}

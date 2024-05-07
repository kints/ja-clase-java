public enum GeneroPersona {
    MASCULINO,
    FEMENINO;
 
}

public static void main(String[] Args){
    GeneroPersona genero = GeneroPersona.MASCULINO;

    switch (genero){
        case MASCULINO:
            System.out.println("Soy Masculino");
            break;
            case FEMENINO:
            System.out.println("Soy Femenino");
            break;
            default:
            System.out.println("No identificado");    
    }
}


// {
// }
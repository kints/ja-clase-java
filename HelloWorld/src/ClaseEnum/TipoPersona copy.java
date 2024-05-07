public enum GeneroPersona {
    MASCULINO("Masculino"),
    FEMENINO("Femenino");

    public final String label;
    
    private GeneroPersona(String label){
        this.label = label;
    }
}

public static void main(String[] Args){
    GeneroPersona genero = GeneroPersona.MASCULINO;

    System.out.println(genero.label)

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
//Casa.java (version SIN Builder)

public class CasaIncorrecta {

    //Atributos obligatorios
    private String direccion;
    private int habitaciones;

    //Atributos opcionales
    private int banos;
    private int pisos;
    private boolean tienePiscina;
    private boolean tieneGaraje;
    private boolean tieneJardin;
    private boolean tieneChimenea;

    //Constructor 1: solo lo obligatorio
    public CasaIncorrecta(String direccion, int habitaciones){
        this.direccion = direccion;
        this.habitaciones = habitaciones;
    }

    //Constructor 2: obligatorios + baños y pisos
    public CasaIncorrecta(String direcciion, int habitaciones, int banos, int pisos){
        this(direcciion, habitaciones); // reutiliza el constructor anterior
        this.banos = banos;
        this.pisos = pisos;
    }

    //Constructor 3 : lo anterior + piscina + garaje
    public CasaIncorrecta(String direcciion, int habitaciones, int banos, int pisos,
                boolean tienePiscina, boolean tieneGaraje){
        this(direcciion, habitaciones, banos, pisos);
        this.tienePiscina = tienePiscina;
        this.tieneGaraje = tieneGaraje;
    }

    // Constructor 4: todos los atributos
    public CasaIncorrecta(String direccion, int habitaciones, int banos, int pisos,
                boolean tienePiscina, boolean tieneGaraje,
                boolean tieneJardin, boolean tieneChimenea) {
        this(direccion, habitaciones, banos, pisos, tienePiscina, tieneGaraje);
        this.tieneJardin = tieneJardin;
        this.tieneChimenea = tieneChimenea;
    }

     @Override
    public String toString() {
        return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones
                + ", baños=" + banos + ", pisos=" + pisos
                + ", piscina=" + tienePiscina + ", garaje=" + tieneGaraje
                + ", jardín=" + tieneJardin + ", chimenea=" + tieneChimenea + "]";
    }
}

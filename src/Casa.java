public class Casa {

    //Atributos obligatorios.
    //Ahora son "final": una vez construida la casa, ya no cambian (Objeto inmutable).
    private final String direccion;
    private final int habitaciones;

    //Atributos opcionales
    private final int banos;
    private final int pisos;
    private final boolean tienePiscina;
    private final boolean tieneGaraje;
    private final boolean tieneJardin; 
    private final boolean tieneChimenea;

    //Constructor PRIVADO : nadie fuera de esta clase puede hacer "new Casa()".
    //Recibe el builder y copia sus valores. Es el único constructor que existe.
    private Casa(Builder builder){
        this.direccion = builder.direccion;
        this.habitaciones = builder.habitaciones;
        this.banos = builder.banos;
        this.pisos = builder.pisos;
        this.tienePiscina = builder.tienePiscina;
        this.tieneGaraje = builder.tieneGaraje;
        this.tieneJardin = builder.tieneJardin;
        this.tieneChimenea = builder.tieneChimenea;
    }

    @Override
    public String toString() {
        return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones
                + ", baños=" + banos + ", pisos=" + pisos
                + ", piscina=" + tienePiscina + ", garaje=" + tieneGaraje
                + ", jardín=" + tieneJardin + ", chimenea=" + tieneChimenea + "]";
    }

    //CLASE BUILDER (interna y estática)
    //"static" permite usarla sin tener antes una Casa : new Casa.Builder()

    public static class Builder{
        //Obligatorios (valor por constructor)
        private final String direccion;
        private final int habitaciones;

        //Opcionales (Inicializan con un valor por defecto)
        //Así, si el usuario no los llama, la casa igual queda válida.
        private int banos = 1;
        private int pisos = 1;
        private boolean tienePiscina = false;
        private boolean tieneGaraje = false;
        private boolean tieneJardin = false;
        private boolean tieneChimenea = false;

        //El constructor del builder pide solo lo obligatorio.
        //Esto garantiza que nunca exista una casa sin dirección ni habitaciones.
        public Builder(String direccion, int habitaciones){
            this.direccion = direccion;
            this.habitaciones = habitaciones;
        }

        //Cáda método opcional : asigna el valor y devuelve "this" (el mismo builder).
        //Devolver "this" es lo que permite encadenar : .banos(2).pisos(2).
        public Builder banos(int banos){
            this.banos = banos;
            return this;
        }

        public Builder pisos(int pisos){
            this.pisos = pisos;
            return this;
        }

        public Builder conPiscina() {
            this.tienePiscina = true;
            return this;
        }

        public Builder conGaraje() {
            this.tieneGaraje = true;
            return this;
        }

        public Builder conJardin() {
            this.tieneJardin = true;
            return this;
        }

        public Builder conChimenea() {
            this.tieneChimenea = true;
            return this;
        }

        //build() : Valida y entrega la casa terminada.
        public Casa build(){
            if (direccion == null || direccion.isBlank()){
                throw new IllegalStateException("La casa necesita una dirección");
            }
            if (habitaciones < 1){
               throw new IllegalStateException("La casa necesita al menos 1 habitación"); 
            }
            return new Casa(this); //se le pasa el Builder al constructor privado.
        }

    }
}

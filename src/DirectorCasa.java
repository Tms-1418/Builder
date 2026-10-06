// DirectorCasa.java
public class DirectorCasa {

    // Receta 1: Mansión.
    // Recibe solo lo que cambia entre una mansión y otra (la dirección).
    // Todo lo demás es la "receta" fija de una mansión.
    public Casa construirMansion(String direccion) {
        return new Casa.Builder(direccion, 6)   // 6 habitaciones
                .banos(5)
                .pisos(3)
                .conPiscina()
                .conGaraje()
                .conJardin()
                .conChimenea()
                .build();
    }

    // Receta 2: Casa de campo.
    public Casa construirCasaDeCampo(String direccion) {
        return new Casa.Builder(direccion, 3)
                .banos(2)
                .pisos(1)
                .conJardin()
                .conChimenea()
                .build();
    }

    // Receta 3: Apartaestudio.
    // Fíjate que aquí NO llamamos ningún método opcional:
    // se usan los valores por defecto (1 baño, 1 piso, sin extras).
    public Casa construirApartaestudio(String direccion) {
        return new Casa.Builder(direccion, 1)
                .build();
    }
}
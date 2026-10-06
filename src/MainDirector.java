// MainDirector.java  (uso del Director)
public class MainDirector {
    public static void main(String[] args) {

        // Creamos el Director una sola vez
        DirectorCasa director = new DirectorCasa();

        // Una línea por casa: no hay que recordar qué lleva cada tipo
        Casa mansion = director.construirMansion("Alto de las Palmas");
        Casa campo = director.construirCasaDeCampo("Vereda El Roble");
        Casa estudio = director.construirApartaestudio("Carrera 13 #50-20");

        System.out.println(mansion);
        System.out.println(campo);
        System.out.println(estudio);

        // El Builder sigue disponible para casos a medida.
        // Por ejemplo: una mansión, pero sin piscina.
        Casa personalizada = new Casa.Builder("Calle 80 #20-10", 6)
                .banos(4)
                .pisos(2)
                .conGaraje()
                .conJardin()
                .build();

        System.out.println(personalizada);
    }
}
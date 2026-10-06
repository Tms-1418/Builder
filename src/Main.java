public class Main {
    public static void main(String[] args) {
        // ¿Qué significan 3, 2, 2 y los cuatro booleanos? Hay que abrir la clase...
        CasaIncorrecta campestre = new CasaIncorrecta("Vereda El Roble", 3, 2, 2, true, true, true, true);

        // Solo quiero jardín: debo rellenar piscina, garaje, baños y pisos con "basura"
        CasaIncorrecta sencilla = new CasaIncorrecta("Calle 10 #5-20", 2, 0, 0, false, false, true, false);

        // Peor aún: quise 4 habitaciones y 1 baño, pero los puse al revés.
        // Todos son int, así que el compilador NO avisa.
        CasaIncorrecta error = new CasaIncorrecta("Carrera 7 #45-10", 1, 4, 1, false, true, false, false);

        System.out.println(campestre);
        System.out.println(sencilla);
        System.out.println(error);
    }
}

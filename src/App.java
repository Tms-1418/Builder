public class App {
    public static void main(String[] args) throws Exception {
        Casa campestre = new Casa.Builder("Vereda El Roble", 3)
                .banos(2)
                .pisos(2)
                .conPiscina()
                .conGaraje()
                .conJardin()
                .conChimenea()
                .build();                 // build() entrega la casa terminada
    
        Casa sencilla = new Casa.Builder("Calle 10 #5-20", 2)
                .conJardin()
                .build();
                
        Casa corregida = new Casa.Builder("Carrera 7 #45-10", 4)
                .banos(1)
                .conGaraje()
                .build();

        System.out.println(campestre);
        System.out.println(sencilla);
        System.out.println(corregida);
    }
}

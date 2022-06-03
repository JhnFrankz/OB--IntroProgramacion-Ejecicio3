public class Test {
    public static void main(String[] args) {
        sumar(10,20,70);

        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.numeroPuertas);
    }

    public static void sumar(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int numeroPuertas = 4;

    public void agregarPuerta() {
        this.numeroPuertas++;
    }
}
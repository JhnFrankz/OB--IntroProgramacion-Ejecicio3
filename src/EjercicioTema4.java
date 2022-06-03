public class EjercicioTema4 {
    public static void main(String[] args) {

        System.out.println("------ IF ------");
        int numeroif = 12;

        if (numeroif < 0) {
            System.out.println("Es negativo");
        } else if (numeroif > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("El número es 0");
        }

        System.out.println("------ WHILE ------");
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("------ DO WHILE ------");
        int numeroDoWhile = 0;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 1);

        System.out.println("------ FOR ------");
        int numeroFor = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }

        System.out.println("------ SWITCH ------");
        var estacion = "Primavera";

        switch (estacion) {
            case "Invierno":
            case "Verano":
            case "Primavera":
            case "Otoño":
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}

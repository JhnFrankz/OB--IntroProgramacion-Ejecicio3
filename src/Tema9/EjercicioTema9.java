package Tema9;

public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Jhan");
        cliente.setEdad(22);
        cliente.setTelefono("+51 1233213111");
        cliente.setCredito(10000.50);

        System.out.println("DATOS CLIENTE:" +
                "\nNombre: " + cliente.getNombre() +
                "\nEdad: " + cliente.getEdad() +
                "\nTeléfono: " + cliente.getTelefono() +
                "\nCrédito: " + cliente.getCredito());


        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Pepe");
        trabajador.setEdad(26);
        trabajador.setTelefono("+51 1111111111");
        trabajador.setSalario(20000.50);

        System.out.println("DATOS TRABAJADOR:" +
                "\nNombre: " + trabajador.getNombre() +
                "\nEdad: " + trabajador.getEdad() +
                "\nTeléfono: " + trabajador.getTelefono() +
                "\nCrédito: " + trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}



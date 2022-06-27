public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(36);
        cliente.setNombre("Eva Luna");
        cliente.setTelefono(123456789);
        cliente.setCredito(500000);
        System.out.println("El cliente(a): "+cliente.getNombre()+" con edad: "+cliente.getEdad()+" y teléfono: "+cliente.getTelefono()+" tiene un crédito de "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(26);
        trabajador.setNombre("Samantha");
        trabajador.setTelefono(666987654);
        trabajador.setSalario(15000000);
        System.out.println("El trabajador(a): "+trabajador.getNombre()+" con edad: "+trabajador.getEdad()+" y teléfono: "+trabajador.getTelefono()+" tiene un salario de "+trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() { return this.credito; }

    public void setCredito(int credito) { this.credito = credito; }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() { return this.salario; }

    public void setSalario(int salario) { this.salario = salario; }
}
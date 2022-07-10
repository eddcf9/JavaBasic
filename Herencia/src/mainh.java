package src;

public class mainh {
    public static void main(String [] args) {

        Cliente cl = new Cliente();
        Trabajador tr = new Trabajador();

        cl.setNombre("Eduardo");
        cl.setEdad(23);
        cl.setTelefono(556213478);
        cl.setCredito(15000);
        tr.setSalario(18000);

        System.out.println("Nombre: " +cl.getNombre());
        System.out.println("Edad: "+cl.getEdad());
        System.out.println("Telefono: "+cl.getTelefono());
        System.out.println("Credito: "+cl.getCredito());
        System.out.println("Salario: "+tr.getSalario());
    }
}

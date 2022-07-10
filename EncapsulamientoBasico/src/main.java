
public class main {

    public static void main(String[] args) {

        Persona per = new Persona();

        per.setNombre("Eduardo");
        per.setEdad(23);
        per.setTelefono(554321986);

        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Edad: " + per.getEdad());
        System.out.println("Telefono: " + per.getTelefono());

    }
    
}
